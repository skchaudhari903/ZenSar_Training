class Student{
	//fields
	private int rollNo;
	private String name;
	private float marks;
	
	//constructor
	Student(){										//default constructor
		rollNo=0;
		name=null;
		marks=0.0f;
		System.out.println("Student->def...");
	}
	
	Student(int rollNo, String name, float marks){  //parameterized constructor
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		System.out.println("Student->param...");
	}
	
	Student(Student objStudent){					//Copy constructor
		this.rollNo=objStudent.rollNo;
		this.name=objStudent.name;
		this.marks=objStudent.marks;
		System.out.println("Student->copy...");
			}
	
	//methods
	//getter //setter
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMarks(float marks){
		this.marks = marks;
	}
	
	public float getMarks(){
		return marks;
	}
	
	@Override
	public String toString(){
		return getRollNo()+"\t"+getName()+"\t"+getMarks();
	}
	
	@Override
	public boolean equals(Object object){
		Student objStudent = (Student) object;
		System.out.println(rollNo-objStudent.getRollNo());
		
		if(rollNo == objStudent.getRollNo() && name.equals(objStudent.getName()) && marks == objStudent.getMarks()){
			return true;
		}
		
		else{
			return false;
		}
	}
}

class Student_Test{
	
	public static void main(String[] args){
		Student s1, s2, s3;
		s1 = new Student();
		s2 = new Student(101, "Amar", 50.5f);
		s3 = new Student(s2);
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = new Student(101, "Amar", 50.5f);
		students[2] = new Student(students[1]);
		
		for(Student student : students){
			System.out.println(student);
		}
	}
	
	public static void main1 (String[] args){
		System.out.println("Student_Test");
		
		Student s1, s2, s3;
		s1 = new Student();
		s2 = new Student(903, "Shubham", 93.4f);
		//s3 = new Student(s2);
		/*
		System.out.println(s1.rollNo+"\t"+s1.name+"\t"+s1.marks);
		System.out.println(s2.rollNo+"\t"+s2.name+"\t"+s2.marks);
		System.out.println(s3.rollNo+"\t"+s3.name+"\t"+s3.marks);
		*/
		s1.setRollNo(904);
		s1.setName("Shubham");
		s1.setMarks(93.4f);
		
		//System.out.println(s1.getRollNo()+"\t"+s1.getName()+"\t"+s1.getMarks());
		System.out.println(s1.toString());
		
		boolean bool;
		bool = s1.equals(s2);
		if(bool){
			System.out.println("s1 is equal to s2");
		}
		
		else{
			System.out.println("s1 is NOT equal to s2");
		}
		
	}
}