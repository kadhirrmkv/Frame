package bbb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aaa.A;

public class F extends A {
	public F() {
		PageFactory.initElements(dri, this);
	}
	
	@FindBy(id="username")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}

	@FindBy(id="password")
	private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}

	@FindBy(id="login")
	private WebElement log;
	
	public WebElement getLog() {
		return log;
	}
}
