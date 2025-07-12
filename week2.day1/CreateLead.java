package week2.day1.Assignment;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("v");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KNA");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("KNA_Title");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Title is displayed correctly");
		}
		else
		{
			System.out.println("Title is not displayed correctly");
		}
		driver.close();
	}

}
