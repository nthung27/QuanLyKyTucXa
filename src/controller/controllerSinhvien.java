package controller;
import model.modelSinhvien;
import database.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class controllerSinhvien {
    public static controllerSinhvien getInstance() {
        return new controllerSinhvien();
    }

    //Đếm số lượng sinh viên
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) AS sl FROM sinhvien";
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
    //Thêm dữ liệu sinh viên
    public static boolean Them(modelSinhvien sv){
        try {
            Connection con = config.getConnection();
            String sql = "INSERT INTO sinhvien (id,Masinhvien,Hoten,Khoa,Lop,Gioitinh,CCCD,Sodienthoai,Diachi) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, sv.getId());
            pstm.setString(2, sv.getMasinhvien());
            pstm.setString(3, sv.getHoten());
            pstm.setString(4, sv.getKhoa());
            pstm.setString(5, sv.getLop());
            pstm.setString(6, sv.getGioitinh());
            pstm.setString(7, sv.getCCCD());
            pstm.setString(8, sv.getSodienthoai());
            pstm.setString(9, sv.getDiachi());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // Sửa dữ liệu sinh viên
    public static boolean Sua(modelSinhvien sv) {
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE sinhvien SET Hoten=?, Khoa=?, Lop=?, Gioitinh=?, CCCD=?, Sodienthoai=?, Diachi=? WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sv.getHoten());
            pstm.setString(2, sv.getKhoa());
            pstm.setString(3, sv.getLop());
            pstm.setString(4, sv.getGioitinh());
            pstm.setString(5, sv.getCCCD());
            pstm.setString(6, sv.getSodienthoai());
            pstm.setString(7, sv.getDiachi());
            pstm.setString(8, sv.getMasinhvien());
            int rowsAffected = pstm.executeUpdate();
            pstm.close();
            con.close();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Xóa dữ liệu sinh viên
    public static boolean Xoa(modelSinhvien sv) {
        try {
            Connection con = config.getConnection();
            String sql = "DELETE FROM sinhvien WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sv.getMasinhvien());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Load hết tất cả dữ liệu sinh viên
    public static List<modelSinhvien> findAll() {
        List<modelSinhvien> productList = new ArrayList<>();
        String query = "Select * from sinhvien";
        try {
            Connection con = config.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                modelSinhvien st = new modelSinhvien(rs.getInt("id"),rs.getString("Masinhvien"),rs.getString("Hoten"),rs.getString("Khoa"),rs.getString("Lop"),rs.getString("Gioitinh"),rs.getString("CCCD"),rs.getString("Sodienthoai"),rs.getString("Diachi"));
                productList.add(st);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
    //Tìm kiếm dữ liệu sinh viên
    public static List<modelSinhvien> Timkiem(modelSinhvien s){
        List<modelSinhvien> TimkiemList = new ArrayList<>();
        String query = "Select * from sinhvien Where sinhvien.Hoten='"+s.getHoten()+"' ";
        try {
            Connection con = config.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                modelSinhvien st = new modelSinhvien(rs.getInt("id"),rs.getString("Masinhvien"),rs.getString("Hoten"),rs.getString("Khoa"),rs.getString("Lop"),rs.getString("Gioitinh"),rs.getString("CCCD"),rs.getString("Sodienthoai"),rs.getString("Diachi"));
                TimkiemList.add(st);
            }
        } catch (Exception e) {
            
        }
        return TimkiemList;
    }
    //Check trùng mã sinh viên
    public static boolean Checktrungma(modelSinhvien ce) {
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) FROM sinhvien WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, ce.getMasinhvien());

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
    //Check chỉ dùng số cho cccd và số điện thoại
    public static boolean isNumeric(modelSinhvien csv) {
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) FROM sinhvien WHERE CCCD = ? AND Sodienthoai = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, csv.getCCCD());
            pstm.setString(2, csv.getSodienthoai());
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
