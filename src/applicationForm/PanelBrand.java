package applicationForm;

import Connect_database.MysqlConnect;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PanelBrand extends javax.swing.JPanel {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PanelBrand() {
        initComponents();
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ຄົ້ນຫາຂໍ້ມູນ");
        txtSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, new FlatSVGIcon("image_svg/search_text.svg"));
        //ປັບຕາຕະລາງ
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(new Font("Lao_SomVang", Font.PLAIN, 14));
        header.setOpaque(false);
        header.setBackground(new Color(108, 117, 125));
        header.setForeground(new Color(243, 243, 243));

        //ສະແດງຜົນຢູ່ກາງຖັນ
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        //ເສັ້ນຕາຕະລາງ
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(new Color(139, 138, 137));
        
        conn = MysqlConnect.connectDB(); // connect 
        
        autoID();
        tableUpdate();
        
        
    }
    
    private void autoID(){
        try {
            
            String sql = "SELECT SUBSTR(MAX(brand_id),2,4)FROM brand";
                   pst = conn.prepareStatement(sql);
                   rs = pst.executeQuery();
                   if(rs.next()){
                       int id = rs.getInt(1);
                       txtBrand_id.setText("B"+ String.format("%03d", ++id));
                   }
                   else{
                       txtBrand_id.setText("B001");
                   }
                   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    // show data in table
    private void tableUpdate(){
    
       try{
            String sql = "SELECT * FROM `brand` ORDER BY brand_id DESC ";
                   pst = conn.prepareStatement(sql);
                   rs = pst.executeQuery();
                  DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
                  
                  jTable1.setRowHeight(30);
                  d.setRowCount(0); // delete the data in table before
                  int number = 1;
                  
                  while(rs.next()){
                      d.addRow(new Object[] {
                      
                      number++,
                      rs.getString("brand_id"),
                      rs.getString("brand_name")
                      });
                      
                  
                  };
        }
       
       catch(Exception e){
       JOptionPane.showMessageDialog(this,e);
       }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBrand_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCancle = new javax.swing.JButton();
        btmAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtBrand_id = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ລໍາດັບ", "ລະຫັດ", "ຍີ່ຫໍ້"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ຈັດການຂໍ້ມູນຍີ່ຫໍ້", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lao_SomVang", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jLabel1.setText("ລະຫັດຍີ່ຫໍ້");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, 26));

        txtBrand_name.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jPanel1.add(txtBrand_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 310, -1));

        jLabel2.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jLabel2.setText("ຍີ່ຫໍ້");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 26));

        txtCancle.setBackground(new java.awt.Color(51, 204, 0));
        txtCancle.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        txtCancle.setText("ຍົກເລີກ");
        jPanel1.add(txtCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, -1));

        btmAdd.setBackground(new java.awt.Color(0, 0, 204));
        btmAdd.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        btmAdd.setForeground(new java.awt.Color(255, 255, 255));
        btmAdd.setText("ເພີ່ມ");
        jPanel1.add(btmAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        btnEdit.setBackground(new java.awt.Color(204, 204, 0));
        btnEdit.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        btnEdit.setText("ເເກ້ໄຂ");
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("ລົບ");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        txtBrand_id.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N
        jPanel1.add(txtBrand_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 310, -1));

        txtSearch.setFont(new java.awt.Font("Lao_SomVang", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBrand_id;
    private javax.swing.JTextField txtBrand_name;
    private javax.swing.JButton txtCancle;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
