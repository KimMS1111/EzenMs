import java.util.*;

public class Pt01 {

	public static void main(String[] args) {

//		//switch문으로 봄,여름,가을,겨울 출력하기 (연습)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월을 입력하세요.");
//		int month = sc.nextInt();
		
//		switch(month) {
//			case 3 :
//			case 4 :
//			case 5 :
//				System.out.println(month +"월의 계절은 봄입니다.");
//				break;
//				
//			case 6 :
//			case 7 :
//			case 8 :
//			case 9 :
//				System.out.println(month +"월의 계절은 여름입니다.");
//				break;
//				
//			case 10 :	
//			case 11 :	
//				System.out.println(month +"월의 계절은 가을입니다.");
//				break;
//				
//			case 12 :	
//			case 1 :	
//			case 2 :
//				System.out.println(month +"월의 계절은 겨울입니다.");
//		}
		
		
		// if - else if문으로 계절 출력하기 (연습)
//		if(month > 2 && month < 6) {
//			System.out.println(month +"월의 계절은 봄입니다.");
//		}else if(month >= 6 && month < 10) {
//			System.out.println(month +"월의 계절은 여름입니다.");
//		}else if(month >= 10 && month <12) {
//			System.out.println(month +"월의 계절은 가을입니다.");
//		}else {
//			System.out.println(month +"월의 계절은 겨울입니다.");
//		}
			
		
		//for문 연습
		for(int i=0;i<6;i++) {
			for(int j=0;j<5-i;j++) {
					System.out.print(" ");
			} //for j
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			} //for j2
			System.out.println();
		}// for i
		
		
		
	}

}
