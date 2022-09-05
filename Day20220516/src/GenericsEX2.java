class Apple2 {
	@Override
	public String toString() {
		return "I am apple"; 
	}
	
}

class Orange2 {
	@Override
	public String toString() {
		return "I am orange";
	}
}

//class AppleBox {
//	private Apple ap;
//	
//	public Apple getAp() {
//		return ap;
//	}
//	
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}
//}
//
//class OrangeBox {
//	private Orange or;
//
//	public Orange getOr() {
//		return or;
//	}
//
//	public void setOr(Orange or) {
//		this.or = or;
//	}
//}

class Box2<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
public class GenericsEX2 {

	public static void main(String[] args) {
//		AppleBox aBox = new AppleBox();
//		OrangeBox oBox = new OrangeBox();
//		
//		aBox.setAp(new Apple());
//		oBox.setOr(new Orange());
//		
//		Apple ap = aBox.getAp();
//		System.out.println(ap);
//		
//		Orange or = oBox.getOr();
//		System.out.println(or);
		
//		Box2 aBox = new Box2();
//		Box2 oBox = new Box2();
//		
//		aBox.setOb(new Apple2());
//		oBox.setOb(new Orange2());
//		
//		Apple2 ap = (Apple2) aBox.getOb();
//		System.out.println(ap);
//		
//		Orange2 or = (Orange2) oBox.getOb();
//		System.out.println(or);
		
		Box2<Apple2> aBox = new Box2<Apple2>();
		Box2<Orange2> oBox = new Box2<Orange2>();
		
		aBox.setOb(new Apple2());
		oBox.setOb(new Orange2());
		
		Apple2 ap = aBox.getOb();
		Orange2 or = oBox.getOb();
		System.out.println(ap);
		System.out.println(or);
		
//		aBox.setOb("new Apple2()"); // 에러.
	
	}
}
