package Buoi14.HamXayDung;

public class DemoHamXayDung {

    public String name;
    public String phone;
    public static String address = "hà Nội";

    private DemoHamXayDung(){
        name = "Anh Võ";
        phone = "12345";
    }

    public static void main(String[] args) {
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);
    }
}
