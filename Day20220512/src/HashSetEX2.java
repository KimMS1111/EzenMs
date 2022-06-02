import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Num {
	private int num;
	
	public Num(int num) { this.num = num;}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num / 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num ==((Num)obj).num)
			return true;
		else
			return false;
	}
	
}
public class HashSetEX2 {

	public static void main(String[] args) {
		
		Set<Num> s = new HashSet<Num>();
		
			s.add(new Num(5));
			s.add(new Num(5));
			s.add(new Num(1));
			s.add(new Num(3));
			s.add(new Num(2));
			
		System.out.println("cnt : " + s.size());
		
		for(Iterator<Num> itr = s.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(Num str : s)
			System.out.print(str + "\t");
	}

}
