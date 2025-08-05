package Test;

public class nhap {
    // Nhập thông tin đông của học sinh và sau đó in ra
    // vì class này chỉ cần nhập thông tin nên không cần có hàm main để in ra
    public String ten;
    public int tuoi;
    public int lop;


    public nhap(String ten, int tuoi, int lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public void hienthi(){
        System.out.println("Tên "+ ten);
        System.out.println("Tuổi "+ tuoi);
        System.out.println("Lớp "+ lop);
    }
}
