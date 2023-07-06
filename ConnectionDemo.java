package corejava15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try{  
		            Class.forName("com.mysql.cj.jdbc.Driver");  
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Computerscience4");  
		           if(conn== null) {
		        	   System.out.println("Connection Failed");
		           }
		           else {
		        	   System.out.println("Success..Connection with MySQL is established");
		           }
		           
		           Statement statement= conn.createStatement();
		          // boolean success=statement.execute("Create table studentsnva(sno INT, sname VARCHAR(35), course VARCHAR(50))");
		           boolean success=statement.execute("Create table Product (Pid INT PRIMARY KEY, Pname VARCHAR(25), Qty INT, Price INT)");
		            if(success== false) {
		            	System.out.println("Success.. Table Created");	
		            }
		            else {
		            	System.out.println("Failed to create a Table");
		            }
		             
		        }catch(ClassNotFoundException | SQLException ex){
		            System.out.println(ex);
		        }  
		    }


}
