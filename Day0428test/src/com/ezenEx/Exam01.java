package com.ezenEx;

public class Exam01 {

	public static void main(String[] args) {
//		Animal an = new Animal();
//		Animal an2 = new Mammal();
//		Animal an3 = new Person();
//		
//		an.eat();
//		an2.eat();
//		an3.eat();
//		an3.run(); 
//		
//		System.out.println();
//		Person p = (Person)an3; 
//		// 타입형변환 해주는 순간 하위클래스 메서드에 접근가능
//		// 현재 an3가 person을 참조하고있기 때문에 가능
//		p.eat();
//		p.run();
//		p.play();
//		
//		System.out.println();
//		Mammal m1 =(Mammal)an3;
//		m1.eat();
		
		Animal animal = new Penguin();
		
		if(animal instanceof Birds) {
			Birds birds = (Birds)animal;
			System.out.println(1);
		}
		else if(animal instanceof Mammal) {
			Mammal mammal = (Mammal)animal;
			System.out.println(2);
		}
		
		animal.eat();
		
	}

}

class Animal { // 동물   //자신이 가지고있는 메서드만 불러올수있음, 오버라이딩 된것만
	void eat() {
		System.out.println("동물이 먹는다.");
	}
	void run() {}
}

class Mammal extends Animal { // 포유류
	void eat() {
		System.out.println("포유류가 먹는다.");
	}
}

class Whale extends Mammal { // 고래
	void eat() {
		System.out.println("고래가 먹는다.");
	}
}

class Person extends Mammal { // 사람
	void eat() {
		System.out.println("사람이 먹는다.");
	}
	void run() {
		System.out.println("사람이 달린다.");
	}
	void play() {System.out.println("사람이 행동한다.");}
}

class Birds extends Animal { // 조류
	void eat() {
		System.out.println("조류가 먹는다.");
	}
}
class Sparrow extends Birds { // 참새
	void eat() {
		System.out.println("참새가 먹는다.");
	}
}
class Penguin extends Birds { // 펭귄
	void eat() {
		System.out.println("펭귄 먹는다.");
	}
}