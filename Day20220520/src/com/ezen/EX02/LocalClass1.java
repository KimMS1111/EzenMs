package com.ezen.EX02;


interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { this.con = s; }
	
	public Printable getPrinter() {
		
		// Local class
		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}
	
}
public class LocalClass1 {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
