package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackgroundPage extends TestBasePage {
	WebDriver driver;
	
	public SkyBlueBackgroundPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Set SkyBlue Background')]") WebElement SetSkyBlueBackgroundButton_ELEMENT;
	

	
	public void clickOnSetSkyBlueBackgroundButton() {
		SetSkyBlueBackgroundButton_ELEMENT.click();
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}

}
