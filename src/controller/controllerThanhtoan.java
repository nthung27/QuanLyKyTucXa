package controller;

import database.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.modelThanhtoan;
import java.sql.Statement;

public class controllerThanhtoan {
    //Tìm kiếm dữ liệu sinh viên
    public static List<modelThanhtoan> Timkiem(modelThanhtoan s) {
        List<modelThanhtoan> resultList = new ArrayList<>();
        String sql = "SELECT Masinhvien, Phong FROM hopdong WHERE Masinhvien = ?";
        try {
            Connection con = config.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, s.getMasinhvien());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String masv = rs.getString("Masinhvien");
                String phong = rs.getString("Phong");
                modelThanhtoan result = new modelThanhtoan();
                result.setMasinhvien(masv);
                result.setPhong(phong);
                resultList.add(result);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
    //Thêm dữ liệu thanh toán
    public static boolean Them(modelThanhtoan tt){
        try {
            Connection con = config.getConnection();
            String sql = "INSERT INTO thanhtoan(Masinhvien, Phong, Tongtien, Thanhtoan, Ngaytao) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, tt.getMasinhvien());
            pstm.setString(2, tt.getPhong());
            pstm.setString(3, tt.getTongtien());
            pstm.setString(4, tt.getThanhtoan());
            pstm.setString(5, tt.getNgaytao());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Sua du lieu thanh toan
    public static boolean Sua(modelThanhtoan tt){
        try {
            Connection con = config.getConnection();
            String sql = "UPDATE thanhtoan SET Phong=?, Tongtien=?, Thanhtoan=?, Ngaytao=? WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, tt.getPhong());
            pstm.setString(2, tt.getTongtien());
            pstm.setString(3, tt.getThanhtoan());
            pstm.setString(4, tt.getNgaytao());
            pstm.setString(5, tt.getMasinhvien());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
    }
    //Xoa su lieu thanh toan
    public static boolean Xoa(modelThanhtoan tt){
        try {
           Connection con = config.getConnection();
            String sql = "DELETE FROM thanhtoan WHERE Masinhvien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, tt.getMasinhvien());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //Load du lieu thanh toan
    public static List<modelThanhtoan> findAll(){
        List<modelThanhtoan> productList = new ArrayList<>();
        String query = "Select * from thanhtoan";
        try {
            Connection con = config.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                modelThanhtoan tt = new modelThanhtoan(rs.getString("Masinhvien"), rs.getString("Phong"), rs.getString("Tongtien"),rs.getString("Thanhtoan"), rs.getString("Ngaytao"));
                productList.add(tt);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
