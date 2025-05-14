package books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import genericUtility.ListenerUtility;
import objectRepository.Homepage;
@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends Baseclass {
	@Test
	public void clickonBooks()
	{
		Homepage hp=new Homepage(driver);
		hp.getBookLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. ", "books page is not displayed");
		Reporter.log("Books page is displayed",true
				);
	}
}
