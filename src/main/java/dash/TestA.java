package dash;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestA 
{
	public static WebDriver driver;
	

    public static void main(String browser) throws InterruptedException {
    	
	
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      
        // Maximize the browser window or set up other configurations
        driver.manage().window().maximize();
        driver.get("https://institute.leo1.in/institute/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Perform login and navigation
        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("sudhanshu.sahu@leo1.in");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("GLF@473363");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("(//span[@class='ps-menu-label css-12w9als'])[2]")).click();
}
}

////        Thread.sleep(2000);  // Consider using WebDriverWait instead of Thread.sleep
//        driver.findElement(By.xpath("//span[text()='Leo1 Card']")).click();
//        driver.findElement(By.xpath("//span[text()='Pre-Issuance']")).click();
//        driver.findElement(By.xpath("(//span[text()='Dashboard'])[2]")).click();
//        Thread.sleep(1000);  // Consider using WebDriverWait instead of Thread.sleep
//        driver.findElement(By.xpath("//u[text()='Show']")).click();
//        Thread.sleep(2000);  // Consider using WebDriverWait instead of Thread.sleep
//
//        WebElement wb = driver.findElement(By.xpath("//input[@placeholder='Applicant Full Name']"));
//        wb.sendKeys("RefTest");
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//        driver.findElement(By.xpath("//span[text()='Search By Student']")).click();
//    }

		
	
		
	


