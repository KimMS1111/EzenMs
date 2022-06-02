import java.util.*;

public class Pt04 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num =0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 파전");
			System.out.println("(2) 김치전");
			System.out.println("(3) 감자전");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료 : 0)>");
			num = sc.nextInt();	
			sc.nextLine();
		
		if( num == 0 ){
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		else if(!( num>=1 && num <= 3)) {
			System.out.println("잘못선택하셨습니다.");
			continue;
		}
		System.out.println("선택하신 메뉴는 " + num + "번입니다.");
		
		
		}
	
	}

}
