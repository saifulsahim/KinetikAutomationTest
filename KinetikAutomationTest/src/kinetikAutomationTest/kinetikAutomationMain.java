package kinetikAutomationTest;

public class kinetikAutomationMain {

	public static void main(String[] args) {
		kinetikAutomation script = new kinetikAutomation();
		script.invokeBrowser();
		script.isHomePageVisible();
		script.addToCart();

	}

}
