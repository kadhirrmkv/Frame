package bbb;



public class PMa {
private D d;
	
	public D getSearch() {
		if(d == null) {
			d= new D(); 
		}
		return d;
	}
	
	private E e;
	
	public E getSel() {
		if(e == null) {
			e = new E();
		}
		return e;
	}

	private F f;
	
	public F getUserpage() {
		if(f == null) {
		 f = new F();
		}
		return f;
	}
}
