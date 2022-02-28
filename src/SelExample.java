import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelExample{
    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","/Users/swarajsourav/Documents/Selenium/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.amazon.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com ");

                WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }

}