package Buoi14.Company;

import Buoi14.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Võ Thị Linh", 31, "Nữ", "27263263721", "hà nôij");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        // System.out.println(person.getPhone());
        //System.out.println(person.getAddress());
    }
}
