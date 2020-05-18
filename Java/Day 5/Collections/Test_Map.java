import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		System.out.println(map.size()+"\t"+map);
		map.put(1, "Sitaram");
		map.put(2, "Tukaram");
		map.put(3, "Ghanashyam");
		System.out.println(map.size()+"\t"+map);
		
		map.put(4, "Seeta");
		map.put(5, "Geeta");
		System.out.println(map.size()+"\t"+map);
		
		System.out.println(map.size()+"\tget(3):\t"+map.get(3));
		
		map.remove(3);
		map.replace(4, "Sita");
		System.out.println(map.size()+"\t"+map);
		
		//key printing
		Set<Integer> set = map.keySet();
		Iterator<Integer> itrInteger = set.iterator();
		while(itrInteger.hasNext()) {
			System.out.println(itrInteger.next());
		}
		
		//value printing
		Collection<String> values = map.values();
		Iterator<String> itrString = values.iterator();
		while(itrString.hasNext()) {
			System.out.println(itrString.next());
		}
		
		//key-value printing
		itrInteger = set.iterator();
		while(itrInteger.hasNext()) {
			Integer key = itrInteger.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
