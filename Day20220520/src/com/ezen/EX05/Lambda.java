package com.ezen.EX05;


interface Printable { void print(String s); }

class Printer implements Printable {

	@Override
	public void print(String s) { System.out.println(s); }
}


public class Lambda {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("java is Lambda!!");
	}

}
