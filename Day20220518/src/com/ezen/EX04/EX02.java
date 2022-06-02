package com.ezen.EX04;


class Box<T> {
	private T ob;
	
	public void set(T o) { ob = o; }
	public T get() { return ob; }
}
public class EX02 {

	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T tmp = box1.get();
		
		box1.set(box2.get());
		
		box2.set(tmp);
		
	}
	public static void main(String[] args) {
	
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println("before : " +box1.get()+ " & " +box2.get());
		
		swapBox(box1,box2);
		
		System.out.println("after : " +box1.get()+ " & " +box2.get());
	}
}
/* 
 * 출력 ---> before : 99 & 55
 * 			after : 55 & 99
 * 위 코드가 실행되도록 swapBox 메서드 정의함. 단, Box<T> 인스턴스를 인자로 전달받을수 있도록 정의
 * 그리고 이때 Box<T> 인스턴스의 T는 Number또는 이를 상속하는 클래스만 올 수 있도록 제한
 * */
 