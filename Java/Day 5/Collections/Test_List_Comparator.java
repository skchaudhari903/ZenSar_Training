package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_List_Comparator {

	public static void main(String[] args) 
	{
		int[] numbers = {1,3,5,2,4};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] months = {"Jan","Feb","Mar"};
		System.out.println(Arrays.toString(months));
		Arrays.sort(months);
		System.out.println(Arrays.toString(months));
		
		Student[] students ={new Student(101,"Amar"),new Student(102,"Akbarr"),new Student(103,"Anthony")};
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		
		List<Student> listStudent =Arrays.asList(students);
		Collections.sort(listStudent);
		System.out.println(listStudent);
		
		/*Comparator<Student> studentCompareByNameDesc = new Comparator<Student>(){
		
		};*/
		Comparator<Student> studentCompareByNameAsc = new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2){
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(listStudent,studentCompareByNameAsc);
		System.out.println(listStudent);
		
		
		
	}

}
