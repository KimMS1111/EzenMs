import java.util.*;

public class MyCalendar {



	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
        
        Calendar cal = Calendar.getInstance(); // 객체 생성, 현재 날짜와 시간으로 설정.
        Scanner sc = new Scanner(System.in);    
        
        System.out.println("년도를 입력하세요.");
        int year = sc.nextInt();
        
        System.out.println("월을 입력하세요.");
        int month = sc.nextInt();

        cal.set(Calendar.YEAR, year);    // 내가 원하는 년도 설정
        cal.set(Calendar.MONTH, month); // 내가 원하는 월 설정
        
        System.out.println("오늘은 "  + month + "월 "  + cal.get(Calendar.DATE)+ "일 "
               + DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
//        System.out.println();
        System.out.println("           "  + year + "년" + month + "월" +  "         ");
//        System.out.println();
        System.out.println(" 일   월   화   수  목  금   토 ");
        
        cal.set(year, month-1, 1);
        //입력한 년도 월 1일부터 시작
        //month는 0부터 1월, –1
        int lastday = cal.getActualMaximum(Calendar.DATE);
        //이 달의 마지막날 설정
        int dayweek = cal.get(Calendar.DAY_OF_WEEK);
        //일주일 설정, 1부터 일요일
        
        for(int i=1;i<=lastday;i++) {
           if(i==1) { // 공백추가
              for(int j=1;j<dayweek;j++){
                 System.out.print("    "); 
                 }
          }
           if(i<10){ 
        	   //수가 한자리일경우 공백 추가해서 줄맞춤
              System.out.print(" ");
           }
           System.out.print(" "+i+" ");
           if(dayweek%7==0) { 
        	   //7일 출력, 일주일에 맞게
              System.out.println();
           }
           dayweek++;
        }
  }

}	
	
	
	
	


