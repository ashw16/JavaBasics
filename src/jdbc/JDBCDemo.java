package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBCDemo 
{

	public static void main(String[] args) throws SQLException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///batch_7542","root","12345");
			Statement stmt=con.createStatement();
			
			String query="create table Employee2(empid int(25),empname varchar(250),email varchar(250))";
			//String query="insert into Employee1 values(1,'ashu','ash@gmail.com')";
			//String query="insert into Employee1 values(2,'ash','ash1@gmail.com')";
			//String query="insert into Employee1 values(3,'sushu','sush@gmail.com')";
			
		
			//String query="insert into Employee1 values(4,'varru','varru@gmail.com')";
		//stmt.executeUpdate(query);
		//	System.out.println("Table is created");
			
			int count=stmt.executeUpdate(query);
			if(count>0)
			{
				System.out.println("Record id inserted");
			}
			else
			{
				System.out.println("Record is not inserted");
			}
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not found exception"+e);
		}
	}

}
