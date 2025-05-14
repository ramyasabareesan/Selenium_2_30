package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
@FindBy(linkText = "Register")
private WebElement registerLink;
@FindBy(linkText = "Log in")
private WebElement loginLink;
@FindBy(linkText = "Wishlist")
private WebElement WishlistLink;
@FindBy(linkText = "Shopping cart")
private WebElement shoppingLink;
public Welcomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getRegisterLink() {
	return registerLink;
}
public WebElement getLoginLink() {
	return loginLink;
}
public WebElement getWishlistLink() {
	return WishlistLink;
}
public WebElement getShoppingLink() {
	return shoppingLink;
}


}
