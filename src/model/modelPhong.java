package model;

public class modelPhong {
    private String Maphong;
    private String Tenphong;
    private String Daynha;
    private String Tinhtrang;

    public modelPhong() {
    }

    public modelPhong(String Maphong, String Tenphong, String Daynha, String Tinhtrang) {
        this.Maphong = Maphong;
        this.Tenphong = Tenphong;
        this.Daynha = Daynha;
        this.Tinhtrang = Tinhtrang;
    }

    public String getMaphong() {
        return Maphong;
    }

    public String getTenphong() {
        return Tenphong;
    }

    public String getDaynha() {
        return Daynha;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public void setTenphong(String Tenphong) {
        this.Tenphong = Tenphong;
    }

    public void setDaynha(String Daynha) {
        this.Daynha = Daynha;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }
}
