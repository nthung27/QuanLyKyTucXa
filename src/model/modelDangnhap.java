package model;

public class modelDangnhap {
    private int id;
    private String hoten;
    private String taikhoan;
    private String matkhau;
    private String email;

    public modelDangnhap() {
    }

    public modelDangnhap(int id, String hoten, String taikhoan, String matkhau, String email) {
        this.id = id;
        this.hoten = hoten;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getHoten() {
        return hoten;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
