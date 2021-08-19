package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1 : Launch webdriver
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3 : Add FB link
		driver.get("https://en-gb.facebook.com");
		
		// Step 4 : Get title
		String Title = driver.getTitle();
		
		//step 5: Tile
		System.out.println(Title);
		
		//Step 6 : Maximize screen
	    driver.manage().window().maximize();
	    
		//Step 7 : Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Step 8 : Click on create account
		WebElement webuser = driver.findElement(By.linkText("Create New Account"));
		webuser.click();
		
		// Step 9 : Send first name
		driver.findElement(By.name("firstname")).sendKeys("Poo");
		
		// Step 10 : Send last name
		driver.findElement(By.name("lastname")).sendKeys("Siva");
		
		// Step 11 : Send mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9003424061");
		
		 //Step 12 : create password
		driver.findElement(By.id("password_step_input")).sendKeys("Mahat11");
		
		//Step 13 : Drop down Date
		WebElement Date = driver.findElement(By.id("day"));
		Select Birthdate = new Select(Date);
		Birthdate.selectByIndex(9);
		
		//Step 14 : Drop down Month
		WebElement Birthmonth = driver.findElement(By.name("birthday_month"));
		Select Month = new Select(Birthmonth);
		Month.selectByValue("2");
		
		//Step 15 : Drop Down Year
		WebElement Birthyear = driver.findElement(By.name("birthday_year"));
		Select Year = new Select(Birthyear);
		Year.selectByVisibleText("1995");
		
		//Step 16 : Radio button sex
		driver.findElement(By.name("sex")).click();
		
		//Step 17 : Click Signup
		driver.findElement(By.name("websubmit")).click();
			
	}

}
