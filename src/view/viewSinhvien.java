package view;

import controller.controllerSinhvien;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.modelSinhvien;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author Admin
 */
public class viewSinhvien extends javax.swing.JPanel {

    modelSinhvien sv = new modelSinhvien();
    public viewSinhvien() {
        initComponents();
        Hienthi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbGT = new javax.swing.JComboBox<>();
        txtCCCD = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        Main5.setBackground(new java.awt.Color(153, 255, 255));
        Main5.setPreferredSize(new java.awt.Dimension(886, 639));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sinh viên"));

        jLabel1.setText("Mã sinh viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Khoa");

        jLabel4.setText("Lớp");

        jLabel5.setText("Giới tính");

        jLabel6.setText("CCCD");

        jLabel7.setText("Số điện thoại");

        jLabel8.setText("Địa chỉ");

        cbGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ ", "Khác" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLop)
                    .addComponent(txtMSV))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbGT, 0, 124, Short.MAX_VALUE)
                    .addComponent(txtCCCD)
                    .addComponent(txtSDT)
                    .addComponent(txtDC))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbGT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        btnThem.setText("Thêm sinh viên");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa sinh viên");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa sinh viên");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTK.setText("Tìm kiếm");
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

        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXuatExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnTK)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(btnXuatExcel)
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết thông tin sinh viên"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ tên", "Khoa", "Lớp", "Giới tính", "CCCD", "Số điện thoại", "Địa chỉ"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Main5Layout = new javax.swing.GroupLayout(Main5);
        Main5.setLayout(Main5Layout);
        Main5Layout.setHorizontalGroup(
            Main5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Main5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Main5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Main5Layout.setVerticalGroup(
            Main5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Main5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //Sửa sinh viên
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String khoa = txtKhoa.getText();
        String lop = txtLop.getText();
        String gt = cbGT.getSelectedItem().toString();
        String cccd = txtCCCD.getText();
        String sdt = txtSDT.getText();
        String dc = txtDC.getText();

        // Kiểm tra xem các trường thông tin có trống không
        if (msv.isEmpty() || ht.isEmpty() || khoa.isEmpty() || lop.isEmpty() || gt.isEmpty() || cccd.isEmpty() || sdt.isEmpty() || dc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
            return;
        }

        // Cập nhật các thuộc tính của đối tượng sv
        sv.setMasinhvien(msv);
        sv.setHoten(ht);
        sv.setKhoa(khoa);
        sv.setLop(lop);
        sv.setGioitinh(gt);
        sv.setCCCD(cccd);
        sv.setSodienthoai(sdt);
        sv.setDiachi(dc);

        boolean success = controllerSinhvien.Sua(sv);
        if (success) {
            JOptionPane.showMessageDialog(null, "Sửa sinh viên thành công");
            Hienthi(); 
        } else {
            JOptionPane.showMessageDialog(null, "Sửa sinh viên thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    //Thêm sinh viên
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String khoa = txtKhoa.getText();
        String lop = txtLop.getText();
        String gt = cbGT.getSelectedItem().toString();
        String cccd = txtCCCD.getText();
        String sdt = txtSDT.getText();
        String dc = txtDC.getText();
        if (msv.isEmpty() || ht.isEmpty() || khoa.isEmpty() || lop.isEmpty() || gt.isEmpty() || cccd.isEmpty() || sdt.isEmpty() || dc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
            return;
        }

        // Check trùng mã sinh viên
        if (controllerSinhvien.Checktrungma(sv)){
            sv.setMasinhvien(msv);
            JOptionPane.showMessageDialog(null, "Mã sinh viên đã tồn tại. Vui lòng nhập mã khác.");
            return;
        }
        
        //Chỉ nhập số cho cccd và số điện thoại
        if (controllerSinhvien.isNumeric(sv)) {
            sv.setCCCD(cccd);
            sv.setSodienthoai(sdt);
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng số CCCD và Số điện thoại");
            return;
        }
        sv.setMasinhvien(msv);
        sv.setHoten(ht);
        sv.setKhoa(khoa);
        sv.setLop(lop);
        sv.setGioitinh(gt);
        sv.setCCCD(cccd);
        sv.setSodienthoai(sdt);
        sv.setDiachi(dc);

        boolean success = controllerSinhvien.Them(sv);
        if (success) {
            JOptionPane.showMessageDialog(null, "Thêm sinh viên thành công");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm sinh viên thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    //Bắt sự kiện Table
    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int selectedRow = Table1.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();

        if (selectedRow != -1) {
            // Retrieve the selected values based on column names or identifiers
            String msv = tableModel.getValueAt(selectedRow, 0).toString();
            String ht = tableModel.getValueAt(selectedRow, 1).toString();
            String khoa = tableModel.getValueAt(selectedRow, 2).toString();
            String lop = tableModel.getValueAt(selectedRow, 3).toString();
            String gt = tableModel.getValueAt(selectedRow, 4).toString();
            String cccd = tableModel.getValueAt(selectedRow, 5).toString();
            String sdt = tableModel.getValueAt(selectedRow, 6).toString();
            String dc = tableModel.getValueAt(selectedRow, 7).toString();

            // Set the values to the corresponding components
            txtMSV.setText(msv);
            txtHT.setText(ht);
            txtKhoa.setText(khoa);
            txtLop.setText(lop);
            cbGT.setSelectedItem(gt);
            txtCCCD.setText(cccd);
            txtSDT.setText(sdt);
            txtDC.setText(dc);
        }
    }//GEN-LAST:event_Table1MouseClicked
    //Xóa sinh viên
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String khoa = txtKhoa.getText();
        String lop = txtLop.getText();
        String gt = cbGT.getSelectedItem().toString();
        String cccd = txtCCCD.getText();
        String sdt = txtSDT.getText();
        String dc = txtDC.getText();
        if(msv.isEmpty() || ht.isEmpty() || khoa.isEmpty() || lop.isEmpty() || gt.isEmpty() || cccd.isEmpty() || sdt.isEmpty() || dc.isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng chọn thông tin cần xóa");
            return;
        }
        sv.setMasinhvien(txtMSV.getText());
        boolean success = controllerSinhvien.Xoa(sv);
        if (success){
            JOptionPane.showMessageDialog(null,"Xóa sinh viên thành công" );
            txtMSV.setText("");
            Hienthi();
        }else{
            JOptionPane.showMessageDialog(null, "Xóa sinh viên thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    //Tìm kiếm sinh viên
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        String ht = txtHT.getText();
        if (ht.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chỉ điền Họ Tên để thực hiện chức năng tìm kiếm!");
            return;
        }
        sv.setHoten(txtHT.getText());
        List<modelSinhvien> results = controllerSinhvien.Timkiem(sv);

        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tồn tại dữ liệu sinh viên!");
        } else {
            showTable(results);
        }
    }//GEN-LAST:event_btnTKActionPerformed
    //Reset sinh viên
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMSV.setText("");
        txtHT.setText("");
        txtKhoa.setText("");
        txtLop.setText("");
        cbGT.setSelectedItem("");
        txtCCCD.setText("");
        txtSDT.setText("");
        txtDC.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

   //Show dữ liệu
    private List<modelSinhvien> productList; // Khai báo biến productList ở mức lớp

    public void showTable(List<modelSinhvien> productList) {
        this.productList = productList; // Gán productList cho biến ở mức lớp

        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        for (modelSinhvien msv : productList) {
            tableModel.addRow(new Object[]{
                msv.getMasinhvien(),
                msv.getHoten(),
                msv.getKhoa(),
                msv.getLop(),
                msv.getGioitinh(),
                msv.getCCCD(),
                msv.getSodienthoai(),
                msv.getDiachi()
            });
        }
    }
    
    //Hien thi du lieu
    public void Hienthi(){
        showTable(controllerSinhvien.findAll());
    }
    
    //Xuat excel
    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Danh sách thông tin sinh viên");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < Table1.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(Table1.getColumnName(i));
                }

                for (int j = 0; j < Table1.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < Table1.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (Table1.getValueAt(j, k) != null) {
                            cell.setCellValue(Table1.getValueAt(j, k).toString());
                        }

                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
                // Hiển thị thông báo khi xuất thành công
                JOptionPane.showMessageDialog(this, "Xuất file Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main5;
    private javax.swing.JTable Table1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cbGT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMSV;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    private void openFile(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
