package com.collection;

import java.util.HashSet;
import java.util.Iterator;
//tree set pending
public class Test_Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String> ();
		System.out.println(set.size()+"\t"+set);

		set.add("sun");
		set.add("Mon");
		set.add("Tue");
		set.add("Wed");
		set.add("Thur");
		set.add("free");
		System.out.println(set.size()+"\t"+set); //natural order o/p i.e unsynchronized
		
		set.remove("free");
		System.out.println(set.size()+"\t"+set);
		
		set.add("sat");
		System.out.println(set.size()+"\t"+set);
		
		//traversing
		Iterator<String> itr =set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
