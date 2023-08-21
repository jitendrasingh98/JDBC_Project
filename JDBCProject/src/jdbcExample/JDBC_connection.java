package jdbcExample;
import java.sql.*;

public class JDBC_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           try {
        	   Class.forName("com.mysql.jdbc.Driver");
        	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
        	   System.out.println("Connected Succesfully.");
           }
           catch(Exception e) {
        	   System.out.println("Connection Failed.");           }
	}

}
