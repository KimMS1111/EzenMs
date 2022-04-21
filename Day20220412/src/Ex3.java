import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {

		
//		int[] score = new int [5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70; //score[2] = 70
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4]
//		
//		for(int i=0; i < score.length; i++) { // for문으로 배열의 모든 요소를 출력한다.
//			//score.length 사용가능.
//			System.out.printf("score[%d] : %d%n", i, score[i]);
//			
//		}
//	System.out.printf("tmp : %d%n", tmp);
//	System.out.printf("score[%d] : %d%n", 7, score[7]); // index의 범위를 벗어난 값.
	
	
//		191p 예제 배열의 출력
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
////		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for (int i=0; i < iArr1.length; i++) {
//			iArr1[i] = i + 1;
//		}
//		
//		for (int i=0; i < iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10) + 1;
//		}
//		
//		for (int i=0; i < iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
//	
	
//		// 배열 복사 double 타입
//		double[] dArr = new double[10];
//		
//		for(int i = 0; i < dArr.length; i++)
//			dArr[i] = (Math.random());
//		
//		for(int i = 0; i < dArr.length; i++)
//			System.out.printf("%.2f\n", dArr[i]);
//		
//		
//		double[] tmp = new double[10*2];
//		
//		for(int i=0; i<dArr.length; i++)
//			tmp[i] = dArr[i];
//		
//		dArr = tmp;
//		System.out.println("----------------------");
//		for(int i = 0; i < dArr.length; i++)
//			System.out.printf("%.2f\n", dArr[i]);
		
//		// 195p 예제 
//		char[] abc = {'A', 'B', 'C', 'D',};
//		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		
//		//배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사.
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		//number의 인덱스6 위치에 3개를 복사.
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//		연습문제
//		int[] abc = { 10, 20, 30, 40, 50 };
//		int[] abc2 =  { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		
//		System.out.println(Arrays.toString(abc));
//		System.out.println(Arrays.toString(abc2));
//		
//		System.arraycopy(abc, 2, abc2, 2, 3);
//		
//		System.out.println(Arrays.toString(abc2));
		
//		//최대값 및 최소값 계산 및 출력
//		int[] brr = new int[5];
//		int tmp = 0;
//		for(int i = 0; i < brr.length; i++)
//			brr[i] = (int)(Math.random()*99)+1;
//		System.out.println(Arrays.toString(brr));
//		
//		int max = 0;
//		for(int i =0; i < brr.length; i++) {
//			if(max < brr[i])
//				max = brr[i];
//		}
//		System.out.println("max : " + max);
//		
//		int min = brr[0];
//		for(int i=0; i < brr.length; i++) {
//			if(min > brr[i])
//				min = brr[i];
//		}
//		System.out.println("min : " + min);
//		
//		for(int i= 0; i < brr.length;i++)
//			for(int j = i; j < brr.length; j++)
//				if(brr[i] > brr[j]) {
//					tmp = brr[i];
//					brr[i] = brr[j];
//					brr[j] = tmp;
//				}
//		System.out.println(Arrays.toString(brr));
		
//		int[] crr = new int[10];
//		
//		int sum = 0;
//		//double avg = 0;
//		
//		//랜덤입력.
//		for(int i = 0; i < 10; i++)
//			crr[i] = (int)(Math.random()*99)+1;
//		//총합구하기.
//		for(int i = 0; i < 10; i++)
//			sum += crr[i];
//		System.out.println(Arrays.toString(crr));
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + (double)sum / crr.length);
//		
		
//		//3142 값 나오게하기.
//		float pi = 3.141592f;
//		float shortpi = (int)(pi * 1000 + 0.5);
//		
//		System.out.println((int)shortpi);
		
		
		
//	0~3세 할인율 100%
//	4~13세 할인율 50%
//	14~19세 할인율 25%
//	20세 이상 할인율 0%
//	65세 이상 할인율 100%
//		int bus = 1500;
//		int age = 0;
//		double dc = 0;
//		
//		age = (int)(Math.random()*99)+1;
//				
//		 if(age >= 65 )
//			 dc = 0.0;
//	       else if(age >= 20)
//	          dc = 1.0;
//	       else if(age >= 14)
//	          dc = 0.75;
//	       else if(age >= 4)    
//	          dc = 0.5;
//	       else
//	          dc = 0.0;
//		 System.out.println("나이 :" + age + "요금 :" + (int)(bus*dc) + "원");
	  
	//if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
		//내가 만들어본 코드-----> 깔끔하지 못함 배운것을 활용하자(for 반복문)
//		Scanner sc = new Scanner(System.in);
		
//		int num1, num2, num3, num4, num5;
//		int max = 0;
//		
//		System.out.println("서로 다른 숫자 다섯 개를 입력해주세요.");
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		
//		if(num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
//			max = num1;
//		}else if(num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
//			max = num2;
//		}else if(num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
//			max = num3;
//		}else if(num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
//			max = num4;
//		}else {
//			max = num5;
//			System.out.println("가장 큰 수는 " + max + "입니다.");
//		}
		
//		//선생님 코드
//		//for 반복문 . 
//		Scanner sc = new Scanner(System.in);
//		int num, max = 0;
//		String tmp;
//		
//		System.out.println("정수 5회 입력 :");
//		for(int i = 0; i < 5; i++) {
//			tmp = sc.nextLine();
//			num = Integer.parseInt(tmp);
//			
//			if(max < num) max = num;
//		}
//			System.out.println("최대값 : " + max);
		
//		입력받는 숫자가 0 ~ 100사이의 값만 5개 입력받아서 큰 수 구하기
//		Scanner sc = new Scanner(System.in);
//	      int num=0;
//	      int max=0;
//	      String tmp;
//	      
//	      System.out.print("정수 5회 입력 : ");
//	      
//	      for(int i=0; i<5; i++) {
//	            
//	         num=sc.nextInt();
//	         
//	         if (num<0 || num>100) {
//	         System.out.println("0~100사이의 정수를 입력해주세요");
//	          i--;
//	          continue;
//	         }
//	         if(max<num) max = num; 
//	      }
//	      System.out.println("최대값 : " + max);

		
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j<5-1;j++) {
//		
//		System.out.print("*");}	
//		System.out.println();
//		}
//		 for(int i=5; i>0; i--) { 
//	         for(int j=0; j<i; j++)
//	            System.out.print("*");
//	         System.out.println();
//	      }
//		 for(int i=0; i<10; i++) {
//	         for(int k=10; k>i; k--) {
//	            System.out.print(" ");
//	         }
//	         for(int j=0;j<i;j++) {
//	            System.out.printf("*");
//	         }
//	         for(int j=0;j<i;j++) {
//	            System.out.printf("*");
//	         }
//	         for(int k=10; k>i; k--) {
//	            System.out.print(" ");
//	         }
//	         
//	         
//	         System.out.println();
//	         
//	         
//	      }

		for(int i = 0; i <= 5; i++) {
			for(int j = 5; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}		
		System.out.println();
	}	
		 
	}

}
