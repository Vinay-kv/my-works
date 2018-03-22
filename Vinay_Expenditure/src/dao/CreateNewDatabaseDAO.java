package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

import dto.details;

public class CreateNewDatabaseDAO 
{
	public void CreateNewTable(String newtable)
	{
		 String pwd=null;
		 Connection con=null;
		 Statement stmt=null;
		 PreparedStatement pmst=null;
		 ResultSet res=null;
		 int a=0;
		 Integer max=null;
		 
		 
		 try 
			{
				new Driver();
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vinay_Expenditure?user=root&password=root");
				
				stmt=con.createStatement();
				a=stmt.executeUpdate("create table " +newtable+" (Expd_No int(240) primary key,Name varchar(50),Items varchar(50),Amount int(20),Date date) ");
				
				
			} 
			
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			finally 
			{
				
				try {
						if(con!=null)
						{
						    con.close();
						}
						if(stmt!=null)
						{
						    con.close();
						}
						if(pmst!=null)
						{
							stmt.close();
						}
						if(res!=null)
						{
							res.close();
						}
							
					} 
				catch (SQLException e) 
				{
					
						e.printStackTrace();
						
				}
				finally
				{
					//return a;
				}
			}

	}


}
