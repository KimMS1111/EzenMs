
public class Exercise7_22 {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10,10),5);
		Shape s3 = new Circle(5);
		System.out.println(s3.calcArea());
		
		Shape r = new Rectangle();
		Shape r2 = new Rectangle(150,50);
		Shape r3 = new Rectangle(new Point(100,100),150,50);
		System.out.println(r3.calcArea());
		
		
	}

}
abstract class Shape {
	Point p;
	
	public Shape() {
		this(new Point(0,0));
	}
	
	public Shape(Point p) {
		this.p = p;
	}
	/* 도형의 면적을 계산해서 반환하는 메서드*/
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {
	double r; // 반지름
	
	public Circle(){}
	
	public Circle(double r){
		this(new Point(0,0),r);
	}
	
	public Circle(Point p,double r){
		super(p);
		this.r = r;
	}
	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	double width; // 폭
	double height; // 높이
	
	public Rectangle(){
		this(new Point(0,0),0,0);
	}
	
	public Rectangle(double width, double heigt){
		this(new Point(0,0),width,heigt);
//		this.height = height;
//		this.width = width;
	}
	
	public Rectangle(Point p,double width,double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() { //정사각형인지 아닌지 판단
		if(width == height && width*height!=0)
			return true;
		else
			return false;
	}
	
}

class Point {
	int x;
	int y;
	
	Point() { this(0,0); }
	
	Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

