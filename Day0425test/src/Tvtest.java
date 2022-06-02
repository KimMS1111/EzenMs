
public class Tvtest {

	public static void main(String[] args) {
		
		Tv2[] tvarr = new Tv2[3];	//길이가 3인 Tv객체 배열
		
		// Tv객체를 새성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i<tvarr.length;i++) {
			tvarr[i] = new Tv2();
			tvarr[i].channel = i + 10; // tvarr[i]의 channel에 i+10을 저장
			
		} // end for1
		
		for(int i=0; i<tvarr.length;i++) {
			tvarr[i].channelUp(); // tvarr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvarr[%d].channel=%d%n",
					i,tvarr[i].channel);
		} // end for2
		
	} // main

} // public Tvtest

class Tv2{
	String color;		//색상
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}// Tv2 class