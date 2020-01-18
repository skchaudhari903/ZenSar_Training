package com.shape;

public abstract class Shape{
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
