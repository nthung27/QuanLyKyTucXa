package model;

public class modelHopdong {
    private String Masinhvien;
    private String Hoten;
    private String Lop;
    private String Phong;
    private String Ngayvao;

    public modelHopdong() {
    }

    public modelHopdong(String Masinhvien, String Hoten, String Lop, String Phong, String Ngayvao) {
        this.Masinhvien = Masinhvien;
        this.Hoten = Hoten;
        this.Lop = Lop;
        this.Phong = Phong;
        this.Ngayvao = Ngayvao;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getLop() {
        return Lop;
    }

    public String getPhong() {
        return Phong;
    }

    public String getNgayvao() {
        return Ngayvao;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    public void setNgayvao(String Ngayvao) {
        this.Ngayvao = Ngayvao;
    }
}
