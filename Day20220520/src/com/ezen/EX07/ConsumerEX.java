package com.ezen.EX07;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEX {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Consumer!!");
		c.accept("JAVA Consumer!!");
		//						 <String>,int
		ObjIntConsumer<String> c2 = ( s  , i) -> System.out.println(i + "," + s);
		
		int n = 1;
		
		c2.accept("Toy", n++);
		c2.accept("Robt", n++);
		c2.accept("Box", n++);
	}

}
