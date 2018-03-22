package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import dto.details;

public class Getting_AllMembers_inforamtion 
{
	
	public details detailsGet(String name)
	{
		 String pwd=null;
		 Connection con=null;
		 Statement stmt=null;
		 PreparedStatement pmst=null;
		 ResultSet res=null;
		 details d=new details();
		 try 
			{
				new Driver();
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vinay_Expenditure?user=root&password=root");
				
				pmst=con.prepareStatement("select * from Registration_Details where name=?");
				
				pmst.setString(1, name);
				
				res=pmst.executeQuery();
				
				if(res.next())
				{
					d.setName(res.getString("name"));
					d.setEmail(res.getString("e_mail"));
					d.setDate(res.getString("date"));
					d.setFood1(res.getString("food1"));
					d.setFood2(res.getString("food2"));
					d.setFood3(res.getString("food3"));
					d.setDatabase(res.getString("data_base"));
				}
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
					return d;
				}
			}


	}

}
