package package123;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flower {

	public static void main(String[] args)throws Exception  {
		
		System.setProperty("webdriver.chrome.driver" ,".\\drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();

    driver.get("http://talentify.in/index.jsp");
    driver.findElement(By.xpath("//div[@id='navbar-collapse-1']/ul/li[7]/a")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("bhanuchander410@gmail.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("test123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[3]/a")).click();
    driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[3]/ul/li[2]/a")).click();
 
  }
}
