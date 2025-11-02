package bai9;

public class Main {
    public static void main(String[] args) {
        // khoi tao ngay sinh cua cac tac gia
        Ngay ngay1 = new Ngay(15,2,2020);
        Ngay ngay2 = new Ngay(14,5,2010);
        Ngay ngay3 = new Ngay(13,7,2036);
        // khoi tao cac tac gia
        Tacgia tacgia1 = new Tacgia("Nguyen Minh Tri", ngay1);
        Tacgia tacgia2 = new Tacgia("Nguyen Lien Huong", ngay2);
        Tacgia tacgia3 = new Tacgia("Nguyen Thi Diem Quynh", ngay3);
        // khoi tao sach
        Livre l1 = new Livre("math",100, 2000, tacgia1);
        Livre l2 = new Livre("physique",150, 2005, tacgia2);
        Livre l3 = new Livre("Chimie",200, 2015, tacgia3);

        // test
        l1.Intensach();
        l2.Intensach();
        l3.Intensach();
        System.out.println("so sanh sach 1 va 3: "+l1.Kiemtranamxuatban(l3));
        System.out.println("gia sach "+l1.getTen()+" sau khi giam: "+l1.Giasaukhigiam(25));

    }
}
