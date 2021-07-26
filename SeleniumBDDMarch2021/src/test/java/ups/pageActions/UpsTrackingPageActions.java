package ups.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import ups.pageElements.UpsTrackingPageElements;
import ups.utilities.DriverSetup;

public class UpsTrackingPageActions {


	UpsTrackingPageElements trackingElements;

		public UpsTrackingPageActions() {

			this.trackingElements = new UpsTrackingPageElements();

			// initElements(WebDriver driver, Object page)
			PageFactory.initElements(DriverSetup.chromeDriver, trackingElements);

		}

		public void getUpsTrackingPage() {
			DriverSetup.chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
			DriverSetup.chromeDriver.manage().window().maximize();
			DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		public void inputTrackingNumber(String trackingBox) {
		   trackingElements.trackingBox.sendKeys(trackingBox);

		}

		public void clickTrackButton() {
			trackingElements.trackButton.click();
		}

		public String errorMessage() {
			String error = trackingElements.erroeMessages.getText();
			return error;
		}

	}


