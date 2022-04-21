import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) throws IOException, InterruptedException  {

	int count = 0;
	{
	File file = new File("data/data1.txt"); //파일의 위치만 가지고있는것
	
	FileInputStream src = new FileInputStream(file);// 파일을 읽어오는것
	
	Scanner sc = new Scanner(src);
	
	while(sc.hasNext()) { // nextLine 가능/ 일단 next로 
		String tmp = sc.next();
		System.out.printf(" %s ", tmp);
		count++;
	}
	System.out.println("\ncount : " + count);
	sc.close();
	src.close();
	}
	int[] nums = new int[count];
	{
		// 배열 공간 data1.txt 내용 넣기
		File file = new File("data/data1.txt"); //파일의 위치만 가지고있는것
		
		FileInputStream src = new FileInputStream(file);// 파일을 읽어오는것
		
		Scanner sc = new Scanner(src);
		
		for(int i=0; i<count; i++) {
			String tmp = sc.next();
			nums[i] = Integer.parseInt(tmp);
		}
		System.out.println("nums : " + Arrays.toString(nums));
		sc.close();
		src.close();
		}
	{
		//배열에서 특정 숫자 찾기. ( 반복해서 찾아야 한다.)
		int index = -1;
		
		for(int i=0; i< count; i++)
			if(nums[i] == 88) {
			index = i;
			break;
			}	
		System.out.println(index);
	}
	//index 위치 변경>>>> 0이랑 5 위치 교환
	{
	int tmp;
	tmp = nums[0];
	nums[0] = nums[5];
	nums[5] = tmp;
	System.out.println("nums : " + Arrays.toString(nums));
	}
	//반복적으로 i <---->i+1을 교환
	for(int i=0; i<count-1;i++) {
		int tmp;
		tmp = nums[i];
		nums[i] = nums[i+1];
		nums[i+1] = tmp;
		
	Thread.sleep(1000);// 마우스 클릭으로 첫번째거 선택해주기 ( 초단위로 값을 보여줌)
	for(int j=0; j<3; j++)
		System.out.println();
	
	for(int j=0; j<count; j++)
		if(j == i+1 || j == i+0)
	System.out.printf("[%d] ",nums[j]);
		else
			System.out.printf("%d ", nums[j]);
	//System.out.println("nums : " + Arrays.toString(nums));	
	}
	}

}
