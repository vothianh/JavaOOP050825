package Buoi13;

public class NhanVien {
    public String ten ;
    public int tuoi;
    public String congty;

    public NhanVien(String ten, int tuoi, String congty) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.congty = congty;
    }

    public void Show(){
        System.out.println("Ten" + ten);
        System.out.println("Tuổi" +tuoi);
        System.out.println("Tên công ty" + congty);
    }
}

