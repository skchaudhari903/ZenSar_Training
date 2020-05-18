package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test_Map {

	public static void main(String[] args) {
		HashMap<Integer ,String> map = new HashMap<Integer,String>();
		System.out.println(map.size()+"\t"+map);
		map.put(1, "Amar");   //(key,value)
		map.put(1, "Amar");   //key is unique
		System.out.println(map.size()+"\t"+map);
		map.put(2, "Amar");  
		System.out.println(map.size()+"\t"+map); // values can be duplicate
		map.put(3, "Akbar");
		map.put(4, "seeta");
		map.put(5, "geeta");
		System.out.println(map.size()+"\t"+map);
		System.out.println("get(2):"+map.get(2));
		map.remove(2);
		System.out.println(map.size()+"\t"+map);
		map.replace(3, "Anthony");
		System.out.println(map.size()+"\t"+map);
		
		//key printing
		Set<Integer> set = map.keySet();
		Iterator<Integer> itrInteger =set.iterator();
		while(itrInteger.hasNext())
		{
			System.out.println(itrInteger.next());
		}
		
		//value printing
		Collection<String> values =map.values();
		Iterator<String> itrString =values.iterator();
		while(itrString.hasNext())
		{
			System.out.println(itrString.next());
		}
		
		//key-value printing
		itrInteger = set.iterator();
		while(itrInteger.hasNext())
		{
			Integer key =itrInteger.next();
			String value =map.get(key);
			System.out.println(key+"\t"+value);
		}
		
	}

}
