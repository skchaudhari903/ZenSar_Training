import java.io.File;

public class Test_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\ReadMe.txt");
		System.out.println("Can Execute :"+file.canExecute());
		System.out.println("Length :"+file.length());
		System.out.println("Exists :"+file.exists());
		System.out.println("Path :"+file.getPath());
	}

}
