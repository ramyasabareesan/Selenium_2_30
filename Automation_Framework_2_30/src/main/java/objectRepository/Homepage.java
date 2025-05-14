package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Homepage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLink;
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelleryLink;
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getBookLink() {
		return bookLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getJewelleryLink() {
		return jewelleryLink;
	}
	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}
	
	

}
