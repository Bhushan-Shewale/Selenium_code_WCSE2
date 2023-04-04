package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();//IT IS RESPONSIBLE FOR OPEN THE BROWSER AND LAUNCH THE BROWSER.
		
		Flib flib = new Flib();//IT CAN CONTAIN GENERIC REUSABLE METHODS
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username") ,flib.readPropertyData(PROP_PATH, "password") );
		//IT IS USED FOR THE GENARALIZED THE SCRIPT IT IS ASKING FOR PROPERTY PATH AND PROPERTY KEY 

	}

}
