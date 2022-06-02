package com.ezen.EX07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierEX {
	
	public static List<Integer> makeInList(Supplier<Integer> s, int n){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
			list.add(s.get());
		return list;
	}
	public static void main(String[] args) {
		
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		List<Integer> list = makeInList(spr,5);
		System.out.println(list);
		
		
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		
		for(int i=0;i<5;i++)
			System.out.println(s.get());
	}
}
