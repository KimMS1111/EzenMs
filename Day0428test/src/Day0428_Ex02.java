
public class Day0428_Ex02 {

	 static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dan = (DanceRobot)r;
			dan.dance();
		
		}else if(r instanceof SingRobot) {
			SingRobot sin = (SingRobot)r;
			sin.sing();
		
		}else if(r instanceof DrawRobot) {
			DrawRobot dra = (DrawRobot)r;
			dra.draw();
		}
			
	}
	

	public static void main(String[] args) {
//		Day0428_Ex02 ex = new action; 객체를 생성해서 사용할 수 있음
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0;i<arr.length;i++)
			action(arr[i]);
		
		
	}

}

class Robot {}
 	

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
		
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}