package Buoi14.Protected;

import Buoi14.Common.BasePage;

public class DashboadPage extends BasePage {
    public void getDriver(){
        System.out.println(driver);
    }


    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.inputemail);
        System.out.println(loginPage.inputpass);

        DashboadPage dashboadPage = new DashboadPage();

        System.out.println(dashboadPage.driver);

        BasePage basePage = new BasePage();
        //basePage.driver;
    }
}
