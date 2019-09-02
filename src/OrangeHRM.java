import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {


        protected static WebDriver driver;
        public static void main (String[] args) {

            System.setProperty("webdriver.chrome.driver", "src\\BrowserDrivers\\chromedriver.exe");

            //open the Browser
            driver = new ChromeDriver();

            driver.manage().window().fullscreen();

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            //open the website
            driver.get("https://opensource-demo.orangehrmlive.com");

            //enter the username
            driver.findElement(By.name("txtUsername")).sendKeys("Admin");

            //enter the Password
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

            //click on login
            driver.findElement(By.id("btnLogin")).click();

            //click on welcome admin
            driver.findElement(By.xpath("//a[@href=\"#\" and @class=\"panelTrigger\"]")).click();

            //click on logout
            driver.findElement(By.linkText("Logout")).click();

            //close the browser window
            driver.close();
        }}
