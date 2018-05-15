/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapplication.model;

import java.awt.Color;
import javax.swing.JLabel;
import sortapplication.main.ManagerThread;

/**
 *
 * @author Truong Giang
 */
public class MoveThread {

    // hàm di chuyển
    public static void Swap(JLabel pos1, JLabel pos2, int pan) {
        int lb1 = pos1.getX();
        int lb2 = pos2.getX();
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    // set màu cho phần tử đang xét
                    pos1.setBackground(new Color(255, 128, 0));
                    pos2.setBackground(new Color(255, 128, 0));
                    //Di chuyển pos1 lên , pos2 xuống
                    while (pos1.getY() > 30) {
                        pos1.setLocation(pos1.getX(), pos1.getY() - 2);
                        pos2.setLocation(pos2.getX(), pos2.getY() + 2);
                        Thread.sleep(ManagerThread.time);
                    }
                    // Di chuyển pos1 sang phải, pos2 sang trái
                    while (pos1.getX() < lb2) {
                        pos1.setLocation(pos1.getX() + 5, pos1.getY());
                        pos2.setLocation(pos2.getX() - 5, pos2.getY());
                        Thread.sleep(ManagerThread.time);
                    }
                    // Di chuyển pos1 sang trái pos2 sang phải
                    while (pos2.getX() < lb1) {
                        pos1.setLocation(pos1.getX() - 5, pos1.getY());
                        pos2.setLocation(pos2.getX() + 5, pos2.getY());
                        Thread.sleep(ManagerThread.time);
                    }
                    //Di chuyển pos1 xuống, pos2 lên
                    int location_start = (pan / 2) - 15;
                    while (pos1.getY() < location_start) {
                        pos1.setLocation(pos1.getX(), pos1.getY() + 2);
                        pos2.setLocation(pos2.getX(), pos2.getY() - 2);
                        Thread.sleep(ManagerThread.time);
                    }
                    // cập nhật lại giá trị cho phần tử
                    String val_pos1 = pos1.getText();
                    pos1.setText(pos2.getText());
                    pos2.setText(val_pos1);
                    // cập nhật lại vị trí
                    pos1.setLocation(lb1, location_start);
                    pos2.setLocation(lb2, location_start);
                    pos1.setBackground(new Color(16, 216, 183));
                    pos2.setBackground(new Color(16, 216, 183));

                } catch (InterruptedException e) {
                    System.out.println("hhhh" + e.getMessage());
                }
            }
        }
        );
        ManagerThread.threads[curFirst].start();
    }

    // hàm di chuyển riêng cho Insertion Sort
    public static void Swap_Insert(JLabel pos1, JLabel pos2, int pan) {
        int lb1 = pos1.getX();
        int lb2 = pos2.getX();
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    pos1.setBackground(new Color(255, 128, 0));
                    pos2.setBackground(new Color(255, 128, 0));

                    //Di chuyển pos1 lên , pos2 xuống
                    while (pos1.getY() > 30) {
                        pos1.setLocation(pos1.getX(), pos1.getY() - 2);
                        Thread.sleep(ManagerThread.time);
                    }
                    // Di chuyển pos1 sang trái pos2 sang phải
                    while (pos2.getX() < lb1) {
                        pos1.setLocation(pos1.getX() - 5, pos1.getY());
                        pos2.setLocation(pos2.getX() + 5, pos2.getY());
                        Thread.sleep(ManagerThread.time);
                    }
                    //Di chuyển pos1 xuống, pos2 lên
                    int location_start = (pan / 2) - 15;
                    while (pos1.getY() < location_start) {
                        pos1.setLocation(pos1.getX(), pos1.getY() + 2);
                        Thread.sleep(ManagerThread.time);
                    }
                    // cập nhật lại giá trị phần tử
                    String val_pos1 = pos1.getText();
                    pos1.setText(pos2.getText());
                    pos2.setText(val_pos1);
                    // cập nhật lại vị trí 
                    pos1.setLocation(lb1, location_start);
                    pos2.setLocation(lb2, location_start);
                    // set lại màu ban đầu
                    pos1.setBackground(new Color(16, 216, 183));
                    pos2.setBackground(new Color(16, 216, 183));

                } catch (InterruptedException e) {
                    System.out.println("" + e.getMessage());
                }
            }
        }
        );
        ManagerThread.threads[curFirst].start();
//        
    }
}
