package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) 
	{
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("Guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("AarushYugan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement IndustryDD=driver.findElement(By.name("industryEnumId"));
		Select sel1=new Select(IndustryDD);
		sel1.selectByIndex(3);
		
		WebElement OwnershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select sel2=new Select(OwnershipDD);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement SourceDD=driver.findElement(By.id("dataSourceId"));
		Select sel3 = new Select(SourceDD);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarketingCampaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select sel4 = new Select(MarketingCampaignDD);
		sel4.selectByIndex(6);
		
		WebElement StateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5 = new Select(StateDD);
		sel5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement Accountname = driver.findElement(By.xpath(("(//span[@class='tabletext'])[3]")));
		String Name = Accountname.getText();
		
		if(Name.equals(Accountname.getText()))
		{
			System.out.println("Expected output");
		}
		else
		{
			System.out.println("No Expected output");
		}
		
		driver.close();
	}
}