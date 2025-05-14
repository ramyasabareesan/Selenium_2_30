package computers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class TC_DWS_002_Test extends Baseclass{
	@Test
	public void clickonComputers()
	{
		Homepage hp=new Homepage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","Computers page is not displayed");
		Reporter.log("Computers page is displayed",true);
	}

}
