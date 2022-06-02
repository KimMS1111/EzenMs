// 자바의 정석3판 연습문제 7-19

package com.ezenEx;

import java.util.Arrays;

public class Day0428_Ex03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
	
		
		b.summary();
	}

}

class Buyer {
	
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열 cart의 사용될 인덱스값

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p +"을/를 살수 없습니다.");
			return;
		}
		money -=p.price;
//		System.out.println(money);
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length*2];
//			for(int i=0;i<cart.length;i++) //반복문 배열복사
//				cart2[i]=cart[i];
			System.arraycopy(cart,0,cart2,0,cart.length); // 배열 복사방법
				cart = cart2;
		}
		cart[i++]=p;
		System.out.println(cart[i-1]+" , "+cart[i-1].price);
//		System.out.println(Arrays.toString(cart));
	}
	
	void summary() {
		String apliances="";
		int sum=0;
		
		for(int i=0;i<cart.length;i++) {
//			if(cart[i]==null)
//				break;
//			System.out.println(Arrays.toString(cart));
			apliances += cart[i]+",";
			sum += cart[i].price;
		}
		System.out.println("구매한 제품 : " + apliances);
		System.out.println("사용 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
		
		
	}
}
class Product {
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() {return "Computer"; }
	
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
	

}
