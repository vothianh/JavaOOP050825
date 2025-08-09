package Buoi13;

public class NhanVienTest {
    // Tạo biến thông tin nhân viên
    public String name;
    public int age;

    public NhanVienTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Tạo hàm hiển thị thông tin nhân viên
    public void show(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}
