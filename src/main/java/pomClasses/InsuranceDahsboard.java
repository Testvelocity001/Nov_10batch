package pomClasses;

public class KiteLoginPage {
	
	@findBy (xpath ="//a") private WebElement fName
	@findBy (xpath ="//a") private WebElement lName
	@findBy (xpath ="//a") private WebElement mName
	@findBy (xpath ="//a") private WebElement mob
	@findBy (xpath ="//a") private WebElement email
	
	KiteLoginPage() {
		
	}
	
}
