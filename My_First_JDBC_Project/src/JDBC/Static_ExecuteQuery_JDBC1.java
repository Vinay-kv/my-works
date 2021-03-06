package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Static_ExecuteQuery_JDBC1 {
	
	static Connection con;
	static Statement stmt;
	static ResultSet res;
	public static void main(String[] args) 
	{
		
		try 
		{
			new Driver();
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinay_database?user=root&password=root");
			
			String query="select * from expenditure";
			
			stmt=con.createStatement();
			
			res=stmt.executeQuery(query);
			
			while(res.next())
			{
				String name=res.getString("name");
				String item=res.getString("item");
				int amount=res.getInt("amount");
				String date=res.getString("date");
				int serial_num=res.getInt("serial_num");
				
				System.out.print("name: "+name+" ,");
				System.out.print("item: "+item+" ,");
				System.out.print("amount: "+amount+" ,");
				System.out.print("date: "+date+" ,");
				System.out.print("serial_num: "+serial_num+" ,");
				System.out.println();
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (res != null) {
					res.close();
				} 
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}

	}

}
