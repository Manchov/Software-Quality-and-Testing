package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.instagram.com/");
    }

    public boolean isLoaded() throws InterruptedException {
        Thread.sleep(1000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).isDisplayed();
    }

    public void login(String user, String password) throws InterruptedException {
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(user);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
        Thread.sleep(1000);
    }



    public String getErrorMessage() {
        WebElement errorPage = driver.findElement(By.xpath("//*[@id=\"slfErrorAlert\"]"));
        return errorPage.getText();
    }
}
