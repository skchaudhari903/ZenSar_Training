import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.collection.Student;

public class Test_FileStream {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		fileInputStream("D:\\Read.txt");
//		fileOutputStream("D:\\Read.txt");
//		datafileOutputStream("D:\\Read.txt");
//		datafileInputStream("D:\\Read.txt");
		objectOutputStream("D:\\Read.txt");
	}
	
	public static void fileInputStream(String fileName){
		File file = new File(fileName);
		try 
		{
			FileInputStream fileInputStream = new FileInputStream(file);
			int data;
			try 
			{
				for(int i=0;i<file.length();i++)
				{
					data = fileInputStream.read();
					System.out.print((char)data);
				}
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void fileOutputStream(String fileName)
	{
		File file = new File(fileName);
		String message = "Example of output stream";
		
		FileOutputStream fileoutput = null;
		try {
			fileoutput = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileoutput.write(message.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void datafileOutputStream(String fileName){
		File file = new File(fileName);
		int playerno=1;
		String message = "Virat";
		float score = 150.5f;

		FileOutputStream fileoutput = null;
		try {
			DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(file));
			dataOutput.writeInt(playerno);
			dataOutput.writeUTF(message);
			dataOutput.writeFloat(score);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void datafileInputStream(String fileName)
	{
		File file = new File(fileName);
		FileOutputStream fileoutput = null;
		try {
			DataInputStream dataInput = new DataInputStream(new FileInputStream(file));
			System.out.println(dataInput.readInt());
			System.out.println(dataInput.readUTF());
			System.out.println(dataInput.readFloat());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void objectOutputStream(String fileName)
	{
		File file = new File(fileName);
		Student s1 = new Student(101,"Virat");
		try {
			ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(file));
			objectOutput.writeObject(s1);
			System.out.println("This..Object Output");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void objectInputStream(String fileName){
		File file = new File(fileName);
		Student s1 = new Student(101,"Virat");
		try {
			ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file));
				Student student = (Student) objectInput.readObject();
				System.out.println(student.rollno);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}