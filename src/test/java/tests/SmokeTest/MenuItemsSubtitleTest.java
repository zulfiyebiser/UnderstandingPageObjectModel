package tests.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;


public class MenuItemsSubtitleTest extends TestBase {

    @DataProvider(name="MenuData")
    public Object [][] data(){
        return new Object [][]{
                {"Activity Stream","Activity Stream"},
                {"Tasks","My tasks"},
                {"Workgroups","Workgroups and projects"},
                {"Drive","My Drive"},
                {"Calendar","Calendar"},
                {"Mail","Mailbox Integration"},
                {"Contact Center","Contact Center"},
                {"Time and Reports","Absence Chart"},
                {"Employees","Company Structure"},
                {"Services","Meeting Rooms"},
                {"Company","Company"}

        };
    }

    @Test(dataProvider = "MenuData")
    public void menuItemTest(String menuItem, String pageSubtitle){
        LoginPage loginPage= new LoginPage();
        loginPage.login();
        loginPage.menuNavigation(menuItem);
        String expectedTitle = pageSubtitle;
        String actualTitle= loginPage.getPageSubtitle();
        Assert.assertEquals(actualTitle,expectedTitle,menuItem+ " Page Subtitle is wrong");
    }

//    @Test(description = "verify that page subtile is correct for activity stream")
//    public void test1(){
//        LoginPage loginPage= new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Activity Stream");
//        String expectedTitle = "Activity Stream";
//        String actualTitle = loginPage.getPageSubtitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Activity Steam page subtitle is wrong");
//    }
//
//    @Test(description = "Verify that page subtitle is correct for Tasks")
//    public void test2(){
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        loginPage.menuNavigation("Tasks");
//        String expectedTitle ="My tasks";
//        String actualTitle= loginPage.getPageSubtitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Tasks page subtitle is wrong ");
//    }
}