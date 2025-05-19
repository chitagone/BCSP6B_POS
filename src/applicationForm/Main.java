package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    private String emp_id;

    public Main() {
        initComponents();
    }

    public Main(String emp_id, String name, String status) {
        initComponents();
        //  System.out.println(emp_id + name +status);

        this.emp_id = emp_id;
        this.setTitle("ໂປຣແກຣມຂາຍເຄື່ອງໜ້າຮ້ານ");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //ສະແດງຜົນເຕັມຈໍ
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/Logo.png")));

        //ປຽນສີແຖບ Title bar ດ້ານເທິງ
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false); //ບໍ່ສະແດງ Icon ທີ່ title bar

        SimpleDateFormat fm = new SimpleDateFormat("ວັນທີ: dd/MM/yyyy  ເວລາ HH:mm:ss a");
        txtStatusBar.setText("ຜູ້ໃຊ້ງານ: " + emp_id + " : " + name + " " + fm.format(new Date()));
        txtStatusBar.setForeground(new Color(231, 76, 60));

        //ສະເເດງໜ້າ  PanelHome ກ່ອນ
        showPanel(new PanelHome());
        
        //ຖ້າສະຖານະບໍ່ເເມ່ນເເອັດມິນບໍ່ໃຫ້ສະເເດງເມນູຈັດການຂໍ້ມູນ ສັ່ງຊື້,ນຳເຂົ້າ ເເລະ ລາຍງານ
        if(!status.equals("Admin")){
            jMenuData.setEnabled(false);
            jMenuOrder_import.setEnabled(false);
            jMenuReport.setEnabled(false);
            
        }
    }

    //ສ້າງເມັດທອດສະຫຼັບໜ້າມາສະເເດງທີ່ PanelMain
    private void showPanel(JPanel panel) {
        PanelMain.removeAll();
        PanelMain.add(panel);
        PanelMain.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        txtStatusBar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuData = new javax.swing.JMenu();
        jMenuItemBrand = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuOrder_import = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuProfile = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemLight = new javax.swing.JMenuItem();
        jMenuItemDark = new javax.swing.JMenuItem();
        jMenuItemMacOsDark = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMain.setBackground(new java.awt.Color(153, 153, 153));
        PanelMain.setLayout(new java.awt.BorderLayout());

        txtStatusBar.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        txtStatusBar.setText("jLabel1");

        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_Page.png"))); // NOI18N
        jMenuHome.setText("ໜ້າຫຼັກ");
        jMenuHome.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_Database.png"))); // NOI18N
        jMenuData.setText("ຈັດການຂໍ້ມູນ");
        jMenuData.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemBrand.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItemBrand.setText("ຈັດການຂໍ້ມູນຍີ່ຫໍ້");
        jMenuItemBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBrandActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemBrand);

        jMenuItem3.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem3.setText("ຈັດການຂໍ້ມູນປະເພດສິນຄ້າ");
        jMenuData.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem4.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        jMenuData.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem5.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jMenuData.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem6.setText("ຈັດການຂໍ້ມູນອັດຕາເເລກປ່ຽນ");
        jMenuData.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem7.setText("ຈັດການຂໍ້ມູນຜູ້ສະໜອງ");
        jMenuData.add(jMenuItem7);

        jMenuBar1.add(jMenuData);

        jMenuOrder_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order_Import.png"))); // NOI18N
        jMenuOrder_import.setText("ສັ່ງຊື້-ນຳເຂົ້າ");
        jMenuOrder_import.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuOrder_import.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrder_import.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrder_import.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem8.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem8.setText("ຈັດການຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuOrder_import.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem9.setText("ຈັດການຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenuOrder_import.add(jMenuItem9);

        jMenuBar1.add(jMenuOrder_import);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        jMenu4.setText("ລູກຄ້າ");
        jMenu4.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sale_Product.png"))); // NOI18N
        jMenu5.setText("ຂາຍສິນຄ້າ");
        jMenu5.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_Property.png"))); // NOI18N
        jMenu6.setText("ຄົ້ນຫາຂໍ້ມູນສິນຄ້າ");
        jMenu6.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu6);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report_Card.png"))); // NOI18N
        jMenuReport.setText("ລາຍງານ");
        jMenuReport.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem10.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem10.setText("ລາຍງານຂໍ້ມູນການຂາຍ");
        jMenuReport.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem11.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໃນຮ້ານ");
        jMenuReport.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem12.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໄກ້ໝົດ");
        jMenuReport.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem13.setText("ໃບບິນ");
        jMenuReport.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem14.setText("ລາຍງານຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuReport.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem15.setText("ລາຍງານຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenuReport.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem16.setText("ລານງານຂໍ້ມູນລູກຄ້າ");
        jMenuReport.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItem17.setText("ລາຍງານຂໍ້ມູນພະນັກງານ");
        jMenuReport.add(jMenuItem17);

        jMenuBar1.add(jMenuReport);

        jMenuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        jMenuProfile.setText("ໂປຣໄຟລ໌");
        jMenuProfile.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProfileMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuProfile);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change_Theme.png"))); // NOI18N
        jMenu9.setText("ສີພື້ນຫຼັງ");
        jMenu9.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenu9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemLight.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItemLight.setText("FlatLaf Light");
        jMenuItemLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLightActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemLight);

        jMenuItemDark.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItemDark.setText("FlatLaf Dark");
        jMenuItemDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDarkActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemDark);

        jMenuItemMacOsDark.setFont(new java.awt.Font("Lao_SomVang", 1, 12)); // NOI18N
        jMenuItemMacOsDark.setText("FlatLaf MacOsDark");
        jMenuItemMacOsDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMacOsDarkActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemMacOsDark);

        jMenuBar1.add(jMenu9);

        jMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown.png"))); // NOI18N
        jMenuLogout.setText("ອອກລະບົບ");
        jMenuLogout.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jMenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatusBar)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
        showPanel(new PanelHome());
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void jMenuItemBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBrandActionPerformed
        showPanel(new PanelBrand());
    }//GEN-LAST:event_jMenuItemBrandActionPerformed

    private void jMenuProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProfileMouseClicked
        showPanel(new PanelProfile(emp_id));

    }//GEN-LAST:event_jMenuProfileMouseClicked

    private void jMenuItemLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLightActionPerformed
        txtStatusBar.setForeground(new Color(40, 42, 180));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemLightActionPerformed

    private void jMenuItemDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDarkActionPerformed
        txtStatusBar.setForeground(new Color(231, 76, 60));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemDarkActionPerformed

    private void jMenuItemMacOsDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMacOsDarkActionPerformed
        txtStatusBar.setForeground(new Color(231, 76, 60));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(28, 40, 51));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemMacOsDarkActionPerformed

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        FlatDarkLaf.setup();
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMain;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuData;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemBrand;
    private javax.swing.JMenuItem jMenuItemDark;
    private javax.swing.JMenuItem jMenuItemLight;
    private javax.swing.JMenuItem jMenuItemMacOsDark;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuOrder_import;
    private javax.swing.JMenu jMenuProfile;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JLabel txtStatusBar;
    // End of variables declaration//GEN-END:variables
}
