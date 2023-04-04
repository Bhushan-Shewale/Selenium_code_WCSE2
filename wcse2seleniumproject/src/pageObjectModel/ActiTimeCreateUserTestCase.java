package pageObjectModel;

import java.io.IOException;

public class ActiTimeCreateUserTestCase extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password") );
		
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnusers();
		
		Thread.sleep(2000);
		
		UserPage up = new UserPage(driver);
		up.userCreate();
		Thread.sleep(2000);
		String usn = flib.readExcelData(EXCEL_PATH, "userdata",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "userdata",1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "userdata",1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "userdata",1, 3);
		up.firstUser(usn,pass,fn,ln);

	}

}
