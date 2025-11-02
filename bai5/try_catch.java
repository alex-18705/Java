package bai5;

import java.util.Scanner;

/*
 *  try {
    // Khối mã có thể xảy ra lỗi
    } catch (ExceptionType e) {
        // Mã xử lý lỗi
    }

 */
public class try_catch {
    public static void main(String[] args) {
        System.out.printf("nhap gia tri n");
        Scanner nhap = new Scanner(System.in);
        try{
            int n;
            n = nhap.nextInt();
            System.err.println("Gia tri n la: "+n);
        } catch (Exception e) {
            System.err.println("Nhap du lieu khong dung ");
        } finally {
            System.out.printf("Finally");
        }
        nhap.close();
    }
}
