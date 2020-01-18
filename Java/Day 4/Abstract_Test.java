import java.util.*;
abstract class Shape{
	public Shape(){
		System.out.println("Shape -> Def...");
	}
	public abstract void draw();
	public abstract double calcArea();
	@Override
	public String toString(){
		return "Shape :";
	}
}
class Circle extends Shape{
	private float radius;
	
	public Circle(){
		//super();								//will call Shape->def constructor 
		radius = 0.0f;
		System.out.println("Circle->def...");
	}
	public Circle(float radius){
		//super();								//will call Shape-> def constructor
		this.radius = radius;
		System.out.println("Circle->Para...");
	}
	@Override
	public void draw(){
		System.out.println("Circle is drawn...");
	}
	@Override
	public double calcArea(){
		return Math.PI*radius*radius;
	}
	public void setRadius(float radius){
		this.radius = radius;
	}
	public float getRadius(){
		return radius;
	}	
	@Override
	public String toString(){
		return super.toString()+"\tCircle :";
	}
}/*
class Square extends Shape{
	
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
	@Override
	public double calcArea(){
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
		return "Side :"+getSide()+"\tArea :"+calcArea();
	}
}*/
public class Abstract_Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float radius, side;
		Shape shape;
		//shape = new Shape();
		Circle circle;
		//circle = new Circle();
		System.out.print("Enter radius of Circle :");
		radius = sc.nextInt();
		shape = new Circle(5.5f);
		shape.draw();
		//circle.setRadius(radius);
		System.out.println("Circle Area :"+shape.calcArea());
		/*
		System.out.print("Enter side of Square :");
		side = sc.nextInt();
		Square square;
		square = new Square();
		square.setSide(side);
		square.draw();
		System.out.println(square.toString());
		*/	
	}
}