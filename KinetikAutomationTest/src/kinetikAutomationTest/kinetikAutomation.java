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
	/*
	 * 8. Click the 'Register / Login' button
	 * 9. Sign up and create an account
	 * 10.Verify 'ACCOUNT CREATED!' and click the 'Continue' button
	 * 11. Verify ' Logged in as username' at top

	 */
	public void createAccountAndVerification() {
		driver.findElement(By.cssSelector("p.text-center a[href='/login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test User");
		WebElement emailInput = driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
		emailInput.sendKeys("heelouserrr123@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Signup')]")).click();
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("days")).sendKeys("4");
		driver.findElement(By.id("months")).sendKeys("April");
		driver.findElement(By.id("years")).sendKeys("1996");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.name("first_name")).sendKeys("Test");
		driver.findElement(By.name("last_name")).sendKeys("User");
		driver.findElement(By.name("company")).sendKeys("Company");
		driver.findElement(By.name("address1")).sendKeys("123 Test St");
		driver.findElement(By.name("address2")).sendKeys("Apt 1");
		driver.findElement(By.name("country")).sendKeys("Bangladesh");
		driver.findElement(By.name("state")).sendKeys("Chattogram");
		driver.findElement(By.name("city")).sendKeys("Chattogram");
		driver.findElement(By.name("zipcode")).sendKeys("12345");
		driver.findElement(By.name("mobile_number")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();

		// Verification

		WebElement accountCreated = driver.findElement(By.xpath("//b[contains(text(), 'Account Created!')]"));
		if (accountCreated.isDisplayed()) {
			System.out.println("ACCOUNT CREATED!");
			driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		}
		WebElement loggedInAs = driver.findElement(By.xpath("//a[contains(text(), 'Logged in as')]"));
		System.out.println(loggedInAs);
		if (loggedInAs.isDisplayed()) {
			System.out.println("Logged in as username");
		}

	}
}
