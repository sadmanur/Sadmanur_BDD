package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingPageElements {

	@FindBy(xpath = "//*[@id=\"stApp_trackingNumber\"]")
	public WebElement trackingBox;
	
	@FindBy(xpath = "//*[@id=\"stApp_btnTrack\"]")
    public WebElement trackButton;
	
	@FindBy(id = "stApp_error_alert_lbl1")
	public WebElement erroeMessages;
	
	



     public void enterTrackingNumber (String trackingNumber) {
    	 trackingBox.sendKeys("qwed2346ye8w900");
    	 trackingBox.sendKeys("rqau12637400202");
    	 trackingBox.sendKeys("rqrw12348375001");
     }
     
}