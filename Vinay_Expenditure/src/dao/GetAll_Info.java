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

public class GetAll_Info 
{
	public ArrayList<details> getInfo()
	{
		String pwd=null;
		 Connection con=null;
		 Statement stmt=null;
		 PreparedStatement pmst=null;
		 ResultSet res=null;
		 details d=null;
		 ArrayList<details> a=new ArrayList<details>();
		 
		 try 
			{
				new Driver();
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vinay_Expenditure?user=root&password=root");
				
				stmt=con.createStatement();
				
				res=stmt.executeQuery("select * from Registration_Details");
				
				while(res.next())
				{
					d=new details();
					d.setDatabase(res.getString("data_base"));
					d.setName(res.getString("Name"));
					d.setEmail(res.getString("E_mail"));
					d.setDate(res.getString("Date"));
					d.setFood1(res.getString("Food1"));
					d.setFood2(res.getString("Food2"));
					d.setFood3(res.getString("Food3"));
					a.add(d);
					
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
					return a;
				}
			}

	}

	

}
