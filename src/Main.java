import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        String url = "https://the-internet.herokuapp.com/nested_frames";
        driver.get(url);
        driver.manage().window().maximize();
        driver.getTitle();
        System.out.print(driver.getTitle());
        Actions act = new Actions(driver);   //for double clicking
        driver.switchTo().frame("frame-top");


        //Accessing middle frame

        driver.switchTo().frame("frame-middle");
   WebElement text =  driver.findElement(By.id("content"));
        act.doubleClick(text).perform();

driver.getTitle();

        //     System.out.println(SliderLocation);
    }
}