package loadpack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.FeedPage;

import static org.testng.Assert.*;

public class LoginTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = getDriver();
    }

/*
    Тестови:

    T1: Login with invalid credentials and check error message
    T2: Login with empty username and check error message
    T3: Login successfully and check if you are navigated to the homepage
*/


    //    T2: Login with invalid credentials and check error message
    @Test
    public void canNotLoginWithInvalidUserName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        try {
            loginPage.login(null, "password");
            fail("expected exception was not occurred.");
        }
        catch (IllegalArgumentException e){}
    }

    //T1: Login with invalid credentials and check error message
    @Test
    public void canNotLoginWithInvalidPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("standard_user", "password");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage, "Sorry, your password was incorrect. Please double-check your password.");
    }

    //T3: Login successfully and check if you are navigated to the homepage
    @Test
    public void shouldLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("skit_lab_3", "skitlab3");
        assertTrue(new FeedPage(driver).isLoaded());
    }
    //T3.1: Bonus - Should Logout
    @Test
    public void shouldLogout()throws InterruptedException{
        FeedPage feedPage = new FeedPage(driver);
        assertTrue(feedPage.isLoaded());
        feedPage.logout();
        assertTrue(new LoginPage(driver).isLoaded());
    }

    @Ignore
    @Test
    public void shouldOpen() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }




    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver_win32/chromedriver.exe");
        return new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}