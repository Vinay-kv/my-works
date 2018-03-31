package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Static_ExecuteUpdate_JDBC1 
{
	static Connection con;
	static Statement stmt;
	static int a;
	public static void main(String[] args) 
	{
		
			try {
		new Driver();
			
			
		String dburl="jdbc:mysql://localhost:3306/vinay_database?user=root&password=root";//here jdbc and
		//mysql inside dburl is case insensitive
		
		
			  con=DriverManager.getConnection(dburl);
		
		
		String query="insert into expenditure values('mota','cerels',40,'1/30/2017',7)";
		
		
			stmt=con.createStatement();
			
		
		
			 a=stmt.executeUpdate(query);
		
		
		System.out.println("no of rows affeected: "+a);
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				try 
				{
					if (con != null) {
						con.close();
					}
					if (stmt != null) {
						stmt.close();
					} 
				
				} 
				catch (SQLException e2)
				{
					e2.printStackTrace();
				}
				
				
			}
		
		
		
		
		

	}

}
