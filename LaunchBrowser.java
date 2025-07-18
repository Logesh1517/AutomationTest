package week1;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
		WebElement element = driver.findElement(By.id("username")); //30-1 29
		element.sendKeys("demo");//30-25 5
		element.clear();//30 0.1
		
		Thread.sleep(500);
		element.sendKeys("demosalesmanager");//30
		
		
		// name
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		// tag name
		String text = driver.findElement(By.tagName("label")).getText();

		System.out.println(text);
		// classname linkText partiala linkText tagname xpath css

		driver.findElement(By.className("decorativeSubmit")).click();

		// partialLinktext

		driver.findElement(By.partialLinkText("CR")).click();

		// linkText
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		driver.findElement(By.className("smallSubmit")).click();
		String name1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name1);
		String name2= sc.next();
		if(name2.equals(name1)) {
			System.out.println("verified");
		}
	}

}
