package bai1;

public class Student {
    private String masv;
    private String hoten;
    private String ngaysinh;
    private String lop;
    private double gpa;
    // declare the fonction constructor of student
    public Student (String masv, String hoten, String ngaysinh, String lop, double gpa){
        this.masv=masv;
        this.hoten=hoten;
        this.ngaysinh=ngaysinh;
        this.lop=lop;
        this.gpa=gpa;
    }
    public String getMasv(){
        return masv;
    }
    public String getHoten(){
        return hoten;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public String getLop(){
        return lop;
    }
    public double getGpa(){
        return gpa;
    }
    // create a methode for imprime the information of student
    public String info(){
        return "Ma sv"+masv+" "+ "Ho ten: "+hoten+" "+"Ngay sinh: "+ngaysinh+" "+"Lop "+lop+" "+"GPA "+gpa;
    }

    @Override
    public String toString() {
        return info();
    }
}
