package com.ezen.EX06;

public class ThreadEX01 {

	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); // 샹성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
//		Runnable r = () -> {
//					for(int i=0;i<5;i++) {
//					// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
//					System.out.println(Thread.currentThread().getName());
//					}
//				};		// 람다식
	}
}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}