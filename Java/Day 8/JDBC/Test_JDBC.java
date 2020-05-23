import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String DB_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/SITRC";
		String USERNAME = "root";
		String PASSWORD = "7162";
		String SQL = "SELECT * FROM STUDENT";
		
		Connection connection = null;
		
		try {
			//1.
			Class.forName(DB_DRIVER);
			//2.
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			//3.
			Statement statement = connection.createStatement();
			//4.
			ResultSet resultSet = statement.executeQuery(SQL);
			//5.
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("rollno")+"\t"+
			resultSet.getString("name")+"\t"+resultSet.getFloat("marks"));
			}
			resultSet.close();
			statement.close();
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
