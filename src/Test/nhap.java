package Test;

public class nhap {
    // Nhập thông tin đông của học sinh và sau đó in ra
    // vì class này chỉ cần nhập thông tin nên không cần có hàm main để in ra
   public String ten;
   public int tuoi;

    public nhap(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void show(){
        System.out.println("Tên : " + ten);
        System.out.println("Tuổi: " + tuoi);
    }
}
