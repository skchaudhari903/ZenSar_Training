import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5));
		list.add("xyz");
		
		for(Object obj : list) {
			//String str = (String) obj;
			//System.out.println(str);
			System.out.println(obj);
		}
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		List <String> list1 = new ArrayList<String>();  //java 7 ? List<String> list1 = new ArrayList<String>();
		list1.add("abc");
		//list.add(new Integer(5));    //compile error
		
		for(Object str : list1) {
			//no type casting needed, avoids ClassCastException
			System.out.println(str);
		}
		
		Iterator <String> iterator2 = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
