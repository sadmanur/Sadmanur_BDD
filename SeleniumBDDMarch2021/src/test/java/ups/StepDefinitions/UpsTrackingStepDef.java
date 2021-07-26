package ups.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.pageActions.UpsTrackingPageActions;
import ups.utilities.DriverSetup;

public class UpsTrackingStepDef {

	UpsTrackingPageActions upsTrackingPageActions = new UpsTrackingPageActions();

	@Given("Tracking number page is open")
	public void tracking_number_page_is_open() {
		System.out.println("Tracking Number page is open");
		upsTrackingPageActions.getUpsTrackingPage();

	}

	@When("User put the {string} in the box")
	public void user_put_the_in_the_box(String trackingBox) {
		upsTrackingPageActions.inputTrackingNumber(trackingBox);

	}

	@When("Click on the Track button")
	public void click_on_the_Track_button() {
		upsTrackingPageActions.clickTrackButton();
	}

	@Then("User should be able to track the package")
	public void user_should_be_able_to_track_the_package() {
		String expectedURL = "https://www.ups.com/track?loc=en_US&requester=ST/";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

	@Then("User should not be able to track the package")
	public void user_should_not_be_able_to_track_the_package() {
		String expectedURL ="https://www.ups.com/track?loc=en_US&requester=ST/";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL);
		
		
	}

}
