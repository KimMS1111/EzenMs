import java.util.*;

public class HashSetEX4 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person1("David",10));
		set.add(new Person1("David",10));
		
		System.out.println(set);
	}

}

class Person1 {
	String name;
	int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return   name + ":" + age ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		Person1 tmp = (Person1)obj;
		return name.equals(tmp.name) && age==tmp.age ? true : false;
	}
	
	
}