package view;
import model.modelDangnhap;
import controller.controllerDangnhap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewTaikhoan extends javax.swing.JPanel {
    controllerDangnhap dn = new controllerDangnhap();
    modelDangnhap mdn = new modelDangnhap();
    
    public viewTaikhoan() {
        initComponents();
        Hienthi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        txtU = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        txtE = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(886, 639));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tài khoản"));

        jLabel1.setText("Họ tên");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtHT)
                        .addComponent(txtU)
                        .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnThem)
                .addGap(31, 31, 31)
                .addComponent(btnSua)
                .addGap(31, 31, 31)
                .addComponent(btnXoa)
                .addGap(26, 26, 26)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết thông tin tài khoản"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Họ tên", "Username", "Password", "Email"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //Them du lieu
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String ht = txtHT.getText();
        String u = txtU.getText();
        String p = txtP.getText();
        String e = txtE.getText();
        if(ht.isEmpty() || u.isEmpty() || p.isEmpty() || e.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin");
            return;
        }
        if (controllerDangnhap.Checktrungma(mdn)) {
            mdn.setEmail(e);
            JOptionPane.showMessageDialog(null, "Email đã được đăng ký trước đó. Vui lòng nhập email mới");
            return;
        }
        mdn.setHoten(ht);
        mdn.setTaikhoan(u);
        mdn.setMatkhau(p);
        mdn.setEmail(e);
        boolean success = controllerDangnhap.insert(mdn);
        if (success){
            JOptionPane.showMessageDialog(null,"Thêm tài khoản thành công" );
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm tài khoản thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    //Sua du lieu
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String ht = txtHT.getText();
        String u = txtU.getText();
        String p = txtP.getText();
        String e = txtE.getText();
        if(ht.isEmpty() || u.isEmpty() || p.isEmpty() || e.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng chọn thông tin cần sửa");
            return;
        }
        
        mdn.setHoten(txtHT.getText());
        mdn.setTaikhoan(txtU.getText()); 
        mdn.setMatkhau(txtP.getText());
        mdn.setEmail(txtE.getText());
        boolean success = controllerDangnhap.sua(mdn);
        if (success){
            JOptionPane.showMessageDialog(null,"Sửa tài khoản thành công" );
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Sửa tài khoản thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    //Xoa du lieu
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String ht = txtHT.getText();
        String u = txtU.getText();
        String p = txtP.getText();
        String e = txtE.getText();
        if(ht.isEmpty() || u.isEmpty() || p.isEmpty() || e.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng chọn thông tin cần xóa");
            return;
        }
        mdn.setHoten(txtHT.getText());
        mdn.setTaikhoan(txtU.getText());
        mdn.setMatkhau(txtP.getText());
        mdn.setEmail(txtE.getText());
        boolean success = controllerDangnhap.xoa(mdn);
        if (success){
            JOptionPane.showMessageDialog(null,"Xóa tài khoản thành công" );
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Xóa tài khoản thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    //Reset du lieu
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtHT.setText("");
        txtU.setText("");
        txtP.setText("");
        txtE.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    //Hien thi du lieu vao table
    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int selectedRow = Table1.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();

        if (selectedRow != -1) {
            // Retrieve the selected values based on column names or identifiers
            String ht = tableModel.getValueAt(selectedRow, 0).toString();
            String u = tableModel.getValueAt(selectedRow, 1).toString();
            String p = tableModel.getValueAt(selectedRow, 2).toString();
            String e = tableModel.getValueAt(selectedRow, 3).toString();

            // Set the values to the corresponding components
            txtHT.setText(ht);
            txtU.setText(u);
            txtP.setText(p);
            txtE.setText(e);
        }
    }//GEN-LAST:event_Table1MouseClicked
    
    //Hien thi du lieu
    public void Hienthi(){
        showTable(controllerDangnhap.findAll());
    }
    //Bat su kien hien thi du lieu
    public void showTable(List<modelDangnhap> dangnhapList) {
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        for (modelDangnhap mldn : dangnhapList) {
            tableModel.addRow(new Object[]{
                mldn.getHoten(),
                mldn.getTaikhoan(),
                mldn.getMatkhau(),
                mldn.getEmail(),
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtE;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtU;
    // End of variables declaration//GEN-END:variables
}
