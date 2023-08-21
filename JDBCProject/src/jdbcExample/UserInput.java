package jdbcExample;

import java.sql.*;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  
        	  // create connection
        	  Class.forName("com.mysql.jdbc.Driver");
        	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
        	  System.out.println("Connected.");
        	  
        	  //create Query
        	  String query = "insert into student values(?,?,?,?)";
        	  
        	  //prepare statement
        	  PreparedStatement ps = con.prepareStatement(query);
 
        	  //for user input create scanner class object
        	  Scanner scan = new Scanner(System.in);
        	  
        	  System.out.println("Enter  student id : ");
        	  int id= scan.nextInt();
        	   
        	  //for consume character
        	  scan.nextLine();
        	  
        	  System.out.println("Enter Student Name : ");
        	  String name = scan.nextLine();
        	  
        	  System.out.println("Enter Student eamil : ");
        	  String email =scan.nextLine();
        	  
        	  System.out.println("Enter Student Contact No : ");
        	  String contact = scan.nextLine();
        	  
        	  
        	  
        	  //set values
        	  ps.setInt(1,id);
        	  ps.setString(2, name);
        	  ps.setString(3, email);
        	  ps.setString(4, contact);
        	  
        	  
        	  int val = ps.executeUpdate();
        	  if(val==1) {
        		  System.out.println("Value Inserted.");
        		  System.out.println("Value...");
        		  System.out.println("Student Id : "+id);
        		  System.out.println("Student Name : "+name);
        		  System.out.println("Student Email : "+email);
        		  System.out.println("Student Contct No : "+contact);
        	  }
          }
          catch(Exception e) {
        	  System.out.println("Exectpiton..");
          }
	}

}
