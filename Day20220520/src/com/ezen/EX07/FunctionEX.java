package com.ezen.EX07;

import java.util.function.Function;

public class FunctionEX {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("Java Function"));
		System.out.println(f.apply("Java"));
	}
	

}
