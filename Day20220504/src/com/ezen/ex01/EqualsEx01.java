package com.ezen.ex01;


public class EqualsEx01 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) 
			// equals메서드는 주소값으로 비교를 하기 때문에 false로 나온다.
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}
class Value {
	int value;
	
	Value(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		
			return value == ((Value)obj).value;
	
	}
}

