import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Car {
	
	private String model;
	private String color;
	
	public Car(String model,String color) {
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return model + "," + color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model,color);
	}
	
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
//		if(model.equals(m) && color.equals(c))return true;
//		else return false;
		
		return (model.equals(m) && color.equals(c)) ? true : false;
		// 이렇게도 가능 , 삼항연산자
	}
}

public class HashSetEX3 {

	public static void main(String[] args) {

		Set<Car> s = new HashSet<Car>();
		
		s.add(new Car("Y201","red"));
		s.add(new Car("Y202","black"));
		s.add(new Car("Y201","red"));
		s.add(new Car("Y201","white"));
		s.add(new Car("Y203","black"));
		
	System.out.println("cnt : " + s.size());
	
	for(Iterator<Car> itr = s.iterator(); itr.hasNext();) {
		System.out.print(itr.next() + "\t");
	}
//	System.out.println();
//	
//	for(Car str : s)
//		System.out.print(str + "\t");
//	}
	}
}
