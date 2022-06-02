import java.util.Arrays;

public class Pt06 {

	public static void main(String[] args) {

		int[] cow = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(cow));
		
		for(int i=0;i<10 ;i++) {
			int n = (int)(Math.random()*10);
			int tmp = cow[i];
			cow[i]=cow[n];
			cow[n]=tmp;
			
			System.out.println(Arrays.toString(cow));
		}
			
	}

}
