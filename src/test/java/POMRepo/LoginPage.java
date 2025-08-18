package POMRepo;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Decalaration

	@FindBy(id = "user-name")
	private WebElement userTextField;

	@FindBy(css = "[placeholder=\"Password\"]")
	private WebElement passwordTextField;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement loginButton;

	//getter methods
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business Logics
	public void loginToApp(String username,String password)
	{
		userTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	{
		
	}

}
