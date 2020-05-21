import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 8, 7, 5};
		System.out.println(Arrays.toString(numbers));
		
		String[] months = {"Jan", "Feb", "Mar", "Apr"};
		System.out.println(Arrays.toString(months));
		Arrays.sort(months);
		System.out.println(Arrays.toString(months));
		
		//ArrayList<String> listDays = new ArrayList<String>();
		//LinkedList<String> listDays = new LinkedList<String>();
		Vector<String> listDays = new Vector<String>();
		
		System.out.println(listDays.size()+"\t"+listDays);
		
		//listDays.add(1);
		listDays.add("Sun");										//add
		listDays.add("Mon");
		listDays.add("Wed");
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.add(2, "Tue");										// add via index
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.add("Soon");
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.remove(4);											//remove
		System.out.println(listDays.size()+"\t"+listDays);
		
		//traversing
		Iterator <String> itr = listDays.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> unmodifiableList = Collections.unmodifiableList(listDays);
		
	}

}
