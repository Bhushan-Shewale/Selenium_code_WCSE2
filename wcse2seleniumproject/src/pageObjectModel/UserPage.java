package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement CreateNewUserButton;
	@FindBy(name = "username")
	private WebElement UsernameTB;
	@FindBy(name = "passwordText")
	private WebElement PasswordTB;
	@FindBy(name = "passwordTextRetype")
	private WebElement retypePasswordTB;
	@FindBy(name = "firstName")
	private WebElement FirstNameTB;
	@FindBy(name = "lastName")
	private WebElement LastNameTB;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createButton;
	@FindBy(xpath = "//input[@type='button' and @value='      Cancel      ']")
	private WebElement cancelButton;

	public UserPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewUserButton() {
		return CreateNewUserButton;
	}

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	// OPERATIONAL METHODS

	public void userCreate() {
		CreateNewUserButton.click();
	}

	public void firstUser(String usn, String pass, String fn, String ln) throws InterruptedException {
		UsernameTB.sendKeys(usn);
		Thread.sleep(2000);
		PasswordTB.sendKeys(pass);
		Thread.sleep(2000);
		retypePasswordTB.sendKeys(pass);
		Thread.sleep(2000);
		FirstNameTB.sendKeys(fn);
		Thread.sleep(2000);
		LastNameTB.sendKeys(ln);
		Thread.sleep(2000);
		createButton.click();
	}

}
