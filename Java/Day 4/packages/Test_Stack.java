//package com.stack;
import java.util.*;
interface IStack{
	void push(String item);
	String pop();
}
interface ISafeStack{
	 boolean isFull();
	 boolean isEmpty();
}
class Stack implements IStack{
	protected String[] stackArray;
	int capacity;
	String element;
	protected int tos; 	//top of stack
	
	public Stack(){
		
	}
	
	public Stack(int capacity){
		this.capacity = capacity;
		stackArray = new String[capacity];
		tos = -1;				//empty array
	}
	public void push(String item){
		if(tos < capacity){
			tos++;
			stackArray[tos]=item;
			System.out.println("Item Pushed");
		//	System.out.println(Arrays.toString(stackArray));
		}
		else{
			System.out.println("Stack is Full");
		}
	}
	public String pop(){
		if(tos != -1){
			element = stackArray[tos];
			tos = tos - 1;
			return element;
		}
		
		else{
			return "Stack is Empty";
		}
	}
	@Override
	public String toString(){
		return Arrays.toString(stackArray);
	}
}
class SafeStack extends Stack implements ISafeStack {
	
	public boolean isFull(){
		return tos >= stackArray.length-1;
	}
	
	public boolean isEmpty(){
		return tos == -1;
	}
}
 
public class Test_Stack{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		String item, popElement;
		Stack stack;
		SafeStack safeStack;
		safeStack = new SafeStack();
		stack = new Stack(10);
		System.out.println("************** M E N U **************");
		System.out.println("1. Push the Element into the Stack :");
		System.out.println("2. Pop the Element from Stack :");
		System.out.println("**************************************");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				//System.out.print("Enter Items:");
				//item = sc.next();
				if(safeStack.isEmpty()){
					stack.push("abc");
					stack.push("pqr");
					stack.push("xyz");
				}
				else if(safeStack.isFull()){
					//System.out.println(stack.toString());
				}
				break;
			case 2:
				popElement = stack.pop();
				System.out.println(popElement);
				//System.out.println(Arrays.toString());
		}
	}
}
