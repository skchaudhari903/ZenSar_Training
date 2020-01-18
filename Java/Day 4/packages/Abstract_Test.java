package com.zensar.test1;
import com.zensar.Shape;
import com.zensar.Circle;
import com.zensar.Square;

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
		
		System.out.print("Enter side of Square :");
		side = sc.nextInt();
		Square square;
		square = new Square();
		square.setSide(side);
		square.draw();
		System.out.println(square.toString());
			
	}
}