package bbb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aaa.A;

public class D extends A {
	public D(){
		PageFactory.initElements(dri, this);
	}
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id="room_type")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
}
