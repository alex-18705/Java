package bai9;

public class Tacgia {
    private String ten;
    private Ngay ngaysinh;

    public Tacgia(String ten, Ngay ngaysinh){
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public Ngay getNgaysinh() {
        return ngaysinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaysinh(Ngay ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    

}
