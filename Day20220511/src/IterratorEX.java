import java.util.*;

public class IterratorEX {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		//list,set,map
		for(String e : list)
			System.out.print(e + '\t');
		
		// next() --> 다음값 변환
		// hasNext() --> 가져올 데이터가 있는가?
		// remove --> next()호출을 통해 반환된 인스턴스 삭제
		System.out.println("\n-----------------------");
		Iterator<String>  it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("toy"))it.remove();
			System.out.print(str + '\t');
		}
		
		Iterator<String> it2 = list.iterator();
		System.out.println("\n-----------------------");
		while(it2.hasNext()) {
			String str2 = it2.next();
			System.out.print(str2 + '\t');
		}
		
	}

}
