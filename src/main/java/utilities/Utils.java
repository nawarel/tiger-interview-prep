package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.Base;

public class Utils extends Base {

	
	
	
	public static void hoveMouseOverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static String getTextFromUI(WebElement element) {
		String textFromUI = element.getText();
		return textFromUI;
	}
}
