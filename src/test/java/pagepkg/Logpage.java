package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpage {
    WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement pswd;

	@FindBy(id="login-button")
	WebElement loginbutton;
	

	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
	WebElement addToCartbtn1;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
	WebElement addToCartbtn2;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button")
	WebElement addToCartbtn3;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
	WebElement addToCartbtn4;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/button")
	WebElement addToCartbtn5;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")
	WebElement addToCartbtn6;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
	WebElement cartbutton;

	@FindBy(id="checkout")
	WebElement checkOut;
	
	@FindBy(id="first-name")
	WebElement firstnameField;
	
	@FindBy(id="last-name")
	WebElement lastnameField;

	@FindBy(id="postal-code")
	WebElement postal;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(id="finish")
    WebElement finishBtn;
	
	@FindBy(id="back-to-products")
	WebElement backBtn;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menuBtn;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutBtn;
	
	public Logpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void setvalue(String userName, String pwd) {
		// TODO Auto-generated method stub
		usernameField.sendKeys(userName);
		pswd.sendKeys(pwd);
	}
	

	
	
	public void clickLogin() {
		// TODO Auto-generated method stub
		loginbutton.click();
	}
	
	public void addtocart() {
		addToCartbtn1.click();
		addToCartbtn2.click();
		addToCartbtn3.click();
		addToCartbtn4.click();
		addToCartbtn5.click();
		addToCartbtn6.click();
		cartbutton.click();
		for(int i=1;i<=6;i++)
		{
			
		}
	}
	
	public void checkoutBtn() {
		checkOut.click();
	}
	
	public void setInfoValues(String firstName, String lastName,String postalCode) {
		// TODO Auto-generated method stub
		firstnameField.sendKeys(firstName);
		lastnameField.sendKeys(lastName);
		postal.sendKeys(postalCode);
	}
	
	public void clickFinal()
	{
		continueBtn.click();
		finishBtn.click();
		backBtn.click();
	}
	
	public void clickLogout()
	{
		menuBtn.click();
		logoutBtn.click();
	}
	
}
