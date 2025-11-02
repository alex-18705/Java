package bai8;

public class Main {
    public static void main(String[] args) {
        hoadon hd = new hoadon("Trung Nguyen", 100 , 2.5);
        System.out.println("tong tien la: "+hd.Tongtien());
        if (hd.Kiemtrakhoiluong(2)){
            System.out.println("khoi luong thoa man");
        } else {
            System.out.println("Khoi luong khong thoa");
        }
    }
}
