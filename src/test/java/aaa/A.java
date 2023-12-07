package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static WebDriver dri;
	public static void web() {
		dri = new ChromeDriver();
		dri.get("https://adactinhotelapp.com/");
	}
	public static void logele(WebElement find,String val) {
		find.sendKeys(val);

	}
	public static void elementclick(WebElement element) {
		element.click();
	}
	public static void dropdown(WebElement element,String method,String value) {
		Select select = new Select(element);
		switch (method) {
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByValue(value);
			break;
		case "index":
			int parseInt = Integer.parseInt(value);
			select.selectByIndex(parseInt);
			break;
		default:
			break;
		}
	}
}