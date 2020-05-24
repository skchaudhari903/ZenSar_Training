import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.collection.Student;

public class Test_Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Akshay");
		Class classStudent = s1.getClass();
		
		String name = classStudent.getName();
		String simpleName = classStudent.getSimpleName();
		
		System.out.println("Name :"+name);
		System.out.println("SimpleName :"+simpleName);

		Field[] fields = classStudent.getDeclaredFields();
		Constructor[] constructors = classStudent.getDeclaredConstructors();
		Method[] methods = classStudent.getDeclaredMethods();
		
		System.out.println(Arrays.toString(fields));
		System.out.println(Arrays.toString(constructors));
		System.out.println(Arrays.toString(methods));
	}

}
