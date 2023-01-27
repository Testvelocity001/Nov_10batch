package testClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC004 {

	@FindBy (xpath ="//a") private WebElement fName1;
	@FindBy (xpath ="//a") private WebElement lName1;
	@FindBy (xpath ="//a") private WebElement sName1;
	@FindBy (xpath ="//a") private WebElement mob1;	
	@FindBy (xpath ="//a") private WebElement email1;
	@FindBy (xpath ="//a") private WebElement dob;	
}
