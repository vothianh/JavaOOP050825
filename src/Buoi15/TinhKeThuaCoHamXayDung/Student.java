package Buoi15.TinhKeThuaCoHamXayDung;

import java.sql.SQLOutput;

public class Student extends Person {

    private String phone;
    private String address;

    public Student(String name, int age, String phone) {
        super(name, age);
        this.phone = phone;
        this.address = "Hà Nội";
    }

    public void showGetInfor(){
       super.getInfor();  // Từ class cha, dùng từ khoá super để gọi từ class cha khi bị trùng hàm với class con
        getInfor(); // Từ class con

    }


    // Ghi đè phương thức từ class cha, tức là tạo 1 hàm giống tên
    public void getInfor(){
        System.out.println("Sđt: " + phone); // từ class con
        System.out.println("Địa chỉ: " + address); // từ class con
    }

    public static void main(String[] args) {
        Student student = new Student("Võ Anh", 31, "0999999999");
        student.showGetInfor();
        //student.getInfor();

    }


}
