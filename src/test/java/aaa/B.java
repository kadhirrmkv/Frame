package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	@Test
	public static void befcls() {
		WebDriver dre = new ChromeDriver();
		dre.get("https://www.facebook.com/");
	}

}
