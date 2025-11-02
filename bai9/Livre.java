package bai9;

public class Livre {
    private String tensach;
    private double giaban;
    private int namxuatban;
    private Tacgia tacgia;  
    // khoi tao ham constructor
    public Livre(String tensach, double giaban, int namxuatban, Tacgia tacgia){
        this.tensach = tensach;
        this.giaban = giaban;
        this.namxuatban = namxuatban;
        this.tacgia = tacgia;
    }
    
    public Tacgia getTacgia() {
        return tacgia;
    }

    public void setTacgia(Tacgia tacgia) {
        this.tacgia = tacgia;
    }

    public String getTen(){
        return tensach;
    }

    public void setTen(String tensach){
        this.tensach = tensach;
    }

    public double getGia(){
        return giaban;
    }

    public void setGia(double giaban){
        this.giaban = giaban;
    }

    public int getNam(){
        return namxuatban;
    } 

    public void setNam(int namxuatban){
        this.namxuatban = namxuatban;
    }

    public void Intensach(){
        System.out.println(tensach);
    }

    public boolean Kiemtranamxuatban(Livre l){
        return this.namxuatban==l.namxuatban;
    }

    public double Giasaukhigiam(double x){
        return giaban*(1-x/100);
    }
}
