import java.util.*;

public class ArraySort{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		int temp=0;
		
		System.out.println("Enter No.s in Array to sort:- ");
		for(int i=0; i<array.length; i++){
			array[i] = in.nextInt();
		}
		System.out.println("\nNumbers Entered are :"+Arrays.toString(array));
		
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length; j++){
				if (array[i] < array[j]){
					temp = array[i];
					array[i] = array[j];
					array [j] = temp;
				}
			}
		}
		System.out.println("\nNumbers After Sorting :"+Arrays.toString(array));
 	}
}