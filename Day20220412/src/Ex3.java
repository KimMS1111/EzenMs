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
//		for(int i=0; i < score.length; i++) { // for������ �迭�� ��� ��Ҹ� ����Ѵ�.
//			//score.length ��밡��.
//			System.out.printf("score[%d] : %d%n", i, score[i]);
//			
//		}
//	System.out.printf("tmp : %d%n", tmp);
//	System.out.printf("score[%d] : %d%n", 7, score[7]); // index�� ������ ��� ��.
	
	
//		191p ���� �迭�� ���
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
	
//		// �迭 ���� double Ÿ��
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
		
//		// 195p ���� 
//		char[] abc = {'A', 'B', 'C', 'D',};
//		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		
//		//�迭 abc�� �迭 num�� ù��° ��ġ���� �迭 abc�� ���̸�ŭ ����.
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		//number�� �ε���6 ��ġ�� 3���� ����.
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//		��������
//		int[] abc = { 10, 20, 30, 40, 50 };
//		int[] abc2 =  { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		
//		System.out.println(Arrays.toString(abc));
//		System.out.println(Arrays.toString(abc2));
//		
//		System.arraycopy(abc, 2, abc2, 2, 3);
//		
//		System.out.println(Arrays.toString(abc2));
		
//		//�ִ밪 �� �ּҰ� ��� �� ���
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
//		//�����Է�.
//		for(int i = 0; i < 10; i++)
//			crr[i] = (int)(Math.random()*99)+1;
//		//���ձ��ϱ�.
//		for(int i = 0; i < 10; i++)
//			sum += crr[i];
//		System.out.println(Arrays.toString(crr));
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + (double)sum / crr.length);
//		
		
//		//3142 �� �������ϱ�.
//		float pi = 3.141592f;
//		float shortpi = (int)(pi * 1000 + 0.5);
//		
//		System.out.println((int)shortpi);
		
		
		
//	0~3�� ������ 100%
//	4~13�� ������ 50%
//	14~19�� ������ 25%
//	20�� �̻� ������ 0%
//	65�� �̻� ������ 100%
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
//		 System.out.println("���� :" + age + "��� :" + (int)(bus*dc) + "��");
	  
	//if���� ����Ͽ� �ټ� �� ������ �Է� �޾Ƽ� ���� ū ���� ����ϴ� ���α׷� �ۼ�
		//���� ���� �ڵ�-----> ������� ���� ������ Ȱ������(for �ݺ���)
//		Scanner sc = new Scanner(System.in);
		
//		int num1, num2, num3, num4, num5;
//		int max = 0;
//		
//		System.out.println("���� �ٸ� ���� �ټ� ���� �Է����ּ���.");
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
//			System.out.println("���� ū ���� " + max + "�Դϴ�.");
//		}
		
//		//������ �ڵ�
//		//for �ݺ��� . 
//		Scanner sc = new Scanner(System.in);
//		int num, max = 0;
//		String tmp;
//		
//		System.out.println("���� 5ȸ �Է� :");
//		for(int i = 0; i < 5; i++) {
//			tmp = sc.nextLine();
//			num = Integer.parseInt(tmp);
//			
//			if(max < num) max = num;
//		}
//			System.out.println("�ִ밪 : " + max);
		
//		�Է¹޴� ���ڰ� 0 ~ 100������ ���� 5�� �Է¹޾Ƽ� ū �� ���ϱ�
//		Scanner sc = new Scanner(System.in);
//	      int num=0;
//	      int max=0;
//	      String tmp;
//	      
//	      System.out.print("���� 5ȸ �Է� : ");
//	      
//	      for(int i=0; i<5; i++) {
//	            
//	         num=sc.nextInt();
//	         
//	         if (num<0 || num>100) {
//	         System.out.println("0~100������ ������ �Է����ּ���");
//	          i--;
//	          continue;
//	         }
//	         if(max<num) max = num; 
//	      }
//	      System.out.println("�ִ밪 : " + max);

		
		
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
