
public class CarTest {

	public static void main(String[] args) {

		Sedan se = new Sedan("white",5,4);
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		System.out.println(se.color + "," + se.passenger + "," + se.tire);
		System.out.println();
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger + "," + bu.tire);
		
		Sports ss = new Sports(2,4,2,"Red",1000);
		System.out.println(ss.color+ "," +ss.passenger+ "," +ss.tire+ "," +ss.seat+ "," +ss.sports);
		
	}

}

class Car{  // 상위클래스  먼저 생성된다
	int passenger;
	int tire;
	int seat;
	
	public Car(int passenger,int tire,int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		System.out.println("Car() 생성자");
		
	}
	
	public Car() {}
	
	void run() {System.out.println("run()");}
	
	void stop() {}
	
}

class Sedan extends Car { // 하위클래스  상위클래스가 먼저 생성된 후에 생성
	
	String color;
	
	public Sedan(String color,int passenger, int tire) {
		super(passenger,tire,4); // 상위클래스 생성자 호출 , this와 마찬가지로 맨 앞으로 와야한다.
		this.color = color;
//		this.passenger = passenger;
//		this.tire = tire;
		System.out.println("Sedan() 생성자");
	}
	public Sedan(int passenger,int tire,int seat,String color){
		super(passenger,tire,seat);
		this.color = color;
	}
	public Sedan(){}
}

class Sports extends Sedan { // 손자클래스 Sedan의 하위클래스
	int sports;

	public Sports(int passenger, int tire,int seat,String color,int sports) {
		super(passenger, tire, seat,color);
		this.sports = sports;
	}
	
	public Sports() {}
	
}

class Bus extends Car{ // 하위클래스
	
	void passengerLoad() {}
}

class Truck extends Car{ // 하위클래스
	
	void objectLoad() {}
}