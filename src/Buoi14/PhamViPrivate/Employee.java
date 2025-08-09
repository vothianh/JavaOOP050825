package Buoi14.PhamViPrivate;

import java.security.spec.RSAOtherPrimeInfo;

public class Employee {
    private String name = "Võ Thị Anh";
    private int age = 30;

    private void getInfor(){
        System.out.println(name);
        System.out.println(age);
    }
private void getName(){
        System.out.println(name);
}

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfor();
    }
}
