import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOnePlus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Documents\\JavaProgramming\\MySeleniumDemo\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(000);
		driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("onepluse",Keys.ENTER);
		
//		driver.close();
	}
}
