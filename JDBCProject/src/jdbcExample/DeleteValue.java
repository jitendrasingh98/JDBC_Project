package jdbcExample;
import java.sql.*;
import java.util.Scanner;

public class DeleteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//create connection to database
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
			System.out.println("Database Connected.");
            
			//create Query to Delete Value from Database
			String delete = "delete from student where id=?";
			
			PreparedStatement ps = con.prepareStatement(delete);
			
			//create Scanner class object for user Input
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Student Id to Delete the Record of the Student : ");
			int id =scan.nextInt();
			
			ps.setInt(1, id);
			
			int executequery = ps.executeUpdate();
			if(executequery == 1) {
				System.out.println("Record Deleted.");
				//System.out.println("Deleted record Is : "+id);
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception Occur");
			e.printStackTrace();
		}
		

	}

}
