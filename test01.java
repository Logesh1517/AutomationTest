package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // creating object for chrome driver
		driver.get("https://www.saucedemo.com/v1/"); // opening the web page using the url provided
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // enter username by using unique id value in username script
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // enter password by using unique id value in password script
driver.findElement(By.className("btn_action")).click(); // use click function to login by using unique classname in login script
	}

}
