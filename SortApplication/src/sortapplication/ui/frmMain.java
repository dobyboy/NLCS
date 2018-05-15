/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapplication.ui;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import sortapplication.main.ManagerThread;
import sortapplication.main.SortApplication;
import sortapplication.model.Code;
//import sortapplication.model.sortThread;

/**
 *
 * @author Truong Giang
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    // khai báo biến toàn cục
    private JLabel[] array;
    private JLabel[] arrayDefault;
    private int[] array_temp;
    private int index;
    public int pan;
    private boolean isSelected = false;

    //các biến tham chiếu đến Class
    private Code showListCode;
    private SortApplication sort;

    public frmMain() {
        initComponents();
        //khai báo các định dạng cho form
        setLocationRelativeTo(null);
        setSize(1015, 570);
        setResizable(false);
        setBackground(Color.WHITE);

        //Cài đặt model hiện thị giải thuật
        pan = panView_Array.getHeight(); //  Gán giá trị của panel vào pan
        index = Integer.parseInt(combo_value.getSelectedItem().toString()); // set có bao nhiêu phần tử trong mảng
        list_code.setForeground(Color.BLUE); // set màu cho font chữ
        panView_Array.setSize(878, 186);// set size cho khung chứa mảng sắp xếp        
        panView_Array.removeAll();
        panView_Array.add(lbstt);
        showListCode = new Code(list_code); // đưa lớp code vào form main
        rad_Select.doClick();
        radIncrease.doClick();
        showListCode.SelectionSort(list_code, 1);
        // set các button
        btnDele_Array.setEnabled(false);
        btnRandom.setEnabled(false);
        btnSort.setEnabled(false);
        btnComplete.setEnabled(false);
        btnPause.setEnabled(false);

    }

    public void createArray(int val_array) {
        ManagerThread.threads = new Thread[900];
        array = new JLabel[index]; // Mảng label
        array_temp = new int[index]; // Mảng tạm 
        arrayDefault = new JLabel[index]; // Tạo mảng mặc đinh theo số phần tử
        int i;
        for (i = 0; i < index; i++) {
            //Tạo mảng JLabel 
            array[i] = new JLabel("" + val_array); // mặc đinh giá trị của label = 0

            arrayDefault[i] = new JLabel("" + i);// giá trị mảng tăng theo i
            panView_Array.add(array[i]); // thêm label vào panel
            panView_Array.add(arrayDefault[i]); // thêm mảng mặc định thứ tự của các phần tử vào pannel

            //set mảng JLabel sắp xếp
            array[i].setSize(30, 30); // set kích thước cho phần tử mảng
            array[i].setFont(new Font("Tahoma", Font.BOLD, 15));// set font chữ cho phần tử mảng
            array[i].setOpaque(true); // set màu nền cho label
            array[i].setForeground(Color.WHITE); // set màu chữ
            array[i].setBackground(new Color(16, 216, 183));// set màu cho label
            array[i].setBorder(BorderFactory.createEtchedBorder());// set border của label
            array[i].setVerticalTextPosition(JLabel.CENTER); //set vị trí chữ trong label
            array[i].setHorizontalAlignment(JLabel.CENTER);

            // Set mảng JLabel mặc định thứ tự các phần tử
            arrayDefault[i].setSize(30, 30);
            arrayDefault[i].setFont(new Font("Tahoma", Font.BOLD, 15));
            arrayDefault[i].setForeground(new Color(216, 80, 16));
            arrayDefault[i].setVerticalTextPosition(JLabel.CENTER); //set vị trí chữ trong label
            arrayDefault[i].setHorizontalAlignment(JLabel.CENTER);

            if (i == 0) {
                // set vị trí phần tử đầu tiên trong mảng. 
                array[i].setLocation(((panView_Array.getWidth() / 2) - 15) - (19 * index), (panView_Array.getHeight() / 2) - 15);
                arrayDefault[i].setLocation(((panView_Array.getWidth() / 2) - 15) - (19 * index), (panView_Array.getHeight() / 2) - 90);

            } else {
                // set vị trí của các phần tử tiếp theo, chúng cách nhau kc = 10.
                array[i].setLocation(array[i - 1].getX() + 10 + 30, (panView_Array.getHeight() / 2) - 15);
                arrayDefault[i].setLocation(array[i - 1].getX() + 10 + 30, (panView_Array.getHeight() / 2) - 90);
            }
        }
    }

    public void resetRadio(Boolean rad) {
        rad_Select.setEnabled(rad);
        rad_Insert.setEnabled(rad);
        rad_Bubble.setEnabled(rad);
        rad_shellSort.setEnabled(rad);
        Rad_Quick.setEnabled(rad);
        radIncrease.setEnabled(rad);
        radDecrease.setEnabled(rad);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        panView_Array = new javax.swing.JPanel();
        lbstt = new javax.swing.JLabel();
        lbi = new javax.swing.JLabel();
        lbj = new javax.swing.JLabel();
        lb_I = new javax.swing.JLabel();
        lb_J = new javax.swing.JLabel();
        lbtamp = new javax.swing.JLabel();
        lb_tamp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCreate_Array = new javax.swing.JButton();
        btnDele_Array = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRandom = new javax.swing.JButton();
        combo_value = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_code = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        rad_Select = new javax.swing.JRadioButton();
        rad_Insert = new javax.swing.JRadioButton();
        rad_Bubble = new javax.swing.JRadioButton();
        Rad_Quick = new javax.swing.JRadioButton();
        rad_shellSort = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        btnSort = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        radDecrease = new javax.swing.JRadioButton();
        radIncrease = new javax.swing.JRadioButton();
        btnPause = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm mô phỏng ver 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("MÔ PHỎNG MỘT SỐ THUẬT TOÁN SẮP XẾP THÔNG DỤNG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 11, 693, -1));

        panView_Array.setBackground(new java.awt.Color(255, 255, 255));
        panView_Array.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null), "Mô phỏng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        panView_Array.setLayout(null);

        lbstt.setPreferredSize(new java.awt.Dimension(300, 25));
        panView_Array.add(lbstt);
        lbstt.setBounds(330, 154, 300, 25);

        lbi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbi.setText("i = ");
        panView_Array.add(lbi);
        lbi.setBounds(10, 160, 40, 15);

        lbj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbj.setText("j = ");
        panView_Array.add(lbj);
        lbj.setBounds(80, 160, 50, 15);

        lb_I.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_I.setText("???");
        panView_Array.add(lb_I);
        lb_I.setBounds(50, 160, 21, 15);

        lb_J.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_J.setText("???");
        panView_Array.add(lb_J);
        lb_J.setBounds(140, 160, 30, 15);

        lbtamp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtamp.setForeground(new java.awt.Color(255, 0, 0));
        lbtamp.setText("k =");
        panView_Array.add(lbtamp);
        lbtamp.setBounds(190, 160, 50, 15);

        lb_tamp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_tamp.setText("???");
        panView_Array.add(lb_tamp);
        lb_tamp.setBounds(250, 160, 40, 15);

        getContentPane().add(panView_Array, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 58, 838, 186));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 102), null), "Dữ liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null), "Khởi tạo mảng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate_Array.setBackground(new java.awt.Color(102, 102, 255));
        btnCreate_Array.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate_Array.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate_Array.setText("Tạo mảng");
        btnCreate_Array.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnCreate_Array.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate_Array.setPreferredSize(new java.awt.Dimension(58, 15));
        btnCreate_Array.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/sortapplication/src/button.png"))); // NOI18N
        btnCreate_Array.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate_ArrayActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreate_Array, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 30));

        btnDele_Array.setBackground(new java.awt.Color(102, 102, 255));
        btnDele_Array.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDele_Array.setForeground(new java.awt.Color(255, 255, 255));
        btnDele_Array.setText("Xóa mảng");
        btnDele_Array.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnDele_Array.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDele_ArrayActionPerformed(evt);
            }
        });
        jPanel4.add(btnDele_Array, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Số phần tử mảng (tối đa 20):");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btnRandom.setBackground(new java.awt.Color(102, 102, 255));
        btnRandom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRandom.setForeground(new java.awt.Color(255, 255, 255));
        btnRandom.setText("Ngẫu nhiên");
        btnRandom.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });
        jPanel4.add(btnRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 30));

        combo_value.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo_value.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel4.add(combo_value, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 240));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 262, 260, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 102), null), "Code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(318, 258));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list_code.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        list_code.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_code);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 350, 250));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 360, 270));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 102), new java.awt.Color(255, 255, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null), "Thuật toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rad_Select);
        rad_Select.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rad_Select.setText("Selection Sort");
        rad_Select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_SelectMouseClicked(evt);
            }
        });
        jPanel7.add(rad_Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 34, -1, -1));

        buttonGroup1.add(rad_Insert);
        rad_Insert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rad_Insert.setText("Insertion Sort");
        rad_Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_InsertMouseClicked(evt);
            }
        });
        jPanel7.add(rad_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 75, -1, -1));

        buttonGroup1.add(rad_Bubble);
        rad_Bubble.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rad_Bubble.setText("Bubble Sort");
        rad_Bubble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_BubbleMouseClicked(evt);
            }
        });
        jPanel7.add(rad_Bubble, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 116, -1, -1));

        buttonGroup1.add(Rad_Quick);
        Rad_Quick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rad_Quick.setText("Quick Sort");
        Rad_Quick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rad_QuickMouseClicked(evt);
            }
        });
        jPanel7.add(Rad_Quick, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        buttonGroup1.add(rad_shellSort);
        rad_shellSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rad_shellSort.setText("Shell Sort");
        rad_shellSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_shellSortMouseClicked(evt);
            }
        });
        jPanel7.add(rad_shellSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 3, 150, 255));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null), "Điều khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSort.setBackground(new java.awt.Color(102, 102, 255));
        btnSort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setText("Sắp xếp");
        btnSort.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        jPanel8.add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        btnComplete.setBackground(new java.awt.Color(102, 102, 255));
        btnComplete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnComplete.setText("Hoàn thành");
        btnComplete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        jPanel8.add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        buttonGroup2.add(radDecrease);
        radDecrease.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radDecrease.setText("Giảm dần");
        radDecrease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radDecreaseMouseClicked(evt);
            }
        });
        jPanel8.add(radDecrease, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 71, -1, -1));

        buttonGroup2.add(radIncrease);
        radIncrease.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radIncrease.setText("Tăng dần");
        radIncrease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radIncreaseMouseClicked(evt);
            }
        });
        jPanel8.add(radIncrease, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 30, -1, -1));

        btnPause.setBackground(new java.awt.Color(102, 102, 255));
        btnPause.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPause.setForeground(new java.awt.Color(255, 255, 255));
        btnPause.setText("Tạm Dừng");
        btnPause.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 0), null));
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        jPanel8.add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 3, 140, 255));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 330, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sortapplication/src/dao.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sortapplication/src/chimen1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreate_ArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate_ArrayActionPerformed
        index = Integer.parseInt(combo_value.getSelectedItem().toString()); // lấy số phần tử cần tạo mảng
        createArray(0);

        // cập nhật button
        btnCreate_Array.setEnabled(false);
        btnRandom.setEnabled(true);
        btnDele_Array.setEnabled(true);
        btnPause.setText("Tạm dừng");
        isSelected = false;
        resetRadio(true);
    }//GEN-LAST:event_btnCreate_ArrayActionPerformed

    private void btnDele_ArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDele_ArrayActionPerformed

        for (int i = 0; i < index; i++) {
            remove(array[i]);
            panView_Array.repaint();
            panView_Array.validate();
        }
        panView_Array.removeAll();        
        panView_Array.repaint();
        panView_Array.validate();
        
        // cập nhật lại các button
        btnDele_Array.setEnabled(false);
        btnCreate_Array.setEnabled(true);
        btnSort.setEnabled(false);
        btnPause.setEnabled(false);
        btnComplete.setEnabled(false);
        btnSort.setText("Sắp xếp");
        btnSort.setForeground(Color.WHITE);
        btnSort.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRandom.setEnabled(false);

        ManagerThread.threads = new Thread[999];// set lại luồng sau khi gán luồng bag null
        ManagerThread.time = 50; // set lại time sau khi hoàn thành mảng sắp xếp.
        ManagerThread.curThread = -1;
    }//GEN-LAST:event_btnDele_ArrayActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        Random rd = new Random(); // tạo ngẫu nhiên các phần tử
        for (int i = 0; i < index; i++) {
            int rdm = rd.nextInt(100);
            array[i].setText("" + rdm); // gán giá  trị ngẫu nhiên cho các label
            array_temp[i] = rdm;
        }

        // cập nhật các button
        btnSort.setEnabled(true);

    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed

        panView_Array.add(lbstt);
        panView_Array.add(lbi);
        panView_Array.add(lbj);
        panView_Array.add(lb_I);
        panView_Array.add(lb_J);
        panView_Array.repaint();
        panView_Array.validate();
        lbi.setText("i =");
        lbj.setText("j =");
        lb_I.setText("???");
        lb_J.setText("???");
        lbstt.setText("");
        sort = new SortApplication(array, array_temp, pan, index, lbstt, lb_I, lb_J, lb_tamp, btnPause, btnComplete);

        if (rad_Select.isSelected() && radIncrease.isSelected()) {
            sort.SelectionSort(1);
        }
        if (rad_Select.isSelected() && radDecrease.isSelected()) {
            sort.SelectionSort(0);
        }
        if (rad_Insert.isSelected() && radIncrease.isSelected()) {
            sort.IntertionSort(1);
        }
        if (rad_Insert.isSelected() && radDecrease.isSelected()) {
            sort.IntertionSort(0);
        }
        if (rad_shellSort.isSelected() && radIncrease.isSelected()) {
            panView_Array.add(lbtamp);
            panView_Array.add(lb_tamp);
            panView_Array.repaint();
            panView_Array.validate();
            lbtamp.setText("k =");
            sort.ShellSort(1);
        }
        if (rad_shellSort.isSelected() && radDecrease.isSelected()) {
            panView_Array.add(lbtamp);
            panView_Array.add(lb_tamp);
            panView_Array.repaint();
            panView_Array.validate();
            lbtamp.setText("k =");
            lb_tamp.setText("");
            sort.ShellSort(0);
        }
        if (rad_Bubble.isSelected() && radIncrease.isSelected()) {
            sort.BubbleSort(1);
        }
        if (rad_Bubble.isSelected() && radDecrease.isSelected()) {
            sort.BubbleSort(0);
        }
        if (Rad_Quick.isSelected() && radIncrease.isSelected()) {
            panView_Array.add(lbtamp);
            panView_Array.add(lb_tamp);
            panView_Array.repaint();
            panView_Array.validate();
            lbi.setText("Left =");
            lbj.setText("Right =");
            lbtamp.setText("Pivot =");
            lb_tamp.setText("");
            sort.QuickSort(0, array.length - 1, 1);
            sort.setColor();
            sort.message();
        }
        if (Rad_Quick.isSelected() && radDecrease.isSelected()) {
            panView_Array.add(lbtamp);
            panView_Array.add(lb_tamp);
            panView_Array.repaint();
            panView_Array.validate();
            lbi.setText("Left =");
            lbj.setText("Right =");
            lbtamp.setText("Pivot =");
            lb_tamp.setText("");
            sort.QuickSort(0, array.length - 1, 0);
            sort.setColor();
            sort.message();
        }
        //cập nhật các button
        btnSort.setEnabled(false);
        btnPause.setEnabled(true);
        btnPause.setForeground(Color.RED);
        btnComplete.setEnabled(true);
        btnRandom.setEnabled(false);
        resetRadio(false);

    }//GEN-LAST:event_btnSortActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed

        sort.Completed();
        ManagerThread.time = 0;

        // cập nhật lại button  
        btnComplete.setEnabled(false);
        btnPause.setEnabled(false);
        isSelected = false;
        btnPause.setText("Tạm dừng");
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        if (isSelected) {
            isSelected = false;
            for (int i = 0; i <= ManagerThread.curThread; i++) {
                try {
                    ManagerThread.threads[i].resume();
                } catch (Exception ex) {
                    System.out.println(" " + ex.getMessage());
                }
            }
            btnPause.setText("Tạm Dừng");
            btnPause.setForeground(Color.RED);
            btnPause.setFont(new Font("Tahoma", Font.BOLD, 12));
        } else {
            isSelected = true;
            for (int i = 0; i <= ManagerThread.curThread; i++) {
                try {
                    ManagerThread.threads[i].suspend();
                } catch (Exception ex) {
                    System.out.println(" " + ex.getMessage());
                }
            }
            btnPause.setText("Tiếp tục");
            btnPause.setForeground(new Color(80, 240, 105));
            btnPause.setFont(new Font("Tahoma", Font.BOLD, 12));
        }
    }//GEN-LAST:event_btnPauseActionPerformed

    private void rad_SelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_SelectMouseClicked
        if (radIncrease.isSelected()) {
            showListCode.SelectionSort(list_code, 1);
        } else {
            showListCode.SelectionSort(list_code, 0);
        }
    }//GEN-LAST:event_rad_SelectMouseClicked

    private void rad_InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_InsertMouseClicked
        if (radIncrease.isSelected()) {
            showListCode.InsertionSort(list_code, 1);
        } else {
            showListCode.InsertionSort(list_code, 0);
        }
    }//GEN-LAST:event_rad_InsertMouseClicked

    private void rad_BubbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_BubbleMouseClicked
        if (radIncrease.isSelected()) {
            showListCode.BubbleSort(list_code, 1);
        } else {
            showListCode.BubbleSort(list_code, 0);
        }
    }//GEN-LAST:event_rad_BubbleMouseClicked

    private void rad_shellSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_shellSortMouseClicked
        if (radIncrease.isSelected()) {
            showListCode.ShellSort(list_code, 1);
        } else {
            showListCode.ShellSort(list_code, 0);
        }
    }//GEN-LAST:event_rad_shellSortMouseClicked

    private void Rad_QuickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rad_QuickMouseClicked
        if (radIncrease.isSelected()) {
            showListCode.QuickSort(list_code, 1);
        } else {
            showListCode.QuickSort(list_code, 0);
        }
    }//GEN-LAST:event_Rad_QuickMouseClicked

    private void radIncreaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radIncreaseMouseClicked
        if (rad_Select.isSelected()) {
            showListCode.SelectionSort(list_code, 1);
        }
        if (rad_Insert.isSelected()) {
            showListCode.InsertionSort(list_code, 1);
        }
        if (rad_Bubble.isSelected()) {
            showListCode.BubbleSort(list_code, 1);
        }
        if (rad_shellSort.isSelected()) {
            showListCode.ShellSort(list_code, 1);
        }
        if (Rad_Quick.isSelected()) {
            showListCode.QuickSort(list_code, 1);
        }
    }//GEN-LAST:event_radIncreaseMouseClicked

    private void radDecreaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radDecreaseMouseClicked
        if (rad_Select.isSelected()) {
            showListCode.SelectionSort(list_code, 0);
        }
        if (rad_Insert.isSelected()) {
            showListCode.InsertionSort(list_code, 0);
        }
        if (rad_Bubble.isSelected()) {
            showListCode.BubbleSort(list_code, 0);
        }
        if (rad_shellSort.isSelected()) {
            showListCode.ShellSort(list_code, 0);
        }
        if (Rad_Quick.isSelected()) {
            showListCode.QuickSort(list_code, 0);
        }
    }//GEN-LAST:event_radDecreaseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rad_Quick;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnCreate_Array;
    private javax.swing.JButton btnDele_Array;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combo_value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_I;
    private javax.swing.JLabel lb_J;
    private javax.swing.JLabel lb_tamp;
    private javax.swing.JLabel lbi;
    private javax.swing.JLabel lbj;
    private javax.swing.JLabel lbstt;
    private javax.swing.JLabel lbtamp;
    private javax.swing.JList<String> list_code;
    private javax.swing.JPanel panView_Array;
    private javax.swing.JRadioButton radDecrease;
    private javax.swing.JRadioButton radIncrease;
    private javax.swing.JRadioButton rad_Bubble;
    private javax.swing.JRadioButton rad_Insert;
    private javax.swing.JRadioButton rad_Select;
    private javax.swing.JRadioButton rad_shellSort;
    // End of variables declaration//GEN-END:variables
}
