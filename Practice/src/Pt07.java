
public class Pt07 {

	public static void main(String[] args) {
		
		C c1 = new C(20,30,40);
		System.out.println(c1.a +","+c1.b+","+c1.c);
		System.out.println();
		
		 A c2 = (C)c1;
		 
		 
		
	}

}

class A {
	int a;
	A(int a){
		this.a = a;
	}	
	
	void funca() {
		System.out.println("a");
	}
}

class B extends A {
	int b;
	void funca() {
		System.out.println("a");
	}
	
	B(int a,int b){
		super(a);
		this.b = b;
	}
}

class C extends B {
	int c;
	void funca() {
		System.out.println("a");
	}
	
	C(int a,int b,int c){
		super(a,b);
		this.c = c;
	}
}