package bai7;

public class Main {
    public static void main(String[] args) {
        day d1 = new day(25,2,2000);
        day d3 = new day(24,2,2000);
        d1.printfDay();
        d1.printfMonth();
        d1.printfYear();
        d1.printfDate();
        System.out.println(d1);
        
        if(d1==d3){
            System.out.println("bang nhau");
        } else {
            System.out.println(" khong bang nhau");
        }
        // nen dung phuong thuc equals
        if (d1.equals(d3)){
            System.out.println("giong nhau");
        } else {
            System.out.println("khong giong nhau");
        }

        System.err.println("hashcode d1: "+d1.hashCode());
        System.err.println("hashcode d3: "+d3.hashCode());
    }
}
