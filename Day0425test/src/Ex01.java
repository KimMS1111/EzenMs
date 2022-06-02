import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		Tv t;				// Tv인서턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();		// Tv인스턴를 생성한다.
		t.channel = 7;		// Tv인스턴스의 멤버변수 channel의 값을 7로한다.
		t.channelDown();	// Tv인스턴스의 메서드 channelDown()울 호출한다.
		
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
		
		Tv t2 = new Tv();  // 한줄로 요약 가능
		t2.channel = 10;
		t2.channelUp();
		
		System.out.println("현재 채널은 " + t2.channel + "입니다.");
		
		
		Tv t3 = t2;
		System.out.println("t3 = " + t3.channel);
		
	}
}
		
class Tv {
	
	// TV의 속성(멤버변수)  == 인스턴스변수
	String color;        //색상
	boolean power;		 //전원상태 (on/off)
	int channel;		 //채널
	
	
	//TV의 기능(메서드) == 인스턴스메서드
	void power() { power = !power; }
	// TV를 켜거나 끄는 기능을 하는 메서드
	
	void channelUp() { ++channel; }
	// TV의 채널을 높이는 기능을 하는 메서드
	
	void channelDown() { --channel; }
	// TV의 채널을 낮추는 기능을 하는 메서드

		

}
