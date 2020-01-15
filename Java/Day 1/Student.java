public class Student{
	//fields
	int rollNo;
	static int count;
	//final static int TOTAL_COUNT=40;
	
	public Student(){
			count++;
			//TOTAL_COUNT++;     //error:- final variable
	}
	
	//method
	public void print(){
			int nums=100;        //local variable
			System.out.println("Roll No:-"+rollNo);
	}
	
	public static void main(String[] args){
			//declaration
			Student s1, s2;
			
			//instanciation, object creation
			s1 = new Student();
			s2 = new Student();
			
			//instance field initialization 
			s1.rollNo=101;
			s2.rollNo=102;
			
			System.out.println(s1.rollNo);
			System.out.println(s2.rollNo);
			
			System.out.println(s1.count);
			System.out.println(s2.count);
			
			//accessing static field
			System.out.println(Student.count);
	}
}