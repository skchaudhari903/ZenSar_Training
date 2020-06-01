import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.Student;

public class Test_List_Comparator_Lambda {

	public static void main(String[] args) {
		
		
		Student[] students ={new Student(101,"Amar"),new Student(102,"Akbarr"),new Student(103,"Anthony")};
		
		
		List<Student> listStudent =Arrays.asList(students);
		
		
		Comparator<Student> studentCompareByNameAsc = new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2){
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(listStudent,studentCompareByNameAsc);
		System.out.println(listStudent);
		
		Comparator<Student> studentCompareByNameDsc = (Student o1,Student o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(listStudent,studentCompareByNameDsc);
		System.out.println(listStudent);
		
		//Collections.sort(, c);
		
	}

}
