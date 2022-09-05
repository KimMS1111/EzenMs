package com.ezen.Ex1;
import java.util.*;

class Fruit					{ public String toString() { return "Fruit"; } }
class Apple extends Fruit	{ public String toString() { return "Apple"; } }
class Grape extends Fruit	{ public String toString() { return "Grape"; } }
class Toy 					{ public String toString() { return "Toy"; } }

public class FruitBoxEX1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toytBox = new Box<Toy>();
		
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 붍잁치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)
		fruitBox.add(new Grape()); // OK. void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에서는 Apple만 담을 수 있음 
		
		toytBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toytBox);
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) 	{ return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}