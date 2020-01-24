public class Continue{
	public static void main(String[] args){
		
		int index = 0;
		while (index <=10){
			index++;
			if(index%2==0)
				continue;
				System.out.println(index);
		}
	}
}	