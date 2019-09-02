import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailToFriend {


        public static WebDriver driver;
        public static void main (String[] args){
            System.setProperty("webdriver.chrome.driver","src\\BrowserDrivers\\chromedriver.exe");

            //open the browser
            driver = new ChromeDriver();

            //maximise the browser window screen
            driver.manage().window().fullscreen();

            //set implicity wait for driver object
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //open the website
            driver.get("https://demo.nopcommerce.com");

            //click on Login
            driver.findElement(By.className("ico-login")).click();

            //Enter the Email:
            driver.findElement(By.id("Email")).sendKeys("testtest@test53.com");

            //Enter the password
            driver.findElement(By.name("Password")).sendKeys("lucky1");

            //Click on Login
            driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

            //click on Electrical
            driver.findElement(By.xpath("//h2/a[@title=\"Show products in category Electronics\"]")).click();

            //click on Apple
            driver.findElement(By.linkText("Apple")).click();

            //click on AppleMacBook Pro 13-inch
            driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();

            //Click on Email a friend
            driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();

            //input the friend email address
            driver.findElement(By.className("friend-email")).sendKeys("purvippatel80@gmail.com");

            //Enter the personal message
            driver .findElement(By.id("PersonalMessage")).sendKeys("do you want this MacBook Pro");

            //click on send email
            driver.findElement(By.xpath("//div/input[contains(@type, 'submit')]")).click();

            driver.manage().timeouts().implicitlyWait(50 ,TimeUnit.SECONDS);

            //click on Logout
            //driver.findElement(By.linkText("Log out")).click();

            //close the browser window
            driver.close();



}
}
