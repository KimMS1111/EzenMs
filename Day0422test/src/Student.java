import java.util.Scanner;

// 5명 학생 두과목(영어 , 수학)을 입력받아서 과목별 평균,학생별 평균을 구하는 프로그램
public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 5; // 인원수
		
		int[][] subject = new int [num][2]; // 점수
		
		int[] totalstudent = new int[num];	//학생별 점수
		
		int[] totalsubject = new int[2];	//과목의 점수
		
		System.out.printf("%d명 영어, 수학 점수 입력.\n", num);
		
		for(int i=0;i<num;i++){
			System.out.printf("%d번 영어 : ", i+1);
			subject[i][0] = sc.nextInt(); //영어
			System.out.println("   수학 : ");
			subject[i][1] = sc.nextInt();// 수학
			
			totalstudent[i] = subject[i][0] + subject[i][1]; //학생 합계
			totalsubject[0] += subject[i][0]; // 영어 합계
			totalsubject[1]	+= subject[i][1]; //수학 합계
			
		}
		
		System.out.println("No.    영어   수학    평균");
		for(int i=0;i<num;i++) 
			System.out.printf("%2d %6d %6d %6.1f\n",i+1,subject[i][0],
					subject[i][1],(double)totalstudent[1]/2);
			
			System.out.printf("평균 %6.1f %6.1f\n",(double)totalsubject[0]/num,
													(double)totalsubject[1]/num);
		
		
	}

}
