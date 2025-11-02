package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("01", "Nguyen van a", " 18/07/2005", "11A", 6);
        System.out.println(stud1);
        
        
        String tenSach = "Lap trinh java";
        int namXuatBan = 2020;
        boolean tinhTrang = true;
        char maKho = 'M';
        if (tinhTrang == true){
            System.out.println("Ten sach: "+tenSach);
            System.out.println("nam xuat ban: "+namXuatBan);
            System.out.println("ma kho: "+maKho);

        }

        // ham nhap du lieu tu ban phim, cung co the nhap du lieu tu 1 file
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String hovaTen = nhap.nextLine();
        System.out.printf("Ho va ten: %s", hovaTen);
        nhap.close();
    }
}
