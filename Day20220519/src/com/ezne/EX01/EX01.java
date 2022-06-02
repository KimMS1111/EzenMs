package com.ezne.EX01;

import java.io.*;
import java.util.*;

public class EX01 {

	static ArrayList record = new ArrayList(); // 성정데이터를 저장할 공간
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			switch(displayMenu()) {
			case 1 :
				inputRecord();
				break;
			case 2 :
				displayRecord();
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		} // while(true)
	}
	
	// Menu를 보여주는 메서드
	static int displayMenu() {
	System.out.println("**********************************************");
	System.out.println("*              성적 관리 프로그램                 *");
	System.out.println("**********************************************");
	System.out.println();
	System.out.println(" 1. 학생성적 입력하기 ");
	System.out.println();
	System.out.println(" 2. 학생성적 보기");
	System.out.println();
	System.out.println(" 3. 프로그램 종료");
	System.out.println();
	System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");
	
	int menu = 0;
	
	do {
		menu = sc.nextInt();
		if(1<=menu && menu <= 3) {
			break;
		}else {
			System.out.println("잘못 입력하셨습니다.(1~3번까지 선택가능.)");
		}
	}while(true);
	
	return menu;
	}// static int displayMenu

	static void inputRecord() {
		System.out.println(" 1. 학생성적 입력하기");
		System.out.println("-이름,반,번호,국어성적,영어성적,수학성적-의 순서로 공백없이 입력하세요.");
		System.out.println("-입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				String str = sc.nextLine();
				StringTokenizer tok = new StringTokenizer(str,",");
				
				if(!str.equalsIgnoreCase("q")) {
					record.add(new Student2(sc.next(),sc.nextInt(),sc.nextInt(),
								sc.nextInt(),sc.nextInt(),sc.nextInt()));
					System.out.println("입력완료.");
				}else {
					return;
				}
			}catch(Exception e) {
			System.out.println("입력오류입니다. 순서대로 정확하게 입력해주세요.");
		}
			
	} // end while
}// static void inputRecord()

	// 데이터 목록을 보여주는 메서드
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0) {
			System.out.println();
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
			
		System.out.println("=============================================");
			
			for(int i=0;i<length;i++) {
				Student2 stu = (Student2)record.get(i);
				System.out.println(stu);
				koreanTotal += stu.kor;
				englishTotal += stu.eng;
				mathTotal += stu.math;
				total += stu.total;
			}
			
		System.out.println("=============================================");
			System.out.println("총점 : " +"국어:"+koreanTotal+" "+"영어:"+englishTotal
										+" "+"수학:"+mathTotal+" "+"합:"+total);
			System.out.println();
		}else {
		System.out.println("=============================================");
			System.out.println(" 데이터가 없습니다. ");
		System.out.println("=============================================");
			}
		} // static void displayRecord()
	}
class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student2) {
			Student2 tmp = (Student2)o;
			
			return tmp.total - this.total;
		}else {
			return -1;
		}
	}
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				+","+schoolRank
				+","+classRank
				;
	}
}//class Student