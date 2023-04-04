package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
//WE EXTENDS THE BASE TEST FOR CALLING THE METHODS WHICH CONTAIN THE IMPLEMENTATION OF LAUNCH THE BROWSER AND CLOSE THE BROWSER
public class ActiTimeValidTestCasesUpdate extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();// IT IS RESPONSIBLE FOR OPEN THE BROWSER
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.tearDown();
	}

}
