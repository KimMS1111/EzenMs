import java.util.Arrays;

public class ArraysSortEX {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		
		person[0] = new Person("김신",29);
		person[1] = new Person("김대철",30);
		person[2] = new Person("남궁신궁",22);
		
		Arrays.sort(person);
		
		for(Person p : person)
			System.out.println(p);
	}

}


class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		
//		if(this.age > p.age) return 1;
//		else if(this.age<p.age) return -1;
//		else 
//			return 0;
		
		// 오름차순 정렬
//		return this.age - p.age;  // 위에 if문과 같은 문장, 코드 간결화
		// 내림차순 정렬
//		return p.age - this.age;
		
		return this.name.length() - p.name.length(); // 이름길이순으로 
		
	}
}