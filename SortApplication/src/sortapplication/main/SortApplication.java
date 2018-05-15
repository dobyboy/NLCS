/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapplication.main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import sortapplication.model.MoveThread;
import sortapplication.model.RunTemp;

/**
 *
 * @author Truong Giang
 */
public class SortApplication {

    private final JLabel[] array;
    private JLabel[] arrayDefault;
    private final int[] array_temp;
    private final int pan;
    private JLabel lbstt, lbI, lbJ, lbkc;
    private JButton btn1, btn2;
    private int index;

    public SortApplication(JLabel array[], int array_temp[], int pan, int index, JLabel lbstt, JLabel lbI, JLabel lbJ, JLabel lbkc, JButton btn1, JButton btn2) {
        this.array = array;
        this.pan = pan;
        this.index = index;
        this.array_temp = array_temp;
        this.lbstt = lbstt;
        this.lbI = lbI;
        this.lbJ = lbJ;
        this.lbkc = lbkc;
        this.btn1 = btn1;
        this.btn2 = btn2;
    }

    public void swap(int a, int b) {
        int temp = array_temp[a];
        array_temp[a] = array_temp[b];
        array_temp[b] = temp;
    }

    //// Selection Sort.............................
    public void SelectionSort(int k) {
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        int i, j, index, temp;
        for (i = 0; i <= array_temp.length - 2; i++) {
            temp = array_temp[i];
            index = i;
            runn.setI(i, array[i]);
            for (j = i + 1; j <= array_temp.length - 1; j++) {
                
                if (k == 1) { // Sắp xếp tăng dần
                    if (array_temp[j] < temp) {
                        runn.setJ(j , array[j]);
                        temp = array_temp[j];
                        index = j;                        
                    }
                } else if (k == 0) { // Sắp xếp giảm dần
                    if (array_temp[j] > temp) {
                        runn.setJ(j , array[j]);
                        temp = array_temp[j];
                        index = j;
                    }
                }
            }
            swap(i, index);
            if (i != index) {
                MoveThread.Swap(array[i], array[index], pan);
            }
        }
        setColor();
        message();
    }

    // Intertion Sort.........................    
    public void IntertionSort(int k) {
        int i, j;
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        for (i = 0; i <= array_temp.length - 1; i++) {
            j = i;
            runn.setI(i, array[i]);
            if (k == 1) {
                while ((j > 0) && (array_temp[j] < array_temp[j - 1])) {
                    runn.setJ(j - 1, array[j]);
                    swap(j, j - 1);
                    MoveThread.Swap_Insert(array[j], array[j - 1], pan);
                    j--;
                }
            } else if (k == 0) {
                while ((j > 0) && (array_temp[j] > array_temp[j - 1])) {
                    runn.setJ(j - 1, array[j]);
                    swap(j, j - 1);
                    MoveThread.Swap_Insert(array[j], array[j - 1], pan);
                    j--;
                }
            }
        }
        setColor();
        message();
    }

    // Bubble Sort...........................
    public void BubbleSort(int k) {
        int i, j;
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        for (i = 0; i <= array_temp.length - 2; i++) {
            runn.setI(i, array[i]);
            for (j = array_temp.length - 1; j >= i + 1; j--) {
                
                if (k == 1) { // sắp xếp tăng dần
                    if (array_temp[j] < array_temp[j - 1]) {
                        runn.setJ(j, array[j]);
                        swap(j, j - 1);
                        MoveThread.Swap(array[j], array[j - 1], pan);
                    }
                } else if (k == 0) {// sắp xếp giảm dần
                    if (array_temp[j] > array_temp[j - 1]) {
                        runn.setJ(j, array[j]);
                        swap(j, j - 1);
                        MoveThread.Swap(array[j], array[j - 1], pan);
                    }
                }
            }
        }
        setColor();
        message();
    }

