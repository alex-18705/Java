package bai8;

public class hoadon {
    private String ten;
    private double giatien;
    private double khoiluongmua;

    // khoi tao constructor
    public hoadon(String ten, double giatien, double khoiluongmua){
        this.ten = ten;
        this.giatien = giatien;
        this.khoiluongmua = khoiluongmua;
    }

    // phuong thuc
    public double Tongtien(){
        return this.giatien*this.khoiluongmua;
    }

    // getter for ten
    public String getTen() {
        return this.ten;
    }

    public boolean Kiemtrakhoiluong(double khoiluongmua){
        return this.khoiluongmua>khoiluongmua;
    }
}
