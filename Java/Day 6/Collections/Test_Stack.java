import java.util.*;
public class Test_Stack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] data = new int[10];
		/*
		Stack <Integer> stack = new Stack <Integer>();
		stack.push(4);
		stack.push(8);
		stack.push(2);
		stack.push(3);
		System.out.println("Elements in Stack :"+stack);
		System.out.println("Element Popped :"+stack.pop());
		System.out.println("Elements in Stack :"+stack);
		System.out.println("Top Element of Stack :"+stack.peek());
		System.out.println("Position :"+stack.search(2));
		System.out.println("Stack is Empty :"+stack.empty());
		*/
		Stack <String> stack = new Stack <String>();
		stack.push("Amar");
		stack.push("Jai");
		stack.push("Shree");
		stack.push("Tejas");
		System.out.println("Elements in Stack :"+stack);
		System.out.println("Element Popped :"+stack.pop());
		System.out.println("Elements in Stack :"+stack);
		System.out.println("Top Element of Stack :"+stack.peek());
		System.out.println("Position :"+stack.search("Shree"));
		System.out.println("Stack is Empty :"+stack.empty());
	}
}
