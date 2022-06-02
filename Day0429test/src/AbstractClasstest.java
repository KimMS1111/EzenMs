
public class AbstractClasstest {

	public static void main(String[] args) {

		Product pro = new Tv();
		System.out.println(pro.price);
		pro.test();
		pro.func();
	}

}
abstract class Product { // 추상클래스 , 객체생성 불가
	int price; // 제품의 가격
	
	Product(int price){
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
	
	abstract void func(); // 추상메소드
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }

	@Override
	void func() {
		System.out.println("Tv");
	}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() {return "Computer"; }

	@Override
	void func() {
		System.out.println("Computer");
		
	}
	
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }

	@Override
	void func() {
		System.out.println("Audio");
		
	}
	

}