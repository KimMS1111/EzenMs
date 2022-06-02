package com.ezen.EX01;


//Member Inner class
class Outer2 {
	private int num = 0;
	
	class Member {
		void add(int n) { num += n; }
		int get() { return num; }
	}
}
public class MemberClass1 {

	public static void main(String[] args) {
		Outer2 out1 = new Outer2();
		Outer2 out2 = new Outer2();
		
		Outer2.Member m1 = out1.new Member();
		Outer2.Member m2 = out2.new Member();
		
		m1.add(5);
		System.out.println(m1.get());
		
		m2.add(10);
		System.out.println(m2.get());
	}

}
