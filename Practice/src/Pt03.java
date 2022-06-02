/*
 *  인스턴스 변수, 메서드는 객체가 생성되어야 사용가능
 *  
 * 
 *  인스턴스 변수 및 메서드는 사용가능 대상이 인스턴스 변수 및 인스턴스 메서드와 
 *  클래스변수, 클래스 메서드 접근 가능
 *  
 * 
 *  클래스 변수와 클래스 메서드는 객체 생성 전 메서드영역(method area)에 생성된다
 *  따라서 클래스 변수, 클래스 메서드는 생성되지 않은 인스턴스 변수 , 인스턴스 메서드는
 *  접근 불가
 * 
 */

public class Pt03 {
// 싱글톤
	public static void main(String[] args) {
		
		Test Ex1 = Test.getInstance();
		Test Ex2 = Test.getInstance();
		
//		Test Ex3 = new Test(); // 생성자 사용 불가 private.
		System.out.println(Ex1.str);
		System.out.println(Ex2.str);
		
	}
}

class Test{
	
	String str = "테스트";
	
	private static Test Ex = new Test();
	
	private Test() {};
	
	public static Test getInstance() {
			return Ex;
	}
	
	
}