package bai6;
// import bai6.tong;

import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        int n;
        double mang[];
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap do dai mang: ");
        n = nhap.nextInt();
        mang = new double[n];
        System.out.println("Nhap gia tri tung phan tu");
        for(int i=0; i<n; i++){
            mang[i]=nhap.nextDouble();
        }
        // in ra mang
        for (int i=0; i<n; i++){
            System.out.println("phan tu i "+i+" "+mang[i]);
        }
        // in ra do dai cua mang
        System.out.println("Do dai mang: "+ mang.length);
        // in ra tong cua mang
        System.out.println("tong mang la: "+ tong.tinhtong(mang,n));
        nhap.close();
    }
}
