package Buoi14.HamXayDung;

public class HamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;

    public HamXayDungCoThamSo(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public HamXayDungCoThamSo(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo = new HamXayDungCoThamSo("Võ Thị Anh", "1234567");
        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo1 = new HamXayDungCoThamSo("Võ Thị Linh", "536636", "Hà Nôị");
        System.out.println(hamXayDungCoThamSo1.name);
        System.out.println(hamXayDungCoThamSo1.phone);
        System.out.println(hamXayDungCoThamSo1.address);
    }
}
