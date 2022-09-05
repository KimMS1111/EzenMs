import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEX1 {

	public static void main(String[] args) throws Exception {
//		Test t = new Test(); // 일반적인 객체 생성
		
		Class clsName = Class.forName("Test");
		
		Object obj = clsName.getDeclaredConstructor().newInstance();
		System.out.println(obj.getClass().getName());
		
		Method[] method = clsName.getDeclaredMethods();
		System.out.println(method);
		
		for(Method m : method)
			System.out.println(m);
		
		Field[] fields = clsName.getDeclaredFields();
		for(Field f : fields)
			System.out.println(f.getInt(obj));
	}
}

class Test {
	int num = 10;
	int num2 = 20;
	int num3 = 30;
	
//	double dnum = 10.5;
//	String str = "korea";
	
	void func1() {}
	void func2() {}
	void func3() {}
}