import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class TC_DWS_004_Test extends Baseclass{
@Test
public void clickonGiftcardsLink()
{
	Homepage hp=new Homepage(driver);
	hp.getGiftcardsLink().click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Giftcards", "Giftcards link is not displayed");
	Reporter.log("Giftcards page is displayed",true);
	
}
}
