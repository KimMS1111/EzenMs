import java.util.*;


class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
}
public class TreeSetEX2 {

	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<Person>();
		
		tree.add(new Person("kim",20));
		tree.add(new Person("park",50));
		tree.add(new Person("lee",80));
		tree.add(new Person("lee",80));
		tree.add(new Person("kim",29));
		
		
		for(Person n : tree)
			System.out.print(n.toString()+"\t");
		
	 		
	}

}
