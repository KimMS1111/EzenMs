package com.ezen.EX06;

import javax.swing.JOptionPane;

public class ThreadEX07 {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("값을 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class ThreadEx7_1 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {}
		} // end for
	} // end run
}