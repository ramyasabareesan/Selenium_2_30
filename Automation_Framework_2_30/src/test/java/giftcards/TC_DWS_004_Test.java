package giftcards;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class TC_DWS_004_Test extends Baseclass {
@Test
public void clickonGiftcards() {
	Homepage hp=new Homepage(driver);
	hp.getGiftcardsLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "giftcards page is not displayed");
	Reporter.log("Giftcard is displayed",true);
}
}
