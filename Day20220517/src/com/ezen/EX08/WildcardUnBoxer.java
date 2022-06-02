package com.ezen.EX08;


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
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
	
	public static <T> void peekBox(Box<?> box) { // 와일드카드
		// <?> 제한없음. 모든타입이 가능 <? extends Object>와 동일
		System.out.println(box);
	}
}

public class WildcardUnBoxer {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		UnBoxer.peekBox(box);
		
	}

}
