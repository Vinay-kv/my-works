package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Dynamic_ExecuteUpdate {
	static Connection con;
	static Statement stmt;
	static ResultSet res;
	static PreparedStatement psmt;
	public static void main(String[] args) 
	{
		try {
			new Driver();
				
				
			String dburl="jdbc:mysql://localhost:3306/vinay_database?user=root&password=root";//here jdbc and
			//mysql inside dburl is case insensitive
			
			
				  con=DriverManager.getConnection(dburl);
			
			
			/*String query="insert into expenditure values('mota','cerels',40,'1/30/2017',7)";*/
			String query="insert into expenditure values(?,?,?,?,?)";
			
			
				/*stmt=con.prepareStatement(query);//this line is not showing error,even when we are catching
				preparedStatement instance using Statement reference variable */
				
			 psmt=con.prepareStatement(query);
			 
			 psmt.setString(1, args[0]);
			 psmt.setString(2, args[1]);
			 psmt.setInt(3, Integer.parseInt(args[2]));
			 psmt.setString(4, args[3]);
			 psmt.setInt(5,  Integer.parseInt(args[4]));
			
			
				 int a=psmt.executeUpdate();
			
			
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
						if (psmt!= null) {
							psmt.close();
						} 
					
					} 
					catch (SQLException e2)
					{
						e2.printStackTrace();
					}
					
					
				}
			
			
			
			
			

		}



	}


