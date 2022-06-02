package com.ezen.EX05;


interface Printable4 { void print(String s); }

interface Calculate {
	void cal(int n1, int n2);
}

class Cal implements Calculate {

	@Override
	public void cal(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
}

public class Lambda4 {

	public static void main(String[] args) {
		
		// 람다식
		Printable4 prn;
		
		prn = (String s) -> { System.out.println(s); };
		prn.print("java is Lambda1");
		
		prn = (String s) -> System.out.println(s); // 중괄호를 생략 가능
		prn.print("java is Lambda2");
		
		prn = (s) -> System.out.println(s); // 타입도 생략 가능
		prn.print("java is Lambda3");
		
		prn = s -> System.out.println(s); // 괄호도 생략 가능, 두개이상은 생략 불가
		prn.print("java is Lambda4");
		
		Calculate c = new Cal();
		c.cal(10, 10);
		
		c = (int n1, int n2) -> { System.out.println(n1+n2); };
		c.cal(5, 2);
		
		c = (n1, n2) -> { System.out.println(n1*n2); };
		c.cal(8, 8);
		
		c = (n1, n2) -> System.out.println(n1-n2);
		c.cal(10, 4);
		
	}

}
