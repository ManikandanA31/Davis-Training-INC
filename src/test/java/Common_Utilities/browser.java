package Common_Utilities;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Initialize Scanner to get input in runtime 
		Scanner scan = new Scanner(System.in);

		// Initialize WebDriver and open Browser Location
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\New\\chromedriver.exe");
		driver = new ChromeDriver();

		// Get and open the URL
//		String url = scan.nextLine();
		String url = "http://182.74.129.6/demo/sss/dti_laravel/public/login";
		driver.get(url);
		
		
		//Get and Insert User Name and Password
		System.out.println(" Enter User Name or email :");
		String UName = scan.nextLine();
		driver.findElement(By.id("email")).sendKeys(UName);
		
		System.out.println(" Enter your Password :");
		String PWrd = scan.nextLine();
		driver.findElement(By.id("password")).sendKeys(PWrd);
		
		//Click Submit
		driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/button")).click();


	}

}
