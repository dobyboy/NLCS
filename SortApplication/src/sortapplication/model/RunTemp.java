/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapplication.model;

import sortapplication.main.ManagerThread;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Truong Giang
 */
public class RunTemp {

    public JLabel lbI, lbJ, lbkc;

    public RunTemp(JLabel lbI, JLabel lbJ, JLabel lbkc) {
        this.lbI = lbI;
        this.lbJ = lbJ;
        this.lbkc = lbkc;
    }
    //Set biến i hoặc biến left trong quick sort
    public void setI(int i, JLabel posI) {        
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    // xét lbI tại i
                    lbI.setText(String.valueOf(i));
                    //đổi màu giá trị xét tại i
                    posI.setBackground(Color.RED);
                    Thread.sleep(ManagerThread.time);
                    // trả lại màu ban đầu
                    posI.setBackground(new Color(16, 216, 183));
                    Thread.sleep(ManagerThread.time);

                } catch (InterruptedException ex) {
                    System.out.println( ""+ ex.getMessage());
                }
            }
        });
        ManagerThread.threads[curFirst].start();
    }
    
    //set biến j hoặc biến right trong quick sort
    public void setJ(int j, JLabel posJ) {
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    // xét lbJ tại j
                    lbJ.setText(String.valueOf(j));
                    //đổi màu giá trị xét tại j
                    posJ.setBackground(Color.RED);
                    Thread.sleep(ManagerThread.time);
                    // trả lại màu ban đầu
                    posJ.setBackground(new Color(16, 216, 183));
                    Thread.sleep(ManagerThread.time);
                } catch (InterruptedException e) {
                    System.out.println("" + e.getMessage());
                }
            }
        });
        ManagerThread.threads[curFirst].start();
    }
    
    // set biến k trong sắp xếp shell sort
    public void setK(int k, JLabel posk){
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    // xét lbkc tại k
                    lbkc.setText(String.valueOf(k));
                    Thread.sleep(ManagerThread.time);
                } catch (InterruptedException ex) {
                    System.out.println("" + ex.getMessage());
                }
            }
        });
        ManagerThread.threads[curFirst].start();
    }
    
    // set màu phần tử được phân hoạch 
    public void setPartition(JLabel lb) {
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    lb.setBackground(Color.GREEN);
                } catch (InterruptedException ex) {
                    System.out.println("" + ex.getMessage());
                }
            }
        });
        ManagerThread.threads[curFirst].start();
    }
    
    //set giá trị pivot tại label pivot
    public void setPivot(int pivot, JLabel posPivot) {
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    // xét lbkc tại pivot
                    lbkc.setText(String.valueOf(pivot));

                    Thread.sleep(ManagerThread.time);
                } catch (InterruptedException ex) {
                    System.out.println("" + ex.getMessage());
                }
            }
        });
        ManagerThread.threads[curFirst].start();
    }
}
