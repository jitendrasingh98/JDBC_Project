package jdbcExample;

import java.sql.*;
import java.util.Scanner;

public class UpdateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 
        	 //create connection to database
        	 Class.forName("com.mysql.jdbc.Driver");
        	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
        	 System.out.println("Connected.");
        	 
        	 //create query to update value
        	 String query = "update student set name=?,email=?,contact=? where id =?";
        	 
        	 //create prepare class object
        	 PreparedStatement ps = con.prepareStatement(query);
        	 
        	 //create Scanner Class object for user input
        	 Scanner scan = new Scanner(System.in);
        
        	 System.out.println("Enter id to update value : ");
        	 int id = scan.nextInt();
        	 
        	 //for new line
        	 scan.nextLine();        	 
        	 System.out.println("Enter New Values : ");
        	 
        	 System.out.println("Enter Student name : ");
        	 String name= scan.nextLine();
        	 
        	 System.out.println("Enter Student email : ");
        	 String email = scan.nextLine();
        	 
        	 System.out.println("Enter Student Contact no : ");
        	 String contact = scan.nextLine();
        	
        	 
        	 //set values
        	 ps.setInt(4, id);
        	 ps.setString(1, name);
        	 ps.setString(2, email);
        	 ps.setString(3, contact);
        	 
        	 
        	 int execute =ps.executeUpdate();
        	 if(execute==1) {
        		 System.out.println("Value Updtaed...");
        		 System.out.println("Upadted values ....");
        		 System.out.println("Stuent Id : "+id);
        		 System.out.println("Student Name : "+name);
        		 System.out.println("Student Email : "+email);
        		 System.out.println("Student Contact No : "+contact);
        	 }
        	 
         }
         catch(Exception e) {
        	 System.out.println("Exception Occur...");
        	 e.printStackTrace();
         }
	}

}
