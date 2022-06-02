import java.util.*;

public class HashMapEX1 {

	public static void main(String[] args) {

//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(6, "kim");
		map.put(3, "kim");
		map.put(20, "kim");
		map.put(13, "kim");
		map.put(4, "hong");
		map.put(4, "lee");
		map.put(14, "lee");
		map.put(5, "park");
		map.put(15, "park");
		map.put(6, "kim");
		
		System.out.println(map);
		System.out.println(map.get(5)); // value값 출력
		
		// 전체 key값만 출력
		Set<Integer> set = map.keySet();
		
		for(Integer n : set)
			System.out.print(n + "\t");
		
		System.out.println();
		System.out.println();
		
		// 전체 value값만 출력
		for(Integer n : set)
			System.out.print(map.get(n)+"\t");
		
		System.out.println();
		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next())+"\t");
			
		
		
	}

}
