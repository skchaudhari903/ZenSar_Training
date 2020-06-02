import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.insert(5, "Geeta", 73.6f);
		studentDAO.selectALL();
		studentDAO.delete(5);
	}
		public StudentDAO() {
			String DB_DRIVER = "com.mysql.jdbc.Driver";
			String DB_URL = "jdbc:mysql://localhost:3306/SITRC";
			String USERNAME = "root";
			String PASSWORD = "7162";
			
			try {
				Class.forName(DB_DRIVER);
				con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Connection Established...");
		}
		
		public void selectALL() {
			String SQL = "SELECT * FROM STUDENT";
			Statement stat = null;
			ResultSet rs = null;
			try {
				stat = con.createStatement();
				rs = stat.executeQuery(SQL);
				
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				for(int i = 1; i <=columnCount; i++) {
					System.out.print(rsmd.getColumnName(i) + ":" + rsmd.getColumnTypeName(i) + "\t");
				}
				System.out.println();
				while(rs.next()) {
					System.out.println(rs.getInt("rollno")+"\t\t"+
			rs.getString("name")+"\t\t"+rs.getFloat("marks"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				rs.close();
				stat.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void insert(int rollNo, String name, float marks) {
			
			String SQL = "INSERT INTO STUDENT(rollno, name, marks) values (?, ?, ?)";
			PreparedStatement pstat = null;
			int rows = 0;
			try {
				pstat = con.prepareStatement(SQL);
				pstat.setInt(1, rollNo);
				pstat.setString(2, name);
				pstat.setFloat(3, marks);
				rows = pstat.executeUpdate();
				System.out.println(rows+" row Inserted...");
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				pstat.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		public void delete(int rollNo) {
			
			String SQL = "delete from Student where rollno=?";
			PreparedStatement pstat = null;
			int rows = 0;
			try {
				pstat = con.prepareStatement(SQL);
				
				pstat.setInt(1, rollNo);
				rows = pstat.executeUpdate();
				System.out.println(rows+" row Deleted...");
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				pstat.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}