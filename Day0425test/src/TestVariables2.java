
public class TestVariables2 {

	public static void main(String[] args) {

		Variables2 var = new Variables2();
		System.out.println(var.iv);
		
		System.out.println(Variables2.cv);
		// 클래스 변수는 객체 생성을 하지않고 접근 가능
		// 이유는 객체생성 전에 메모리 공간에 올라가있기때문에
		
		Variables2 var2 = new Variables2();
		var2.method();
		
	}

}

class Variables2 {
	
	int iv;	// 인스턴스변수, 멤버변수 
	
	static int cv=100; // 클래스변수, 정적변수, 공유변수
	
	void method() { // 메인에서 접근하려면 반드시 객체를 생성하고 접근해야함
		int lv = 0; // 지역변수
		
	}
	
	static void method2() { // static이 붙은 메서드는 별도 객체 생성없이 접근가능
		int lv = 0;
	
	}
}