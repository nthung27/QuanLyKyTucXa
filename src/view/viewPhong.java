package view;

import javax.swing.JOptionPane;
import controller.controllerPhong;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.modelPhong;

public class viewPhong extends javax.swing.JPanel {
    modelPhong p = new modelPhong();
    public viewPhong() {
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
        txtMP = new javax.swing.JTextField();
        txtTP = new javax.swing.JTextField();
        txtTT = new javax.swing.JTextField();
        cbDN = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(886, 639));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin phòng ở"));

        jLabel1.setText("Mã phòng");

        jLabel2.setText("Tên phòng");

        jLabel3.setText("Dãy nhà");

        jLabel4.setText("Tình trạng");

        cbDN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A01", "A02", "B01", "B02", "C01", "C02" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMP)
                    .addComponent(txtTP)
                    .addComponent(txtTT)
                    .addComponent(cbDN, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
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

        btnTK.setText("Tìm Kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
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
            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnThem)
                .addGap(29, 29, 29)
                .addComponent(btnSua)
                .addGap(27, 27, 27)
                .addComponent(btnXoa)
                .addGap(28, 28, 28)
                .addComponent(btnTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết thông tin phòng ở"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Tên phòng", "Dãy nhà", "Tình trạng"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
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
    //Thêm phòng ở
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String mp = txtMP.getText();
        String tp = txtTP.getText();
        String dn = cbDN.getSelectedItem().toString();
        String tt = txtTT.getText();
        if(mp.isEmpty() || tp.isEmpty() || dn.isEmpty() || tt.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin");
            return;
        }
        if (controllerPhong.Checktrungma(p)) {
            p.setMaphong(txtMP.getText());
            JOptionPane.showMessageDialog(null, "Mã phòng đã tồn tại . Vui lòng nhập mã khác");
            return;
        }
        p.setMaphong(txtMP.getText());
        p.setTenphong(txtTP.getText());
        p.setDaynha(cbDN.getSelectedItem().toString());
        p.setTinhtrang(txtTT.getText());
        boolean success = controllerPhong.Them(p);
        if (success){
            JOptionPane.showMessageDialog(null,"Thêm phòng thành công" );
            txtMP.setText("");
            txtTP.setText("");
            cbDN.setSelectedItem(cbDN.getSelectedItem().toString());
            txtTT.setText("");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm phòng thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    //Sửa phòng ở
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String mp = txtMP.getText();
        String tp = txtTP.getText();
        String dn = cbDN.getSelectedItem().toString();
        String tt = txtTT.getText();
        if(mp.isEmpty() || tp.isEmpty() || dn.isEmpty() || tt.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng chọn thông tin cần sửa");
            return;
        }
        if (controllerPhong.Checktrungma(p)) {
            p.setMaphong(txtMP.getText());
            JOptionPane.showMessageDialog(null, "Mã phòng đã tồn tại . Vui lòng nhập mã khác");
            return;
        }
        p.setMaphong(txtMP.getText());
        p.setTenphong(txtTP.getText());
        p.setDaynha(cbDN.getSelectedItem().toString());
        p.setTinhtrang(txtTT.getText());
        boolean success = controllerPhong.Sua(p);
        if (success){
            JOptionPane.showMessageDialog(null,"Sửa phòng thành công" );
            txtMP.setText("");
            txtTP.setText("");
            cbDN.setSelectedItem("");
            txtTT.setText("");
            Hienthi();
        }else{
            JOptionPane.showMessageDialog(null, "Sửa phòng thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    //Xóa phòng ở
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String mp = txtMP.getText();
        String tp = txtTP.getText();
        String dn = cbDN.getSelectedItem().toString();
        String tt = txtTT.getText();
        if(mp.isEmpty() || tp.isEmpty() || dn.isEmpty() || tt.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng chọn thông tin cần xóa");
            return;
        }
        p.setMaphong(txtMP.getText());
        boolean success = controllerPhong.Xoa(p);
        if (success){
            JOptionPane.showMessageDialog(null,"Xóa phòng thành công" );
            txtMP.setText("");
            Hienthi();
        }else{
            JOptionPane.showMessageDialog(null, "Xóa phòng thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    //Tìm kiếm phòng ở
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        String tenPhong = txtTP.getText();
        if (tenPhong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không có tên phòng được nhập trong hệ thống");
            return;
        }
        modelPhong po = new modelPhong();
        po.setTenphong(tenPhong);
        showTable(controllerPhong.TimKiem(po));
    }//GEN-LAST:event_btnTKActionPerformed
    //Reset phòng ở
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMP.setText("");
        txtTP.setText("");
        cbDN.setSelectedItem("");
        txtTT.setText("");
    }//GEN-LAST:event_btnResetActionPerformed
    //Bắt sự kiện Table
    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int selectedRow = Table1.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();

        if (selectedRow != -1) {
            // Retrieve the selected values based on column names or identifiers
            String mp = tableModel.getValueAt(selectedRow, 0).toString();
            String tp = tableModel.getValueAt(selectedRow, 1).toString();
            String dn = tableModel.getValueAt(selectedRow, 2).toString();
            String tt = tableModel.getValueAt(selectedRow, 3).toString();

            // Set the values to the corresponding components
            txtMP.setText(mp);
            txtTP.setText(tp);
            cbDN.setSelectedItem(dn);
            txtTT.setText(tt);
        }
    }//GEN-LAST:event_Table1MouseClicked

    //Hien thi du lieu
    public void Hienthi(){
        showTable(controllerPhong.findAll());
    }
   //Show dữ liệu
    public void showTable(List<modelPhong> productList) {
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        for (modelPhong po : productList) {
            tableModel.addRow(new Object[]{
                po.getMaphong(),
                po.getTenphong(),
                po.getDaynha(),
                po.getTinhtrang(),
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbDN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMP;
    private javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtTT;
    // End of variables declaration//GEN-END:variables
}
