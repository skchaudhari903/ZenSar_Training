public class Even_CommandArgument{
	
	public static void main(String[] args){
			
		int[] arr = new int[10];
			
		System.out.println(args);
		
	    //	index=Integer.parseInt(args[9]);    //java statement
	
		for(int i=0; i<=arr.length; i++){
			if(arr[i]%2==0)
				System.out.println(" "+arr[i]);
			
		}
	}

