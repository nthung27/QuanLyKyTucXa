package view;

import java.util.ArrayList;
import controller.controllerHopdong;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.modelHopdong;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class viewHopdong extends javax.swing.JPanel {
    modelHopdong mhd = new modelHopdong();
    
    public viewHopdong() {
        initComponents();
        Hienthi();
        Phong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        cbPhong = new javax.swing.JComboBox<>();
        btnTK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(886, 639));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin hợp đồng"));

        jLabel1.setText("Ngày vào");

        jLabel3.setText("Mã sinh viên");

        jLabel5.setText("Họ tên");

        jLabel6.setText("Lớp");

        txtHT.setEnabled(false);

        txtLop.setEnabled(false);

        btnTK.setText("Tìm kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        jLabel2.setText("Phòng ở");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHT)
                    .addComponent(txtLop)
                    .addComponent(cbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMSV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTK)))
                .addGap(144, 144, 144))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTK))
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57))
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

        btnXuat.setText("Xuất Excel");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua)
                .addGap(29, 29, 29)
                .addComponent(btnXoa)
                .addGap(30, 30, 30)
                .addComponent(btnReset)
                .addGap(29, 29, 29)
                .addComponent(btnXuat)
                .addGap(12, 12, 12))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lưu ý : 1 phòng chỉ được đăng ký tối đa 10 sinh viên");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết thông tin hợp đồng"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ tên", "Lớp", "Phòng ở", "Ngày vào"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(701, 701, 701)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    //Thêm dữ liệu hợp đồng
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtLop.getText();
        String p = cbPhong.getSelectedItem().toString();
        Date selectedDate = cbDate.getDate();
        
        if (msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
            return;
        }
        if (controllerHopdong.Demsinhvien(mhd)) {
            mhd.setPhong(p);
            JOptionPane.showMessageDialog(null, "Phòng đã đủ số lượng sinh viên. Vui lòng chọn phòng khác");
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        mhd.setMasinhvien(msv);
        mhd.setHoten(ht);
        mhd.setLop(l);
        mhd.setPhong(p);
        mhd.setNgayvao(formattedDate);

        boolean success = controllerHopdong.Them(mhd);
        if (success) {
            JOptionPane.showMessageDialog(null, "Thêm hợp đồng thành công");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm hợp đồng thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    //Sửa dữ liệu hợp đồng
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtLop.getText();
        String p = cbPhong.getSelectedItem().toString();
        Date selectedDate = cbDate.getDate();
        
        if (msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin cần sửa");
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        mhd.setMasinhvien(msv);
        mhd.setHoten(ht);
        mhd.setLop(l);
        mhd.setPhong(p);
        mhd.setNgayvao(formattedDate);

        boolean success = controllerHopdong.Sua(mhd);
        if (success) {
            JOptionPane.showMessageDialog(null, "Sửa hợp đồng thành công");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Sửa hợp đồng thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    //Xóa dữ liệu hợp đồng
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String msv = txtMSV.getText();
        String ht = txtHT.getText();
        String l = txtLop.getText();
        String p = cbPhong.getSelectedItem().toString();
        Date selectedDate = cbDate.getDate();
        
        if (msv.isEmpty() || ht.isEmpty() || l.isEmpty() || p.isEmpty() || selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin cần xóa");
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        
        mhd.setMasinhvien(msv);
        mhd.setHoten(ht);
        mhd.setLop(l);
        mhd.setPhong(p);
        mhd.setNgayvao(formattedDate);

        boolean success = controllerHopdong.Xoa(mhd);
        if (success) {
            JOptionPane.showMessageDialog(null, "Xóa hợp đồng thành công");
            Hienthi();
        } else {
            JOptionPane.showMessageDialog(null, "Xóa hợp đồng thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    //Reset dữ liệu
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMSV.setText("");
        txtHT.setText("");
        txtLop.setText("");
        cbPhong.setSelectedItem("");
        cbDate.setDate(null);
    }//GEN-LAST:event_btnResetActionPerformed

    //Hiển thị dữ liệu 
    public void Hienthi(){
        showTable(controllerHopdong.findAll());
    }    
    
    //Bắt sựu kiện kích chuột Table
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
            txtLop.setText(l);
            cbPhong.setSelectedItem(p);

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dt = dateFormat.parse(dtString);
                cbDate.setDate(dt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Table1MouseClicked

    //Xuất excel
    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Danh sách hợp đồng thuê phòng sinh viên");

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
    }//GEN-LAST:event_btnXuatActionPerformed
    
   
    public void Phong(){
        ArrayList<String> list = controllerHopdong.cbPhong();
        for(String Phong: list){
            cbPhong.addItem(Phong.toString());
        }
    }
    //Tìm kiếm mã sinh viên
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        String msv = txtMSV.getText(); // Lấy mã sinh viên từ JTextField txtMSV

        modelHopdong tt = new modelHopdong();
        tt.setMasinhvien(msv); // Đặt mã sinh viên trong đối tượng modelHopdong

        // Thực hiện tìm kiếm
        List<modelHopdong> resultList = controllerHopdong.Timkiem(tt);

        if (!resultList.isEmpty()) { // Kiểm tra xem có kết quả tìm kiếm hay không
            modelHopdong result = resultList.get(0); // Lấy kết quả đầu tiên
            txtHT.setText(result.getHoten()); // Hiển thị họ tên vào JTextField txtHT
            txtLop.setText(result.getLop()); // Hiển thị lớp vào JTextField txtLop
        } else {
            // Nếu không tìm thấy kết quả, xóa nội dung trong các JTextField
            txtHT.setText("");
            txtLop.setText("");
            JOptionPane.showMessageDialog(null, "Không tìm thấy mã sinh viên");
        }
    }//GEN-LAST:event_btnTKActionPerformed
    
    //Show dữ liệu hợp đồng
    private List<modelHopdong> productList; // Khai báo biến productList ở mức lớp

    public void showTable(List<modelHopdong> productList) {
        this.productList = productList; // Gán productList cho biến ở mức lớp

        DefaultTableModel tableModel = (DefaultTableModel) Table1.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        for (modelHopdong msv : productList) {
            tableModel.addRow(new Object[]{
                msv.getMasinhvien(),
                msv.getHoten(),
                msv.getLop(),
                msv.getPhong(),
                msv.getNgayvao(),
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
    private javax.swing.JButton btnXuat;
    private com.toedter.calendar.JDateChooser cbDate;
    private javax.swing.JComboBox<String> cbPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMSV;
    // End of variables declaration//GEN-END:variables

    private void openFile(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
