package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiOnIdLocatorHP {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login3.id.hp.com/login3?flow=https://directory.id.hp.com/directory/v1/authentication/login/AWGh19gjTkfe4BkNCgWKH1qxUBTzAAAAAAAAAADCXdurUFt8ivv2-Do3VDLzm7sL5-o9vmbC6iWmzexc1RSYxf0ztuc1n8hxH7tbNcMJRVecyLq-JcvHkNSwxieSS9lODN5UmLVoyXHY_SZg5e-ENRSO41DIJ6eevS-lZ0Y0Wbc9HUyGFyrYdX7hlyewQozT2ybe6GZiCfaqv4a_jZG092rZrZzhdm4zC9HwQ7q6h-UaQ6l1qbHLLZHtSpMPGE65KktovE7GRy9ALk_OQH8nzGMqdDZAeiEybkEbBGPV2vkLQLKXCZNQMFAabTv_U5unGPLUvLu1QSsmrzUOS8odJiHuGoC9FA8JkAD3qZz5N5HXJlfUL1w4f2hd9tPOkkdjaJ7ognqv7MIzldRo3kHpsFkVspAv2MetcsKl4IQYRigxTnsSkvk5h1xU_GXh5W7DiP_hy0ICZSzd6lFOLZcXRkFptrAd4xw-PbHsvYv62Dkcd7xV2cfcBlk6NrZaxHiAc71QmUjAVvmB7LLxG7xTYy9AeWCOB_-QzC4HvYo");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("bhushanshevale3@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name-form-submit")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
