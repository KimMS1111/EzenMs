package com.ezen.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int sum = 0;
		
		try {
			int num = sc.nextInt();
			int a = 10/num;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException e1) {
			e1.printStackTrace();
		}
//		catch(Exception e2) { //  위에 두개가 없어도 이 하나가 다 처리 해줄 수 있음
//			e2.printStackTrace();
//		}
		
		for(int i=0;i<=100;i++)
			sum += i;
		System.out.println("sum = " + sum);
	}

}
