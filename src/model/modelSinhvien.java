package model;
public class modelSinhvien {
    private int id;
    private String Masinhvien;
    private String Hoten;
    private String Khoa;
    private String Lop;
    private String Gioitinh;
    private String CCCD;
    private String Sodienthoai;
    private String Diachi;

    public modelSinhvien() {
    }

    public modelSinhvien(int id, String Masinhvien, String Hoten, String Khoa, String Lop, String Gioitinh, String CCCD, String Sodienthoai, String Diachi) {
        this.id = id;
        this.Masinhvien = Masinhvien;
        this.Hoten = Hoten;
        this.Khoa = Khoa;
        this.Lop = Lop;
        this.Gioitinh = Gioitinh;
        this.CCCD = CCCD;
        this.Sodienthoai = Sodienthoai;
        this.Diachi = Diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    
}
