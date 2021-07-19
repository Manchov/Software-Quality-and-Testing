package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FeedPage extends BasePage {

    public FeedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[1]/a/div/div/img"))).isDisplayed();
    }
    public void logout() throws InterruptedException{
        Thread.sleep(500);
        //save login data popup
        if (driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/div/button")).isDisplayed())
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/div/button")).click();
        Thread.sleep(1000);
        //send notifications popup
        if (driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).isDisplayed())
            driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[5]/span/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div")).click();
        Thread.sleep(1000);
    }
    //#f3f1a31df79fb44 > div > div > div
    ///html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div

}
