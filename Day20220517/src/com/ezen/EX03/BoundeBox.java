package com.ezen.EX03;


// T에 들어올 수 있는 대상은 Number이거나 Number를 상속한 객체만 가능
class Box<T extends Number> { 
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class Person {}

public class BoundeBox {

	public static void main(String[] args) {
		Box<Long> aBox = new Box<>();
		
	}

}
