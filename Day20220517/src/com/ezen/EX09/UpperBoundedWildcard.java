package com.ezen.EX09;


class Box<T> {
	protected T ob;

	public T getOb() {	return ob;	}

	public void setOb(T ob) {	this.ob = ob;	}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class UnBoxer {
	
	public static void peekBox(Box<? extends Number> box) { 
		// 와일드카드 상한제한
		// Number나 Number를 상속받는것만 대입가능
		System.out.println(box);
	}
}

public class UpperBoundedWildcard {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		
//		UnBoxer.peekBox(box);
		// 이걸 작동하게 하려면 타입을 일치 시켜줘야함.
	}

}
