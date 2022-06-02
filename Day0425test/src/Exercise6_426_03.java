
public class Exercise6_426_03 {

	public static void main(String[] args) {

		Student7 st = new Student7("홍길동",1,1,100,60,76);
		
		System.out.println(st.info());
		
		
//		st.setName("홍길동");
//		st.setBan(1);
//		st.setNo(1);
//		st.setKor(100);
//		st.setEng(60);
//		st.setMath(76);
//		
//		System.out.println(" 이름 : " + st.getName());
//		System.out.println(" 총점 : " + st.allTotal());
//		System.out.println(" 평균 : " + st.allAverage());
//		
	
	}

}

class Student7 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student7(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	int allTotal() {
		return kor+eng+math;
	}
	float allAverage() {
		return allTotal()/3.0f;
	}
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+allTotal()+","+allAverage();
	}
}