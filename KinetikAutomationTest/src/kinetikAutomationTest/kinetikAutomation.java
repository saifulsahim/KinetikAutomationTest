package kinetikAutomationTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kinetikAutomation {
	WebDriver driver;

	/*
	  1. Launching Chrome browser
	  2. Navigating to Chrome browser
	*/
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
	}

	// 3. Verify that the home page is visible successfully
	public void isHomePageVisible() {
		WebElement homePage = driver.findElement(By.className("category-products"));

		if (homePage.isDisplayed()) {
			System.out.println("Home page is visible successfully.");
		} else {
			System.out.println("Home page is not visible.");
		}
	}

	// 4. Adding product to the cart
	public void addToCart() {
		driver.findElement(By.xpath("//a[contains(@href, '/product_details/1')]")).click();
		driver.findElement(By.cssSelector(".btn.btn-default.cart")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(360));
		driver.findElement(By.cssSelector(".modal-footer .btn-success")).click();
	}
	
	/*
	  5. Clicking cart button
	  6. Verify that the cart page is displayed
	  7. Clicking Proceed To Checkout
	*/
	public void viewCartAndCheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		WebElement cartPage = driver.findElement(By.xpath("//a[contains(@href, '/product_details/1')]"));
		System.out.println(cartPage);
		if (cartPage.isDisplayed()) {
			System.out.println("Cart page is displayed successfully.");
		}
		driver.findElement(By.className("check_out")).click();
	}

}
