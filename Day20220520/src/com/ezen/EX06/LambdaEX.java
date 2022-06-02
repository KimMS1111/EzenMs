package com.ezen.EX06;


interface Calculate {
	int Cal(int n1, int n2);
}

class CCC implements Calculate {

	@Override
	public int Cal(int n1, int n2) {
		return n1 * n2;
	}
}

public class LambdaEX {

	public static void main(String[] args) {
		Calculate c = (int n1,int n2) -> {
			return n1+n2;
		};
		System.out.println(c.Cal(5, 2));
		
		
		c = (n1, n2) -> n1+n2;
		System.out.println(c.Cal(6, 4));
		
		
		c = (n1, n2) -> n1 * n2;
		System.out.println(c.Cal(6, 4));
		
		
		
		
		
		

	}
}
