import java.util.*;
public class Day21ex6 {

	public static void main(String[] args) {
		//int[] nArr = new int[10]; => 난수 (0~9)를 배열 입력
		//단, 중복되지않게 
		
		int[] nArr = new int[10];
		for(int i=0; i<nArr.length;i++) {
			nArr[i] = (int)(Math.random()*nArr.length);
		
		for(int j=0;j<i;j++) {
			if(nArr[j]==nArr[i]) {
				i--;
			}
		}
	}
		System.out.println(Arrays.toString(nArr));
		
	}

}
