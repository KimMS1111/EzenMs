package com.ezen.EX05;


interface Printable3 { void print(String s); }


public class Lambda3 {

	public static void main(String[] args) {
		
		// 람다식
		Printable3 prn = (s) -> System.out.println(s); 
		
		prn.print("java is Lambda3!!");
	}

}
