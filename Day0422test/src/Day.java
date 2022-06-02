import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		/*
		 * 일 월 화 수 목 금 토 --> 랜덤하게  이 중 하나가 나오면
		 * 그에 맞는 소문자로 요일 입력 --> sunday, monday, tuesday, wednesday, 
		 * 							thursday, friday, saturday
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] weekString = { 
								"sunday"," monday", "tuesday", "wednesday",
									"thursday", "friday", "saturday"
							  };
		
		String[] dayofweek = {"일","월","화","수","목","금","토"};
		
		System.out.println("해당 요일의 영단어를 쓰시오.");
		System.out.println("소문자로 입력.");
		
//		System.out.println(dayofweek[(int)(Math.random()*dayofweek.length)]+ " : ");
		
		int retry = 0;
		int last = -1;
		int suc=0;
		int fai=0;
		
		do {
			int day;
			do {
				day = (int)(Math.random()*dayofweek.length);
			}while(day ==last);
			last = day;
	
		while(true){
			System.out.print(dayofweek[day] + "요일 : ");
			String word = sc.nextLine();
			
		if(word.equals(weekString[day])) break;
		System.out.println("오답입니다.");
		fai++;// 실패횟수 증가.
		
		} // while
		System.out.println("정답입니다. 재시도(1) / 종료(0)");
		suc++; // 성공횟수 증가.
		retry = sc.nextInt();
		sc.nextLine();
		
		}while(retry == 1);
		
	System.out.printf("성공(%d) / 실패 (%d)\n " ,suc, fai);	
	System.out.println("종료합니다.");
		
		
	}

}
