package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void login() {
		int res = 5/0;
		Reporter.log("Logged in!!!", true);
	}

	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void createUser() {
		Reporter.log("User is Created!!!", true);
	}

	@Test
	public void logout() {
		Reporter.log("Logged Out!!!", true);
	}
}