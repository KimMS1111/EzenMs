package com.ezen.ex01;

public class Ex01_ExceptionTest {

	public static void main(String[] args) {
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace(); // 예외에 대한 정보 출력
		}finally { // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 적는다.
			System.out.println("무조건 실행");
		}

} // main end

	static void method1() throws Exception {
	throw new Exception();

	} // method1 end

} // class end
