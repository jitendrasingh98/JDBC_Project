package jdbcExample;
import java.sql.*;

public class ValueInserted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
    	   System.out.println("Connected.");
    	   PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
    	   ps.setInt(1, 1);
    	   ps.setString(2,"Abhay");
    	   ps.setString(3, "abhay@gamil.com");
    	   ps.setString(4, "9897589625");
    	   int  val=ps.executeUpdate();
    	   if(val==1) {
    		   System.out.println("Values Inserted.");
    	   }
    	   
       }
       catch(Exception e) {
    	   System.out.println("Connection failed.");
       }
	}

}