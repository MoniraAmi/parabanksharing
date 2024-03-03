package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewSelePageFactory {
	
	public NewSelePageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@class='fa fa-lock']")
	private WebElement pagelogin;

	public WebElement getPagelogin() {
		return pagelogin;
	}
	
	
		
		
		@FindBy(xpath = "//*[@name='email'])[1]")
		private WebElement putusername;

		public WebElement getPutusername() {
			return putusername;
		}
		@FindBy(xpath = "//*[@name='password']")
		private WebElement getPassword;

		public WebElement getGetPassword() {
			return getPassword;
		}
		@FindBy(xpath = "//*[text()='Login']")
		private WebElement getLoginClick;

		public WebElement getGetLoginClick() {
			return getLoginClick;
		}
		
		
	}
	
