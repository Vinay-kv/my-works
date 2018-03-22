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

public class AddExpenditureDAO 
{
	public int AddExp(String database,String name,String item,String amount,String date)
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
				res=stmt.executeQuery("select max(Expd_No) from " +database);
				
				if(res.next())
				{
				max=res.getInt("max(Expd_No)");
					//max=res.getInt(1);
				}
				
				pmst=con.prepareStatement("insert into "+ database + " values(?,?,?,?,?)");
				
				if(max==null)
				{
				    pmst.setInt(1, 1);
				}
				else
				{
					int t=max+1;
					pmst.setInt(1, t);	
				}
				pmst.setString(2, name);
				pmst.setString(3, item);
				pmst.setString(4, amount);
				pmst.setString(5, date);
				
				a=pmst.executeUpdate();
				
			
				
			
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
					return a;
				}
			}

	}


}
