package model;

public class modelHopdong {
    private int id;
    private String Masinhvien;
    private String Hoten;
    private String Lop;
    private String Phong;
    private String Ngayvao;

    public modelHopdong() {
    }

    public modelHopdong(int id, String Masinhvien, String Hoten, String Lop, String Phong, String Ngayvao) {
        this.id = id;
        this.Masinhvien = Masinhvien;
        this.Hoten = Hoten;
        this.Lop = Lop;
        this.Phong = Phong;
        this.Ngayvao = Ngayvao;
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

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    public String getNgayvao() {
        return Ngayvao;
    }

    public void setNgayvao(String Ngayvao) {
        this.Ngayvao = Ngayvao;
    }
    
}
