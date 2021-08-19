package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Poonguzhali");
		
		driver.findElement(By.name("UserLastName")).sendKeys("Tamil");
		
		driver.findElement(By.name("UserEmail")).sendKeys("kulali369@gmail.com");
		
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select Drop1 = new Select(jobtitle);
		Drop1.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Wipro");
		
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select Drop2 = new Select(employee);
		Drop2.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9002384761");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select Drop3 = new Select(country);
		Drop3.selectByIndex(5);
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();
		
	
		
		
		
		
		
		

	}

}
