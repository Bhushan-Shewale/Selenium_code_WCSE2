package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	@Test(priority = 1)
	public void login() {
		Reporter.log("Logged in!!!", true);
	}

	@Test(priority = 1)
	public void createUser() {
		Reporter.log("User is Created!!!", true);
	}

	@Test(priority = 2)
	public void logout() {
		Reporter.log("Logged Out!!!", true);
	}
}
