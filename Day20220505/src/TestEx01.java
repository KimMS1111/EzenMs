
public class TestEx01 {

	public static void main(String[] args) {
		// 상위클랴스는 하위클래스 참조 가능, 반대로 하위클래스는 상위클래스 참조 불가
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		System.out.println(a2.a);
		
//		B b = new A(); // -에러 하위클래스가 상위클래스를 참조할 수 없음
		B b1 = new B();
		B b2 = new C();
		System.out.println(b2.a);
		
		C cc = (C)a2;
		
		System.out.println(cc.a);
		cc.test();
		
		
	}
}

class A {
	int a = 1;
	
	public A(){}
	public A(int a){
		this.a = a;
	}
	
	void testA() {
		System.out.println("testA");
	}
	void test() {
		System.out.println("testA");
	}
}
class B extends A {
	int b = 2;
	
	public B(){}
	public B(int a,int b){
		super(a);
		this.b=b;
	}
	void testB() {
		System.out.println("testB");
	}
	void test() {
		System.out.println("testB");
	}
}
class C extends B {
	int c = 3;
	
	public C (){}
	public C(int a,int b,int c){
		super(a,b);
		this.c = c;
	}
	void testC() {
	System.out.println("testC");
	}
	void test() {
		System.out.println("testC");
	}
}