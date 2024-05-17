package view;

import controller.controllerKetthuc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.modelKetthuc;

public class viewKetThuc extends javax.swing.JPanel {
    modelKetthuc kt = new modelKetthuc();
    
    public viewKetThuc() {
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
        jLabel5 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnTK = new javax.swing.JButton();
        txtL = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnKetThuc = new javax.swing.JButton();
        btbSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(886, 639));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sinh viên"));

        jLabel1.setText("Mã sinh viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Lớp");

        jLabel4.setText("Phòng ở");

        jLabel5.setText("Ngày kết thúc");

        txtHT.setEnabled(false);

        txtP.setEnabled(false);
        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });

        btnTK.setText("Tìm kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        txtL.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtHT)
                    .addComponent(txtP)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtL, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btbSua.setText("Sửa");
        btbSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSuaActionPerformed(evt);
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
            .addComponent(btnKetThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
            .addComponent(btbSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnKetThuc)
                .addGap(37, 37, 37)
                .addComponent(btbSua)
                .addGap(38, 38, 38)
                .addComponent(btnXoa)
                .addGap(48, 48, 48)
                .addComponent(btnReset)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết thông tin kết thúc hợp đồng"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ tên", "Lớp", "Phòng ở", "Ngày kết thúc"
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPActionPerformed

    //Tìm kiếm
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        String msv = txtMSV.getText(); // Lấy mã sinh viên từ JTextField txtMSV

        kt.setMasinhvien(msv); // Đặt mã sinh viên trong đối tượng modelKetthuc

        // Thực hiện tìm kiếm
        List<modelKetthuc> resultList = controllerKetthuc.Timkiem(kt);

        if (!resultList.isEmpty()) { // Kiểm tra xem có kết quả tìm kiếm hay không
            modelKetthuc result = resultList.get(0); // Lấy kết quả đầu tiên
            txtHT.setText(result.getHoten()); // Hiển thị họ tên vào JTextField txtHT
            txtL.setText(result.getLop()); // Hiển thị lớp vào JTextField txtLop
            txtP.setText(result.getPhong());
        } else {
            // Nếu không tìm thấy kết quả, xóa nội dung trong các JTextField
            txtHT.setText("");
            txtL.setText("");
            txtP.setText("");
            JOptionPane.showMessageDialog(null, "Không tìm thấy mã sinh viên");
        }
    }//GEN-LAST:event_btnTKActionPerformed

    //Kết thúc
    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtL.getText();
        String p = txtP.getText();
        Date selectedDate = txtDate.getDate();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        if(msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin sinh viên!");
        }
        
        kt.setMasinhvien(msv);
        kt.setHoten(ht);
        kt.setLop(l);
        kt.setPhong(p);
        kt.setNgayketthuc(formattedDate);
        
        boolean success = controllerKetthuc.KetThuc(kt);
        if (success) {
            JOptionPane.showMessageDialog(null, "Kết thúc hợp đồng thành công.");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Kết thúc hợp đồng thất bại. Vui lòng kiểm tra lại thông tin.");
        }
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int selectedRow = Table1.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();

        if (selectedRow != -1) {
            String msv = tableModel.getValueAt(selectedRow, 0).toString();
            String ht = tableModel.getValueAt(selectedRow, 1).toString();
            String l = tableModel.getValueAt(selectedRow, 2).toString();
            String p = tableModel.getValueAt(selectedRow, 3).toString();
            String dtString = tableModel.getValueAt(selectedRow, 4).toString();
            txtMSV.setText(msv);
            txtHT.setText(ht);
            txtL.setText(l);
            txtP.setText(p);

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dt = dateFormat.parse(dtString);
                txtDate.setDate(dt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Table1MouseClicked

    //Reset dữ liệu
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMSV.setText("");
        txtHT.setText("");
        txtL.setText("");
        txtP.setText("");
        txtDate.setDate(null);
    }//GEN-LAST:event_btnResetActionPerformed

    //Sửa dữ liệu
    private void btbSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSuaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtL.getText();
        String p = txtP.getText();
        Date selectedDate = txtDate.getDate();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        if(msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin sinh viên!");
        }
        
        kt.setMasinhvien(msv);
        kt.setHoten(ht);
        kt.setLop(l);
        kt.setPhong(p);
        kt.setNgayketthuc(formattedDate);
        
        boolean success = controllerKetthuc.Sua(kt);
        if (success) {
            JOptionPane.showMessageDialog(null, "Sửa dữ liệu thành công.");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Sửa dữ liệu thất bại. Vui lòng kiểm tra lại thông tin.");
        }
    }//GEN-LAST:event_btbSuaActionPerformed

    //Xóa dữ liệu
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtL.getText();
        String p = txtP.getText();
        Date selectedDate = txtDate.getDate();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        if(msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin sinh viên!");
        }
        
        kt.setMasinhvien(msv);
        kt.setHoten(ht);
        kt.setLop(l);
        kt.setPhong(p);
        kt.setNgayketthuc(formattedDate);
        
        boolean success = controllerKetthuc.Xoa(kt);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa dữ liệu thành công.");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Xóa dữ liệu thất bại. Vui lòng kiểm tra lại thông tin.");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    //Hiển thị dữ liệu 
    public void Hienthi(){
        showTable(controllerKetthuc.findAll());
    }   
    
    //Show dữ liệu hợp đồng
    private List<modelKetthuc> productList; // Khai báo biến productList ở mức lớp

    public void showTable(List<modelKetthuc> productList) {
        this.productList = productList; // Gán productList cho biến ở mức lớp

        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        for (modelKetthuc msv : productList) {
            tableModel.addRow(new Object[]{
                msv.getMasinhvien(),
                msv.getHoten(),
                msv.getLop(),
                msv.getPhong(),
                msv.getNgayketthuc(),
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btbSua;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextField txtMSV;
    private javax.swing.JTextField txtP;
    // End of variables declaration//GEN-END:variables
}
