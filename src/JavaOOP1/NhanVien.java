package JavaOOP1;

public class NhanVien {
    String ten;
    int tuoi;

    public NhanVien(String ten, int tuoi) {
        this.ten = ten;   // gán giá trị tham số vào biến class
        this.tuoi = tuoi;
    }

    public void hienThi() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
    }
}

