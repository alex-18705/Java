package bai2;

import java.util.Scanner;

public class thuvien_math {
    public static void main(String[] args) {
         double a, b;
         Scanner nhap = new Scanner(System.in);
         System.out.println("Nhap gia tri a: ");
         a = nhap.nextDouble();
         System.out.println("Nhap gia tri b: ");
         b = nhap.nextDouble();
        
         // Ham tri tuyet doi
         System.out.println("|a| = "+ Math.abs(a));
         // Ham tim Max, min
         System.out.println("Max (a,b) = "+Math.max(a,b));
         System.out.println("Min (a,b) = "+Math.min(a,b));
         // Ham ceil
         System.out.println("Ceil a = "+Math.ceil(a));
         // Ham floor
         System.out.println("Floor (a) = "+Math.floor(a));
         // Tinh can bac hai
         System.out.println("Sqrt (a) = "+Math.sqrt(a));
         // tinh a mu b
         System.out.println("Pow (a,b) = "+Math.pow(a,b));
         nhap.close();
    }
}
