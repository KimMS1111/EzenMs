import java.util.Scanner;
import java.util.Arrays;

public class Pt02 {

	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		
//		String[] monthEng = {
//							"January", "February", "March", "April", "May",
//							"June", "July", "August", "September", "October",
//							"November", "December"
//							};	
//		
//		System.out.println("해당 월의 영어단어를 입력하세요.");
//		System.out.println("첫글자는 대문자로 입력해주세요.");
//		
//		int retry = 0;
//		int last = -1;
//		
//		do {
//			
//			int month;
//			
//			do {
//				month = (int)(Math.random()*12);
//				} //end for do2
//				while(month == last);
//				last = month;
//		
//				while(true) {
//					System.out.print((month+1)+"월 : ");
//					String input = sc.nextLine();
//							
//				if(input.equals(monthEng[month])) break;
//				System.out.println("오답입니다.");
//					
//				} // end for while
//				System.out.println("정답입니다. 재시도(1) / 종료(0) ");
//				retry = sc.nextInt();
//				sc.nextLine();
//				
//		}// end for do
//		while(retry == 1);
//			System.out.println("프로그램 종료");
//
//		while(true) {
//
//				int dice1 = (int)(Math.random()*6)+1;
//				int dice2 = (int)(Math.random()*6)+1;
//		
//				System.out.println("(" + dice1 + " , " + dice2 + ")");
//		
//				if((dice1 + dice2) == 6) break;
//		}
//
//		int value = (int)(Math.random()*6)+1;
//		
//		System.out.println("value = "+ value);
		
		
		int num = 12345;
		int sum = 0;
		
		while(num >0){
		sum += num %10;
		num /= 10;
		}
		System.out.println(sum);
		
		
		
	}

}
