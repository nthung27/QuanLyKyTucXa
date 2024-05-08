package controller;

import database.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.modelHopdong;

public class controllerHopdong {
    public static controllerHopdong getInstance() {
        return new controllerHopdong();
    }
    //Đếm số lượng hợp đồng
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) AS sl FROM hopdong";
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
    //Hiển thị dữ liệu lên combobox Phòng
    public static ArrayList<String> cbPhong(){
        ArrayList<String> list = new ArrayList<String>();
        Connection con = config.getConnection();
        String query = "SELECT Tenphong FROM phong";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery(query);
            while(rs.next()) {                
                list.add(rs.getString("Tenphong"));
            }
        } catch (Exception e) {
        }
        return list;
    }
    //Thêm dữ liệu hợp đồng
    public static boolean Them(modelHopdong hd){
        try {
            Connection con = config.getConnection();
            String sql = "INSERT INTO hopdong (Masinhvien,Hoten,Lop,Phong,Ngayvao) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMasinhvien());
            pstm.setString(2, hd.getHoten());
            pstm.setString(3, hd.getLop());
            pstm.setString(4, hd.getPhong());
            pstm.setString(5, hd.getNgayvao());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Sửa dữ liệu hợp đồng
    public static boolean Sua(modelHopdong hd) {
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE hopdong SET Hoten=?, Lop=?, Phong=?, Ngayvao=? WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getHoten());
            pstm.setString(2, hd.getLop());
            pstm.setString(3, hd.getPhong());
            pstm.setString(4, hd.getNgayvao());
            pstm.setString(5, hd.getMasinhvien());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Xóa dữ liệu hợp đồng
    public static boolean Xoa(modelHopdong hd) {
        try {
            Connection con = config.getConnection();
            String sql = "DELETE FROM hopdong WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMasinhvien());
            int rowsDeleted = pstm.executeUpdate();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Load tất cả dữ liệu bảng hợp đồng
    public static List<modelHopdong> findAll() {
        List<modelHopdong> hopdongList = new ArrayList<>();
        String query = "SELECT * FROM hopdong";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                modelHopdong hd = new modelHopdong();
                hd.setMasinhvien(rs.getString("Masinhvien"));
                hd.setHoten(rs.getString("Hoten"));
                hd.setLop(rs.getString("Lop"));
                hd.setPhong(rs.getString("Phong"));
                hd.setNgayvao(rs.getString("Ngayvao"));
                hopdongList.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hopdongList;
    }
    //Tìm kiếm dữ liệu sinh viên
    public static List<modelHopdong> Timkiem(modelHopdong s) {
        List<modelHopdong> resultList = new ArrayList<>();
        String sql = "SELECT Masinhvien, Hoten, Lop FROM sinhvien WHERE Masinhvien = ?";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, s.getMasinhvien());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String masv = rs.getString("Masinhvien");
                String hoten = rs.getString("Hoten");
                String lop = rs.getString("Lop");
                modelHopdong result = new modelHopdong();
                result.setMasinhvien(masv);
                result.setHoten(hoten);
                result.setLop(lop);
                resultList.add(result);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
    //Kiểm tra số sinh viên trong phòng không vượt quá 10 sinh viên
        public static boolean Demsinhvien(modelHopdong dsv) {
        try {
            Connection con = config.getConnection();
            String sql = "SELECT COUNT(*) FROM hopdong WHERE Phong=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, dsv.getPhong());

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count >= 10; 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }
}
