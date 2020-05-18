package com.collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Test_Collection {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,2,4};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] months = {"Jan","Feb","Mar"};
		System.out.println(Arrays.toString(months));
		Arrays.sort(months);
		System.out.println(Arrays.toString(months));
		
		ArrayList<String> listDays =new ArrayList<String>();
		System.out.println(listDays.size()+"\t"+listDays);
		listDays.add("sun");
		listDays.add("Mon");
		listDays.add("Tues");
		listDays.add("Thru");
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.add(3,"Wed");
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.add("Fri");
		listDays.add("Soon");
		System.out.println(listDays.size()+"\t"+listDays);
		
		listDays.set(6,"Sat");
		System.out.println(listDays.size()+"\t"+listDays);
		listDays.remove(1);
		System.out.println(listDays.size()+"\t"+listDays);
		
		//Traversing
		Iterator<String> itr = listDays.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//error
		List<String> unmodifiableList = Collections.unmodifiableList(listDays);
		//throws UnSupportedOperationException at runtime
		unmodifiableList.add("abcd");
		Collections.synchronizedCollection(listDays);
	}

}
