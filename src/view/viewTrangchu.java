package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class viewTrangchu extends javax.swing.JFrame {

    public viewTrangchu() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PhongO = new javax.swing.JLabel();
        TroGiup = new javax.swing.JLabel();
        HopDong = new javax.swing.JLabel();
        SinhVien = new javax.swing.JLabel();
        ThongKe = new javax.swing.JLabel();
        ThanhToan = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JLabel();
        GioiThieu = new javax.swing.JLabel();
        Dangxuat = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/avatar.png"))); // NOI18N
        jLabel1.setText("DASHBOARD");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        PhongO.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PhongO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhongO.setText("Quản lý phòng ở");
        PhongO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhongOMouseClicked(evt);
            }
        });

        TroGiup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TroGiup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TroGiup.setText("Trợ giúp");

        HopDong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HopDong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HopDong.setText("Hợp đồng");
        HopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HopDongMouseClicked(evt);
            }
        });

        SinhVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SinhVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SinhVien.setText("Quản lý sinh viên");
        SinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SinhVienMouseClicked(evt);
            }
        });

        ThongKe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThongKe.setText("Thống kê");
        ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeMouseClicked(evt);
            }
        });

        ThanhToan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThanhToan.setText("Thanh toán");
        ThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThanhToanMouseClicked(evt);
            }
        });

        TaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TaiKhoan.setText("Quản lý tài khoản");
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoanMouseClicked(evt);
            }
        });

        GioiThieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        GioiThieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GioiThieu.setText("Giới thiệu");

        Dangxuat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dangxuat.setText("Đăng xuất");
        Dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangxuatMouseClicked(evt);
            }
        });

        Main.setBackground(new java.awt.Color(204, 204, 204));
        Main.setPreferredSize(new java.awt.Dimension(890, 642));

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(TroGiup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SinhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhongO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GioiThieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HopDong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SinhVien)
                .addGap(26, 26, 26)
                .addComponent(PhongO)
                .addGap(27, 27, 27)
                .addComponent(HopDong)
                .addGap(30, 30, 30)
                .addComponent(ThanhToan)
                .addGap(32, 32, 32)
                .addComponent(TaiKhoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TroGiup)
                .addGap(27, 27, 27)
                .addComponent(GioiThieu)
                .addGap(18, 18, 18)
                .addComponent(Dangxuat)
                .addGap(24, 24, 24))
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HỆ THỐNG QUẢN LÝ KÍ TÚC XÁ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addForm(Container panel, JFrame frame) {
        panel.removeAll();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setUndecorated(true);

        panel.setLayout(new BorderLayout());
        panel.add(frame.getContentPane(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();   
    }
    private void SinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinhVienMouseClicked
        viewSinhvien sinhvienForm = new viewSinhvien();
        JFrame frame = new JFrame();
        frame.setContentPane(sinhvienForm);
        addForm(Main, frame);
    }//GEN-LAST:event_SinhVienMouseClicked

    private void PhongOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhongOMouseClicked
        viewPhong po = new viewPhong();
        JFrame frame = new JFrame();
        frame.setContentPane(po);
        addForm(Main, frame);
    }//GEN-LAST:event_PhongOMouseClicked

    private void HopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HopDongMouseClicked
        viewHopdong hd = new viewHopdong();
        JFrame frame = new JFrame();
        frame.setContentPane(hd);
        addForm(Main, frame);
    }//GEN-LAST:event_HopDongMouseClicked

    private void TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMouseClicked
        viewTaikhoan tk = new viewTaikhoan();
        JFrame frame = new JFrame();
        frame.setContentPane(tk);
        addForm(Main, frame);
    }//GEN-LAST:event_TaiKhoanMouseClicked

    private void ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMouseClicked
        viewThongke tke = new viewThongke();
        JFrame frame = new JFrame();
        frame.setContentPane(tke);
        addForm(Main, frame);
    }//GEN-LAST:event_ThongKeMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Bạn muốn thoát khỏi chương trình?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
            viewDangnhap a = new viewDangnhap();
            a.setVisible(true);
        } else {
            Color DefaultColor = null;
            Dangxuat.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_DangxuatMouseClicked

    private void ThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThanhToanMouseClicked
        viewThanhtoan tt = new viewThanhtoan();
        JFrame frame = new JFrame();
        frame.setContentPane(tt);
        addForm(Main, frame);
    }//GEN-LAST:event_ThanhToanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JLabel GioiThieu;
    private javax.swing.JLabel HopDong;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel PhongO;
    private javax.swing.JLabel SinhVien;
    private javax.swing.JLabel TaiKhoan;
    private javax.swing.JLabel ThanhToan;
    private javax.swing.JLabel ThongKe;
    private javax.swing.JLabel TroGiup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
