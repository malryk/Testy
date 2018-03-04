import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Konwencyjny {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk");

       // WebElement link = driver.findElement(By.xpath(".//a[@href = '/chapter1']"));
        //link.click();
        WebElement text = driver.findElement(By.id("q"));
        text.sendKeys("niechciales");
        text.clear();
        text.sendKeys("chciales");
    }
}
