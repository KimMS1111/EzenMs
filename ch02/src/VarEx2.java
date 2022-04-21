import java.util.Calendar;

public class VarEx2 {

	public static void main(String[] args) {
	
//	final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
	Calendar cal = Calendar.getInstance(); // Calendar 객체를 생성, 기본적으로 현재날짜와 시간으로 설정된다.
//	Calendar cal2 = Calendar.getInstance(); // Calendar 객체를 생성, 기본적으로 현재날짜와 시간으로 설정된다.
	
	//MONTH의 경우 0부터 시작하기 때문에 4월인 경우, 3으로 지정해야한다.
	
//	cal1.set(2020, 9, 24);
//	System.out.println("cal1은" + toString(cal1) +
//			DAY_OF_WEEK[cal1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
//	
//	
//	System.out.println("오늘(cal2)은" + toString(cal2) +
//			DAY_OF_WEEK[cal2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
	
	System.out.println("올해 년도 :" + cal.get(Calendar.YEAR) );
	System.out.println("몇 월 (0~11, 0 : 1월) : " +cal.get(Calendar.MONTH) );
	System.out.println("올해 몇번째 주 : " + cal.get(Calendar.WEEK_OF_YEAR) );
	System.out.println("이 달의 몇번째 주 : " + cal.get(Calendar.WEEK_OF_MONTH) );
	System.out.println(" 일 : " + cal.get(Calendar.DATE) );
	System.out.println("그 달의 몇번째 일 : " + cal.get(Calendar.DAY_OF_MONTH) );
	System.out.println("그 해의 몇번째 일 : " + cal.get(Calendar.DAY_OF_YEAR) );
	System.out.println("요일(1~7, 1 : 일요일) : " + cal.get(Calendar.DAY_OF_WEEK) );
	System.out.println("그 달의 몇번째 요일 : " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) );
	
	System.out.println("이 달의 마지막 날 : " + cal.getActualMaximum(Calendar.DATE));
		
//	long difference =
//			(cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000;
//			System.out.println("그 날(cal1)부터 지금(cal2)까지" + difference + "초가 지났습니다.");
//		
//			System.out.println("일(day)로 계산하면" + difference/(24 * 60 * 60) + "일입니다.");
//	}
//
//	public static String toString(Calendar cal) {
//		return cal.get(Calendar.YEAR)+"년" + (cal.get(Calendar.MONTH)+1) + "월"
//	+ cal.get(Calendar.DATE)+ "일";
	
		
	}

}
