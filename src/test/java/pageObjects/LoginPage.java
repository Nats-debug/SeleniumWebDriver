package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators

	@FindBy(xpath = "//input[@id='txtUserName']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement btnClick;

	@FindBy(xpath = "//div[contains(text(),\"Manager's Dashboard\")]")
	WebElement dashboardMessage;

	// Action Methods

	public void setUserName(String usernameValue) {
		username.sendKeys(usernameValue);
	}

	public void setPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void clickLoginButton() {
		btnClick.click();
	}

	// sol2
	// btnContinue.submit();

	// sol3
	// Actions act=new Actions(driver);
	// act.moveToElement(btnContinue).click().perform();

	// sol4
	// JavascriptExecutor js=(JavascriptExecutor)driver;
	// js.executeScript("arguments[0].click();", btnContinue);

	// Sol 5
	// btnContinue.sendKeys(Keys.RETURN);

	// Sol6
	// WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	// mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();

	public String getDashboardMessage() {
		return dashboardMessage.getText();
	}

	public boolean isDashboarPageExist() {

		try {

			return (dashboardMessage.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
}
