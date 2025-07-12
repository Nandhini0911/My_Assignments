package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) 
	{
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("Guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("N&K");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("NAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("KAR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("NAN");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Demo");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Demofornan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhinikumaran09@gmail.com");
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1=new Select(State);
		sel1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
