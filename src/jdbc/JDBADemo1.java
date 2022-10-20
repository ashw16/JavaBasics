package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBADemo1
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Connection con = DriverManager.getConnection("jdbc:mysql:///batch_7542", "root", "12345");
		Statement stm = con.createStatement();
		/*
		 * String query="Select * from Employee1";
		 *  ResultSet rs=stm.executeQuery(query);
		 * while(rs.next()) {
		 * System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getString(3))
		 * ; }
		 */

		String query = "insert into Employee2 values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		String name = sc.nextLine();
		System.out.println("Enter employee email:");
		String email = sc.nextLine();
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, email);

//		pstmt.setInt(1,1);
//		pstmt.setString(2, "hanmu");
//		pstmt.setString(3, "hanmu@gmail.com");
//		
		int count = pstmt.executeUpdate();
		if (count > 0) 
		{
			System.out.println("Record id inserted");
		}
		else 
		{
			System.out.println("Record is not inserted");
		}

	}

}
