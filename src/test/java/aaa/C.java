package aaa;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bbb.D;
import bbb.E;
import bbb.F;
import bbb.PMa;

public class C extends A {
	static PMa pma;
	F f;
	D d;
	E e;
	@BeforeClass
	public static void bef() {
		web();
		pma=new PMa();
	}
	@Test
	public void t1() {
		f = pma.getUserpage();
		logele(f.getName(),"kadhirmahi");
		logele(f.getPass(),"95ACM9");
		elementclick(f.getLog());
		}
	@Test
	public void t2() {
		d = pma.getSearch();
		dropdown(d.getLocation(),"value","Brisbane");
		dropdown(d.getHotels(), "index", "2");
		dropdown(d.getRoomtype(), "index", "1");
		elementclick(d.getSubmit());
	}
	@Test
	public void t3() {
		e = pma.getSel();
		WebElement radiobutton = e.getRadiobutton();
		elementclick(radiobutton);
		WebElement con = e.getCon();
		elementclick(con);
		
	}
}
