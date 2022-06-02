package com.ezen.EX06;

import java.util.Random;

@FunctionalInterface // 함수형 인터페이스--> 추상메서드 1개만 존재해야함
interface Generator {
	int rand();
}


public class LambdaEX2 {

	public static void main(String[] args) {
		
		Generator gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		}; // 리턴문 있으면 중괄호 생략x
		int num = gen.rand();
		System.out.println(num);

	}
}
