package model;

public class modelThanhtoan {
    private String Masinhvien;
    private String Phong;
    private String Tongtien;
    private String Thanhtoan;
    private String Ngaytao;

    public modelThanhtoan() {
    }

    public modelThanhtoan(String Masinhvien, String Phong, String Tongtien, String Thanhtoan, String Ngaytao) {
        this.Masinhvien = Masinhvien;
        this.Phong = Phong;
        this.Tongtien = Tongtien;
        this.Thanhtoan = Thanhtoan;
        this.Ngaytao = Ngaytao;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public String getPhong() {
        return Phong;
    }

    public String getTongtien() {
        return Tongtien;
    }

    public String getThanhtoan() {
        return Thanhtoan;
    }

    public String getNgaytao() {
        return Ngaytao;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    public void setTongtien(String Tongtien) {
        this.Tongtien = Tongtien;
    }

    public void setThanhtoan(String Thanhtoan) {
        this.Thanhtoan = Thanhtoan;
    }

    public void setNgaytao(String Ngaytao) {
        this.Ngaytao = Ngaytao;
    }
    
}
