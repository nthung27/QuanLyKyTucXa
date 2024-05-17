package controller;

import database.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.modelKetthuc;

public class controllerKetthuc {
    
    //Tìm kiếm dữ liệu sinh viên
    public static List<modelKetthuc> Timkiem(modelKetthuc s) {
        List<modelKetthuc> resultList = new ArrayList<>();
        String sql = "SELECT Masinhvien, Hoten, Lop, Phong FROM hopdong WHERE Masinhvien = ?";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, s.getMasinhvien());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String masv = rs.getString("Masinhvien");
                String hoten = rs.getString("Hoten");
                String lop = rs.getString("Lop");
                String phong = rs.getString("Phong");
                modelKetthuc result = new modelKetthuc();
                result.setMasinhvien(masv);
                result.setHoten(hoten);
                result.setLop(lop);
                result.setPhong(phong);
                resultList.add(result);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
    
    //Load tất cả dữ liệu bảng hợp đồng
    public static List<modelKetthuc> findAll() {
        List<modelKetthuc> ketthucList = new ArrayList<>();
        String query = "SELECT * FROM ketthuc";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                modelKetthuc kt = new modelKetthuc();
                kt.setMasinhvien(rs.getString("Masinhvien"));
                kt.setHoten(rs.getString("Hoten"));
                kt.setLop(rs.getString("Lop"));
                kt.setPhong(rs.getString("Phong"));
                kt.setNgayketthuc(rs.getString("Ngayketthuc"));
                ketthucList.add(kt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketthucList;
    }
    
    // Kết thúc hợp đồng
    public static boolean KetThuc(modelKetthuc kt) {
        try {
            Connection con = config.getConnection();

            // Thêm thông tin vào bảng 'ketthuc'
            String sqlInsert = "INSERT INTO ketthuc (Masinhvien, Hoten, Lop, Phong, Ngayketthuc) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmInsert = con.prepareStatement(sqlInsert);
            pstmInsert.setString(1, kt.getMasinhvien());
            pstmInsert.setString(2, kt.getHoten());
            pstmInsert.setString(3, kt.getLop());
            pstmInsert.setString(4, kt.getPhong());
            pstmInsert.setString(5, kt.getNgayketthuc());
            pstmInsert.executeUpdate();

            // Xóa thông tin từ bảng 'hopdong'
            String sqlDelete = "DELETE FROM hopdong WHERE Masinhvien = ?";
            PreparedStatement pstmDelete = con.prepareStatement(sqlDelete);
            pstmDelete.setString(1, kt.getMasinhvien());
            pstmDelete.executeUpdate();

            // Đóng các PreparedStatement sau khi sử dụng
            pstmInsert.close();
            pstmDelete.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // Sửa dữ liệu
    public static boolean Sua(modelKetthuc kt) {
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE ketthuc SET Hoten=?, Lop=?, Phong=?, Ngayketthuc=? WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, kt.getHoten());
            pstm.setString(2, kt.getLop());
            pstm.setString(3, kt.getPhong());
            pstm.setString(4, kt.getNgayketthuc());
            pstm.setString(5, kt.getMasinhvien());
            int rowsAffected = pstm.executeUpdate();
            pstm.close();
            con.close();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    //Xóa dữ liệu
    public static boolean Xoa(modelKetthuc kt) {
        try {
            Connection con = config.getConnection();
            String sql = "DELETE FROM ketthuc WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, kt.getMasinhvien());
            int rowsDeleted = pstm.executeUpdate();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
