import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	    public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome.driver", "C:\\Users\\Jagdamb\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		// firstname and lastname test cases
		
		WebElement wb1 = driver.findElement(By.name("firstname"));
		wb1.sendKeys("anita");
		
        WebElement wb2 = driver.findElement(By.name("lastname"));
		wb2.sendKeys("gole");
		
		//email id and password test cases
		
		WebElement wb3 = driver.findElement(By.name("reg_email__"));
		wb3.sendKeys("anita@gmail.com");
		
        WebElement wb4 = driver.findElement(By.name("reg_passwd__"));
		wb4.sendKeys("123456");
		
		
		
		
	}

}
