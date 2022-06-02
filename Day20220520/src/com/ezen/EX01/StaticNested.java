package com.ezen.EX01;

/*
 * Nested클래스와 Inner클래스
 * 
 * Nested ==> Static이 붙어있음
 * 
 * Inner ==> Static no!
 * - Member Inner class
 * - Local Inner class
 * - Anonymous Inner class
 */

class Outer {
	private static int num = 0;
	
	static class Nested1 {
		void add(int n) { num += n; }
	}
	
	static class Nested2 {
		int get() { return num; }
	}
}
public class StaticNested {

	public static void main(String[] args) {
		Outer.Nested1 nt1 = new Outer.Nested1();
		nt1.add(10);
		Outer.Nested2 nt2 = new Outer.Nested2();
		System.out.println(nt2.get());
	}

}
