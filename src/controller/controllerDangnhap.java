package controller;

import java.sql.Connection;
import database.config;
import model.modelDangnhap;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class controllerDangnhap {
    public static controllerDangnhap getInstance() {
        return new controllerDangnhap();
    }
    //Đếm số lượng tài khoản
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) AS sl FROM dangnhap";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                soluong = rs.getInt("sl");
            }
            config.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soluong;
    }
    //Thực hiện chức năng đăng nhập
    public static boolean dangnhap(String taikhoan, String matkhau) {
        Connection con = config.getConnection();
        String sql = "SELECT * FROM dangnhap WHERE taikhoan = ? AND matkhau = ?";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, taikhoan);
            statement.setString(2, matkhau);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                resultSet.close();
                statement.close();
                con.close();
                return true; // Đăng nhập thành công
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Đăng nhập không thành công
    }
    //Thêm tài khoản
    public static boolean insert(modelDangnhap dn) {
        try {
            Connection con = config.getConnection();
            String sql = "INSERT INTO dangnhap (id,hoten,taikhoan, matkhau,email) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, dn.getId());
            pstm.setString(2, dn.getHoten());
            pstm.setString(3, dn.getTaikhoan());
            pstm.setString(4, dn.getMatkhau());
            pstm.setString(5, dn.getEmail());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Sửa tài khoản
    public static boolean sua(modelDangnhap dn) {
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE dangnhap SET hoten=?, taikhoan=?, matkhau=? WHERE email=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, dn.getHoten());
            pstm.setString(2, dn.getTaikhoan());
            pstm.setString(3, dn.getMatkhau());
            pstm.setString(4, dn.getEmail());
            int rowsAffected = pstm.executeUpdate();
            pstm.close();
            con.close();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Xóa tài khoản
    public static boolean xoa(modelDangnhap dn) {
        try {
            Connection con = config.getConnection();
            String sql = "DELETE FROM dangnhap WHERE hoten=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, dn.getHoten());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Load tất cả dữ liệu bảng đăng nhập
    public static List<modelDangnhap> findAll() {
        List<modelDangnhap> dangnhapList = new ArrayList<>();
        String query = "SELECT * FROM dangnhap";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                modelDangnhap dn = new modelDangnhap();
                dn.setHoten(rs.getString("hoten"));
                dn.setTaikhoan(rs.getString("taikhoan"));
                dn.setMatkhau(rs.getString("matkhau"));
                dn.setEmail(rs.getString("email"));
                dangnhapList.add(dn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dangnhapList;
    }
    //Check trùng email
    public static boolean Checktrungma(modelDangnhap cm) {
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) FROM dangnhap WHERE email=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cm.getEmail());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
