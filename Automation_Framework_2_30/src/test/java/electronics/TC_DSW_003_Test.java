package electronics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class TC_DSW_003_Test extends Baseclass{
@Test
public void clickonElectronics() {
	Homepage hp=new Homepage(driver);
	hp.getElectronicsLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not displayed");
	Reporter.log("Electronics page is displayed",true);
}
}
