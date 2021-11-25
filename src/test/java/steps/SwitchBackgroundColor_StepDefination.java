package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.SkyBlueBackgroundPage;
import pages.TestBasePage;
import pages.WhiteBackgroundPage;

public class SwitchBackgroundColor_StepDefination extends TestBasePage {

	SkyBlueBackgroundPage skyBlueBackground;
	WhiteBackgroundPage whiteBackground;

	@Before
	public void beforeRun() {
		initDriver();

		skyBlueBackground = PageFactory.initElements(driver, SkyBlueBackgroundPage.class);
		whiteBackground = PageFactory.initElements(driver, WhiteBackgroundPage.class);
	}

	@Given("^Set SkyBlue Background button and Set White Background button exists$")
	public void set_SkyBlue_Background_button_and_Set_White_Background_button_exists() throws Throwable {
		driver.get("http://techfios.com/test/101/");
		Thread.sleep(2000);
		if (driver.getPageSource().contains("NSS-TODO List v 1.1"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);

	}
	
	@When("^User click on the Set SkyBlue Background button$")
	public void user_click_on_the_Set_SkyBlue_Background_button() throws Throwable {
		
		skyBlueBackground.clickOnSetSkyBlueBackgroundButton();
		Thread.sleep(2000);
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		
		takescreenshot(driver);
	}

	@Then("^User click on the Set White Background button$")
	public void user_click_on_the_Set_White_Background_button() throws Throwable {

		whiteBackground.clickOnSetWhiteBackgroundBotton();
		Thread.sleep(2000);
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	  
		takescreenshot(driver);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}



	

