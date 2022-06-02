import lombok.Getter;
import lombok.Setter;

public class Exercise6_4_01 {

	public static void main(String[] args) {
		
		Student2 s = new Student2("손흥민", 1, 10, 90, 100, 60); //생성자 호출 >> 디폴트생성자를 호출
		// 생성자 291p , 값을 여기서 세팅할 수 있음
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		
		Student2 s2 = new Student2("이상우", 2, 9, 100, 100, 100); //생성자 호출 >> 디폴트생성자를 호출
		
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student2 s3 = new Student2("박수진", 2, 9); //생성자 호출 >> 디폴트생성자를 호출
		
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
	}

}

// private < default < protected < public

@Getter  // @--> 어노테이션
@Setter		// lombok 다운 및 적용하고 @Getter 사용가능
class Student2{
	
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	//함수 --> 인스턴스메소드, 클래스메소드
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	/*
	 * 디폴트 생성자는 생성자가 존재하지않으면 java컴파일러가 자동으로 디폴트 생성자를 생성해주지만,
	 * 개발자가 직접 설정한 생성자가 1개라도 존재하면 생성하지 않는다.
	 * 필요하면 개발자가 직접 생성
	 */
	
	//생성자, 인덱스값에 맞게 다 세팅을 해줘야함
	//함수 오버로딩
	public Student2(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	// 함수 오버로딩 , 
	public Student2(String name,int ban,int no) { // 박수진
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}