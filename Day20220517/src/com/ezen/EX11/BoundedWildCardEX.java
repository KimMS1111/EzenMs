package com.ezen.EX11;


class Box<T> {
	
	protected T ob;
	public T getOb() {	return ob;	}
	public void setOb(T ob) {	this.ob = ob;	}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Toy {
	@Override
	public String toString() {
		return "I am Toy";
	}
}

class Robot extends Toy {}

class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.getOb();
		System.out.println(t);
		
//		box.setOb(t);
	}
	
	public static void inBox(Box<Toy> box, Toy t) {
		box.setOb(t);
		
		
	}
}
public class BoundedWildCardEX {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
