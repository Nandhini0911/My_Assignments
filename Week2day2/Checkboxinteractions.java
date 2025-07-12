package week2.day2.Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Checkboxinteractions {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("Guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement Notification= driver.findElement(By.xpath("//div[@class='ui-growl-message']"));
		String popup1=Notification.getText();
		System.out.println("Notification : "+ popup1);
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(5000);
		
		//Tri State Checkbox
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
		Thread.sleep(5000);
		//WebElement Tri_State_Checkbox= driver.findElement(By.xpath("//span[text()='State has been changed.']"));
		WebElement Tri_State_Checkbox= driver.findElement(By.xpath("//*[@id=\"j_idt87:id_container\"]/div/div/div[2]/p"));
		String popup2=Tri_State_Checkbox.getText();
		if(popup2.equals("State = 1"))
		{
			System.out.println("Tri State Checkbox: Selected");
		}
		else if(popup2.equals("State = 2"))
		{
			System.out.println("Tri State Checkbox: Deselected");
		}
		else
		{
			System.out.println("Tri State Checkbox: Notselected");
		}
		
		//Toggle Switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		Thread.sleep(5000);
		WebElement ToggleSwitch=driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String popup3=ToggleSwitch.getText();
		System.out.println("ToggleSwitch : "+ popup3);
		
		//Verify if check box is disabled
		WebElement disabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		if(true==disabled.isSelected())
		{
			System.out.println("Verify if check box is disabled : Not disabled");
		}
		else{System.out.println("Verify if check box is disabled : disabled");}
		
		//Select Multiple
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Miami");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[1]/label")).click();
		driver.close();
		
	}
}
