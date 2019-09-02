import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

        protected static WebDriver driver;

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src\\BrowserDrivers\\chromedriver.exe");

            //open the browser
            driver = new ChromeDriver();

            //maximise the browser window screen
            driver.manage().window().fullscreen();

            //set implicity wait for driver object
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            //open the website
            driver.get("https://demo.nopcommerce.com");

            //click on register button
            driver.findElement(By.xpath("//a[@class='ico-register']")).click();


            //enter the first name
            driver.findElement(By.id("FirstName")).sendKeys("Purvi");

            //enter the lastname
            driver.findElement(By.xpath("//input[@name ='LastName']")).sendKeys("Patel");

            //Enter Email
            driver.findElement(By.name("Email")).sendKeys("testtest@test54.com");

            //enter the password
            driver.findElement(By.xpath("//input[contains(@name, 'Password')]")).sendKeys("lucky1");

            //enter the confirm password
            driver.findElement(By.name("ConfirmPassword")).sendKeys("lucky1");

            //click on Register
            driver.findElement(By.id("register-button")).click();

            //click on continue
           // driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();

            //close the browser window
            driver.close();

        }
}