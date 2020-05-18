import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet <String> set = new HashSet<String>();
		TreeSet <String> set = new TreeSet<String>();
		System.out.println(set.size()+"\t"+set);
		//set.add("null");			//if added(null) in Treeset, will not be sorted directly appended at last for display
		set.add("Sun");
		set.add("Mon");
		set.add("Wed");
		System.out.println(set.size()+"\t"+set);
		
		set.remove("Wed");
		System.out.println(set.size()+"\t"+set);

		set.add("Wed");
		
		//traversing
		Iterator <String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
