
public class Exercise6_2 {

	public static void main(String[] args) {

		SutadaCard card1 = new SutadaCard(3, false);
		SutadaCard card2 = new SutadaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}




class SutadaCard {
	
	int num;
	boolean isKwang;
	
	public SutadaCard(){	//메인에서 설정하지 않아도 여기서 인덱스값을 설정해줄 수 있다.
		this.num = 1;
		this.isKwang = true;
		//생성자에서 다른 생성자 호출하기.
//		this(1,true); // 값만 이렇게 정해주면 아래 생성자 인덱스 설정에 맞게 값을 출력
	}
	
	public SutadaCard(int num, boolean isKwang) {
	
//		if(num>=1 && num>=10)
		this.num = num;
//		else
//			this.num = 0;
		
		this.isKwang = isKwang;

	}
	
	String info() {
		return num + (isKwang == true? "K" : "");
//		return num + (isKwang? "K" : ""); // 위와 같은 문장 , 코드 간략화
	}
}