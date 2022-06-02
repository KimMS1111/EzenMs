import java.util.Scanner;

public class Pt05 {

	public static void main(String[] args) {
		
//		double pi = 3.141592;
//		System.out.println(pi);
//		double shortPi =  Math.round(pi*1000)/1000.0;
//		// 1000으로 나누면 int타입이기 때문에 반드시 1000.0으로 바꿀것
//		System.out.println(shortPi);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("max값을 구합니다.");
		int a = sc.nextInt();
		System.out.println("a의 값 : "+ a);
		int b = sc.nextInt();
		System.out.println("b의 값 : "+ b);
		int c = sc.nextInt();
		System.out.println("c의 값 : "+ c);
		
		int max = a;
		if(b>max)max = b;
		if(c>max)max = c;
		
		System.out.println("max의 값 : " + max);
	}

}
