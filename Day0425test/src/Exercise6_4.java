
public class Exercise6_4 {

	public static void main(String[] args) {
		
	Student s = new Student();
	
	//setter, getter 사용해주는게 좋은방법
	
	s.setName("홍길동");
//	s.name = "홍길동";
	
	s.setBan(1);
//	s.ban = 1;
	
	s.setNo(1);
//	s.no = 1;
	
	s.setKor(100);
//	s.kor = 100;
	
	s.setEng(60);
//	s.eng = 60;
	
	s.setMath(76);
//	s.math = 76;
	
	System.out.println("이름 : " + s.getname());
	System.out.println("총점 : " + s.gettotal());
	System.out.println("평균 : " + s.getaverage());

	}

}
class Student {
	
	//변수 : 인스턴스변수, 클래스변수, 지역변수
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//메서드(함수) : 인스턴스메서드, 클래스메서드
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	int gettotal() {
		return kor + eng + math;
	}
	
	double getaverage() {
		return (int)((gettotal()/3.0+0.05)*10)/10.0;
	}
}
