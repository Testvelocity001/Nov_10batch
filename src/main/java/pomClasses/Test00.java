package pomClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test00 {
	 
		@Test (groups="Login") 
		public void tc01 () {
		 Reporter.log("TC-01  is Executed " ,true);
		}
		 
		@Test(groups="signup")  
		public void tc02 () {
			 Reporter.log("TC-02  is Executed " ,true);
		}	
		@Test(groups="homepage")  
		public void tc03 () {
			 Reporter.log("TC-03   is Executed " ,true);
		}
}