    /// Shell Sort..................
    public void ShellSort(int t) {
        int k = 1;
        int i, j;
        k = array_temp.length / 2;
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        runn.setK(k, lbkc);
        while (k > 0) {
            for (i = 0; i < array_temp.length; i++) {
                int temp = array_temp[i];
                j = i;
                runn.setI(i, array[i]);
                if (t == 1) { // sắp xếp mảng tăng dần
                    while (j >= k && array_temp[j - k] > temp) {
                        runn.setJ(j - k, array[j]);
                        swap(j, j - k);
                        MoveThread.Swap(array[j], array[j - k], pan);
                        j = j - k;
                    }
                } else if (t == 0) { // sắp xếp mảng giảm dần
                    while (j >= k && array_temp[j - k] < temp) {
                        runn.setJ(j - k, array[j]);
                        swap(j, j - k);
                        MoveThread.Swap(array[j], array[j - k], pan);
                        j = j - k;
                    }
                }

            }
            k = k / 2;
            runn.setK(k, lbkc);
        }
        setColor();
        message();

    }

    // Quick sort
    private int FindPivot(int i, int j) {
        int k;
        k = i + 1;
        int firstkey;
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        firstkey = array_temp[i];
        while (k <= j && array_temp[k] == firstkey) {
            k++;
        }
        if (k > j) {
            return -1;
        }
        if (array_temp[k] > array_temp[i]) {
            runn.setPivot(array_temp[k], lbstt);
            return k;
        }
        runn.setPivot(array_temp[i], lbkc);
        return i;
    }

    private int Partition(int i, int j, int pivot, int sort) {
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        int L, R;
        L = i;
        runn.setI(L, lbI);
        R = j;
        runn.setJ(R, lbJ);
        while (L <= R) {
            if (sort == 1) { //phân hoạch tăng
                while (array_temp[L] < pivot) {
                    L++;
                    runn.setI(L, lbI);
                }
                while (array_temp[R] >= pivot) {
                    R--;
                    runn.setJ(R, lbJ);
                }
            } else if (sort == 0) { //phân hoạch giảm
                while (array_temp[L] >= pivot) {
                    L++;
                    runn.setI(L, lbI);
                }
                while (array_temp[R] < pivot) {
                    R--;
                    runn.setJ(R, lbJ);
                }
            }

            if (L < R) {
                swap(L, R);
                MoveThread.Swap(array[L], array[R], pan);
            }
        }
        runn.setPartition(array[L]);
        return L;
    }

    public void QuickSort(int i, int j, int sort) {
        int pivotindex, pivot, k;
        RunTemp runn = new RunTemp(lbI, lbJ, lbkc);
        pivotindex = FindPivot(i, j);
        if (pivotindex != -1) {
            pivot = array_temp[pivotindex];
            if (sort == 1) {
                k = Partition(i, j, pivot, sort);
                QuickSort(i, k - 1, sort);
                QuickSort(k, j, sort);
            } else if (sort == 0) {
                k = Partition(i, j, pivot, sort);
                QuickSort(i, k - 1, sort);
                QuickSort(k, j, sort);
            }

        }

    }

    public void QuickSort(int i, int j, int sort, int temp) {
        QuickSort(i, j, sort);
    }

    //Thông báo hoàn tất 
    public void message() {
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }

                    lbstt.setText("Đã sắp xếp xong!");
                    lbstt.setFont(new Font("Tahoma", Font.BOLD, 20));
                    lbstt.setForeground(Color.BLACK);
                    Thread.sleep(100);
                    Color m1 = Color.GREEN;
                    Color m2 = Color.RED;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    for (int i = 0; i < 5; i++) {
                        lbstt.setVisible(false);
                        lbstt.setForeground(m1);
                        Thread.sleep(100);
                        lbstt.setVisible(true);
                        Thread.sleep(100);
                    }

                    ManagerThread.threads = null;

                } catch (InterruptedException e) {
                    System.out.println("" + e.getMessage());
                }
            }
        }
        );
        ManagerThread.threads[curFirst].start();
    }

    public void setColor() {
        ManagerThread.curThread++;
        int curFirst = ManagerThread.curThread;
        ManagerThread.threads[curFirst] = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    if (curFirst != 0) {
                        ManagerThread.threads[curFirst - 1].join();
                    }
                    for (int i = 0; i < array.length; i++) {
                        array[i].setBackground(new Color(128, 0, 255));
                    }

                } catch (InterruptedException e) {
                    System.out.println("" + e.getMessage());
                }
            }
        }
        );
        ManagerThread.threads[curFirst].start();
    }

    public void Completed() {
        for (int i = 0; i <= ManagerThread.curThread; i++) {
            ManagerThread.threads[i].resume();
        }
        message();
    }
}
