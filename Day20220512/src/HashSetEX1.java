import java.util.*;

// 중복x ,  순서x
public class HashSetEX1 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		
		s.add("toy");
		s.add("box");
		s.add("robot");
		s.add("Box");
		s.add("toy");
		
		System.out.println("cnt : " + s.size());
		
		for(Iterator<String> itr = s.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(String str : s)
			System.out.print(str + "\t");
		
		
	}

}
