
package com.shape;

public class Circle extends Shape{
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
}