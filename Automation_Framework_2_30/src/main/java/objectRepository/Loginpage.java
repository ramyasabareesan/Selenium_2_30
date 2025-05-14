package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id = "Email")
private WebElement emailText;
@FindBy(id = "Password")
private WebElement PasswordText;
@FindBy(xpath = "//input[@value='Log in']")
private WebElement loginBtn;

public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getEmailText() {
	return emailText;
}

public WebElement getPasswordText() {
	return PasswordText;
}

public WebElement getLoginBtn() {
	return loginBtn;
}



}
