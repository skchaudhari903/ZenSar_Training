package com.shape;

public class Square extends Shape{
	
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
}