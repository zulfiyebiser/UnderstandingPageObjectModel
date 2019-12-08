package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;

public class TestTrials extends TestBase {

    @Test(description = "Verify login")
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        System.out.println(Driver.get().getTitle());
//        loginPage.navigateToDrive();
//        BrowserUtils.wait(2);
//        loginPage.navigateToCalendar();
//        BrowserUtils.wait(2);

        loginPage.menuNavigation("Tasks");
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.wait(2);
        loginPage.menuNavigation("Mail");
        System.out.println(loginPage.getPageSubtitle());
        BrowserUtils.wait(2);
    }
}