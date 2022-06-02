package com.ezen.EX03;


interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { this.con = s; }
	
	public Printable getPrinter() {
		return new Printable() { // 익명 클래스 정의와 인스턴스 생성
		public void print() {
			System.out.println(con);
			}
		};
	}	
}
public class AnonymousClass {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
