package com.ezen.EX10;


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
	
	public static void peekBox(Box<? super Integer> box) { 
		// 와일드카드 하한제한
		// Integer나 그 위로만 대입 가능
		System.out.println(box);
	}
}

public class LowerBoundedWildcard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
//		System.out.println(box.getOb());
		UnBoxer.peekBox(box);
		// 이걸 작동하게 하려면 타입을 일치 시켜줘야함.
		
		Box<Number> box2 = new Box<>();
		box2.setOb(123.4);
		UnBoxer.peekBox(box2);
		
		Box<Object> box3 = new Box<>();
		box3.setOb("String");
		UnBoxer.peekBox(box3);
		
	}

}
