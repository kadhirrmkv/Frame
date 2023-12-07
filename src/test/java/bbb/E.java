package bbb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aaa.A;

public class E extends A{
	public E() {
		PageFactory.initElements(dri, this);
	}
	@FindBy(id ="radiobutton_0")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy(id ="continue")
	private WebElement con;
	
	public WebElement getCon() {
		return con;
	}
}
