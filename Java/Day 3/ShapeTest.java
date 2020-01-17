import java.util.*;
class Circle{
	
	private float radius;
	
	public Circle(){
		this(0.0f);
		System.out.println("I am in Def...");
	}
	public Circle(float radius){
		setRadius(radius);
		System.out.println("I am in Para...");
	}
	public Circle(Circle circle){
		setRadius(circle.getRadius());
		System.out.println("I am in Copy...");
	}
	public double calculateArea(){
		return Math.PI*radius*radius;
	}
	public void draw(){
		System.out.println("Circle is Drawn...");
	}
	public void setRadius(float radius){
		this.radius = radius;
	}
	public float getRadius(){
		return radius;
	}
	@Override
	public String toString(){
		return "Radius :"+getRadius()+"\tArea :"+calculateArea();
	}
	@Override
	public boolean equals(Object object){
		Circle circle = (Circle)object;
		if(radius == circle.getRadius()){
			return true;
		}
		else{
			return false;
		}
	}
}
class Square{
	
	private float side;
	
	public Square(){
		this(0.0f);
		System.out.println("I am in Def...");
	}
	public Square(float side){
		setSide(side);
		System.out.println("I am in Para...");
	}
	public Square(Square square){
		setSide(square.getSide());
		System.out.println("I am in Copy...");
	}
	public double calculateArea(){
		return side*side;
	}
	public void draw(){
		System.out.println("Square is Drawn...");
	}
	public void setSide(float side){
		this.side = side;
	}
	public float getSide(){
		return side;
	}
	@Override
	public String toString(){
		return "Side :"+getSide()+"\tArea :"+calculateArea();
	}
	@Override
	public boolean equals(Object object){
		Square square = (Square)object;
		if(side == square.getSide()){
			return true;
		}
		else{
			return false;
		}
	}
}
class Rectangle{
	
	private float length, breadth;
	
	public Rectangle(){
		this(0.0f, 0.0f);
		System.out.println("I am in Def...");
	}
	public Rectangle(float length, float breadth){
		setLength(length);
		setBreadth(breadth);
		System.out.println("I am in Para...");
	}
	public Rectangle(Rectangle rectangle){
		setLength(rectangle.getLength());
		setBreadth(rectangle.getBreadth());
		System.out.println("I am in Copy...");
	}
	public double calculateArea(){
		return length*breadth;
	}
	public void draw(){
		System.out.println("Rectangle is Drawn...");
	}
	public void setLength(float length){
		this.length = length;
	}
	public float getLength(){
		return length;
	}
	public void setBreadth(float breadth){
		this.breadth = breadth;
	}
	public float getBreadth(){
		return breadth;
	}
	@Override
	public String toString(){
		return "Length :"+getLength()+"\tBreadth :"+getBreadth()+"\tArea :"+calculateArea();
	}
	@Override
	public boolean equals(Object object){
		Rectangle rectangle = (Rectangle)object;
		if(length == rectangle.getLength() || breadth == rectangle.getBreadth()){
			return true;
		}
		else{
			return false;
		}
	}
}

public class ShapeTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		float radius, side, length, breadth;
		System.out.println("******* M E N U *******");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		System.out.println("***********************");
		System.out.print("Enter Your Choice: ");
		choice = sc.nextInt();
		
		switch(choice){
			case 1:
			System.out.print("Enter radius of Circle :");
			radius = sc.nextInt();
			Circle c1, c2, c3;
			c1 = new Circle();
			c2 = new Circle(10.0f);
			c3 = new Circle(c2);
			c1.setRadius(radius);
			c1.draw();
			System.out.println(c1.toString());
			boolean bool;
			bool = c1.equals(c2);
			if(bool){
				System.out.println("c1 is equal to c2");
			}
			else{
				System.out.println("c1 is NOT equal to c2");
			}
			break;
		
			case 2:
			System.out.print("Enter side of Square :");
			side = sc.nextInt();
			Square s1, s2, s3;
			s1 = new Square();
			s2 = new Square(10.0f);
			s3 = new Square(s2);
			s1.setSide(side);
			s1.draw();
			System.out.println(s1.toString());
			boolean bool1;
			bool1 = s1.equals(s2);
			if(bool1){
				System.out.println("s1 is equal to s2");
			}
			else{
				System.out.println("s1 is NOT equal to s2");
			}
			break;				
			
			case 3:
			System.out.print("Enter length of Rectangle :");
			length = sc.nextInt();
			System.out.print("Enter breadth of Rectangle :");
			breadth = sc.nextInt();
			Rectangle r1, r2, r3;
			r1 = new Rectangle();
			r2 = new Rectangle(10.0f, 10.0f);
			r3 = new Rectangle(r2);
			r1.setLength(length);
			r1.setBreadth(breadth);
			r1.draw();
			System.out.println(r1.toString());
			boolean bool2;
			bool2 = r1.equals(r2);
			if(bool2){
				System.out.println("s1 is equal to s2");
			}
			else{
				System.out.println("s1 is NOT equal to s2");
			break;
			
			}
		}
	}
}	
