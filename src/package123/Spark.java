package package123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Spark {

	public static void main(String[] args) throws InterruptedException {
		

				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.google.com");
				driver.findElement(By.id("identifierId")).clear();
			    driver.findElement(By.id("identifierId")).sendKeys("bhanuchander410@gmail.com");
			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.name("password")).sendKeys("9394781895");
			    
			    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
			    driver.findElement(By.cssSelector("content.CwaK9")).click();
			    driver.findElement(By.cssSelector("a.WaidBe")).click();
			    
			}
	}

