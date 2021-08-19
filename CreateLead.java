package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().window().maximize();
		 
		 //wait for 10s
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //
		 WebElement webUser = driver.findElement(By.id("username"));
		 
		 webUser.sendKeys("demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
         driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poo");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tamil");
		 
		 WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));	
		Select drpDwn = new Select(drop1);
		drpDwn.selectByIndex(2);
		
		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));	
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("IND_HARDWARE");
		
		WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));	
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("Partnership");
		 
		WebElement drop4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn4 = new Select(drop4);
		drpDwn4.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kulali");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Analyst");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("27-03-1994");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("symbol");
        
		WebElement drop5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn5 = new Select(drop5);
		drpDwn5.selectByValue("AFA");
		
		WebElement Countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		Countrycode.clear();
		Countrycode.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636008");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9003223333");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kulalisiva17@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://facebook.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address 1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address 2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		
		WebElement drop6 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drpDwn6 = new Select(drop6);
		drpDwn6.selectByIndex(4);
		
		driver.findElement(By.name("submitButton")).click();	
		
	}

}
