package controller;

import java.sql.Statement;
import database.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import model.modelPhong;

public class controllerPhong {
    public static controllerPhong getInstance() {
        return new controllerPhong();
    }
    //Đếm số lượng phòng
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) AS sl FROM phong";
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
    //Thêm dữ liệu phòng
    public static boolean Them(modelPhong p){
        try {
            Connection con = config.getConnection();
            String sql = "INSERT INTO phong (Maphong,Tenphong,Daynha,Tinhtrang) VALUES (?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, p.getMaphong());
            pstm.setString(2, p.getTenphong());
            pstm.setString(3, p.getDaynha());
            pstm.setString(4, p.getTinhtrang());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Sửa dữ liệu phòng
    public static boolean Sua(modelPhong p) {
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE phong SET Tenphong=?, Daynha=?, Tinhtrang=? WHERE Maphong=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, p.getTenphong());
            pstm.setString(2, p.getDaynha());
            pstm.setString(3, p.getTinhtrang());
            pstm.setString(4, p.getMaphong());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Xóa dữ liệu phòng
    public static boolean Xoa(modelPhong p) {
        try {
            Connection con = config.getConnection();
            String sql = "DELETE FROM phong WHERE Maphong=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, p.getMaphong());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Tìm kiếm dữ liệu phòng
    public static List<modelPhong> TimKiem(modelPhong p) {
        List<modelPhong> TimkiemList = new ArrayList<>();
        String query = "Select * from phong Where phong.Tenphong='"+p.getTenphong()+"' ";
        try {
            Connection con = config.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                modelPhong po = new modelPhong(rs.getString("Maphong"),rs.getString("Tenphong"),rs.getString("Daynha"),rs.getString("Tinhtrang"));
                TimkiemList.add(po);
            }
        } catch (Exception e) {
            
        }
        return TimkiemList;
    }
    //Load tất cả dữ liệu phòng
    public static List<modelPhong> findAll() {
        List<modelPhong> timKiemList = new ArrayList<>();
        String query = "SELECT * FROM phong";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                modelPhong phong = new modelPhong();
                phong.setMaphong(rs.getString("Maphong"));
                phong.setTenphong(rs.getString("Tenphong"));
                phong.setDaynha(rs.getString("Daynha"));
                phong.setTinhtrang(rs.getString("Tinhtrang"));
                timKiemList.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timKiemList;
    }
    //Check trùng mã sinh viên
    public static boolean Checktrungma(modelPhong po) {
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) FROM phong WHERE Maphong=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, po.getMaphong());

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
