package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackgroundPage extends TestBasePage {
	WebDriver driver;
	
	public WhiteBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Set White Background')]") WebElement SetWhiteBackgroundButton_ELEMENT;
	
	public void clickOnSetWhiteBackgroundBotton() {
		SetWhiteBackgroundButton_ELEMENT.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
