package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_pom {
@FindBy(xpath="//input[@name='firstname'] ")   private WebElement firstname ;
	
	@FindBy(xpath="//input[@name='lastname'] ") private WebElement lastname ;
	
	@FindBy(xpath="//input[@data-type='password'] ") private WebElement   passwrd ;
	
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement Mobno ;
	
	
	@FindBy(xpath="//button[@name='websubmit']") private WebElement signupbtn ;
	
	Signup_pom( WebDriver driver      )  {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterfirstname  (String name) {
		firstname.sendKeys(name );
		}	
		
		public void  enterlastname(String lname) {
		lastname.sendKeys(lname);
		}	
		

		public void  enterMobno( String num) {
		 Mobno.sendKeys(num);;
		}	
		 
		public void enterpassword( String pass) {
		passwrd.sendKeys(pass);
		}	 
	
		public void clicksignupbtn () {
			signupbtn.click();
			}	
			
}
