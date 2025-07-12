package week2.day2.Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebookregistrationprocess {

	public static void main(String[] args) 
	{	
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("Guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("nandhinikumaran09@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Nan@09");
		
		WebElement DayDD=driver.findElement(By.id("day"));
		Select sel1=new Select(DayDD);
		sel1.selectByIndex(8);
		
		WebElement MonthDD=driver.findElement(By.id("month"));
		Select sel2=new Select(MonthDD);
		sel2.selectByVisibleText("Nov");
		
		WebElement YearDD=driver.findElement(By.id("year"));
		Select sel3=new Select(YearDD);
		sel3.selectByValue("1998");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
	}

}
