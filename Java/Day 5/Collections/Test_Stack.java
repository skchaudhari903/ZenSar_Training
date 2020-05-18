package com.collection;
import java.util.Arrays;
import java.util.Stack;

public class Test_Stack {
	
	public static void main(String[] args) {
		
		//for integer
		Stack<Integer> intr = new Stack<Integer>();
		Student[] students ={new Student(101,"Amar"),new Student(102,"Akbarr"),new Student(103,"Anthony")};
		
		System.out.println(intr.size()+"\t"+intr);
		intr.push(2);   
		intr.push(3); 
		intr.push(9); 
		intr.push(22); 
		intr.push(4); 
		System.out.println(intr.size()+"\t"+intr);
		System.out.println(intr.peek());
		intr.pop();
		System.out.println(intr.size()+"\t"+intr);
		System.out.println(intr.empty());
		System.out.println(intr.search(22));
		
		//for string
		Stack<String> str = new Stack<String>();
		System.out.println(str.size()+"\t"+str);
		str.push("shreya");   
		str.push("joshi"); 
		str.push("be"); 
		str.push("computer"); 
		str.push("sitrc");
		System.out.println(str.size()+"\t"+str);
		
		
	}

}
