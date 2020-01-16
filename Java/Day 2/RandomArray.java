

//import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;

	public class RandomArray
	{
		public static int[] arraySize(int [] array){
			int ans=0;
			int j=0;
			for(int i = 0; i< array.length; i++){
				if(array[i]==0){
					ans=i;
					break;
				}
			}
			int cal[] = new int[ans];
			for(int i=0; i< ans; i++){
				cal[i]=array[i];
			}
			return cal;
				
		}
		
		
		public static int[] odd_No(int[] array){
				//int array[] = new int[10];
				int result[] = new int[10];
				int j = 0;
			
				for(int i = 0; i< 10; i++ ){
					if(array[i]%2!=0){
						result[j]=array[i];
						j++;
					}
				}
				return result;
		}
		
		public static void main(String [] args)
		{
		int input[]= new int[10];
		RandomArray obj = new RandomArray();
		
		
		System.out.println(Arrays.toString(input));
		/*
		for(int i:input){	
			System.out.println(input);
		}
		*/
		
		for(int i=0;i<input.length;i++){
				input[i]=(int)(Math.random()*100);
				
			}
			
			int result[] = new int[10];
			int cal[] = new int[10];
			result = obj.odd_No(input);
			cal = obj.arraySize(result);
			System.out.println(Arrays.toString(input));
	
			System.out.println(Arrays.toString(result));
			
			System.out.println(Arrays.toString(cal));
		}
	}
	