package jewellery;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class TC_DWS_005_Test extends Baseclass {
@Test
public void clickonJewellery() {
	Homepage hp=new Homepage(driver);
	hp.getJewelleryLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Jewelry", "Jewellery page is not displayed");
	Reporter.log("Jewellery page is displayed",true);
}
}
