package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

import dto.ExpdDTO;
import dto.details;

public class AllExpenseDAO 
{
	public ArrayList<ExpdDTO> getAllExpense(String database)
	{
		String pwd=null;
		 Connection con=null;
		 Statement stmt=null;
		 PreparedStatement pmst=null;
		 ResultSet res=null;
		 ExpdDTO d=null;
		 ArrayList<ExpdDTO> a=new ArrayList<ExpdDTO>();
		 
		 try 
			{
				new Driver();
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vinay_Expenditure?user=root&password=root");
				
				pmst=con.prepareStatement("select min(amount), max(amount), sum(amount), avg(amount) from " +database);
				
				res=pmst.executeQuery();
				while(res.next())
				{
					d=new ExpdDTO();
					d.setMin(res.getInt(1));
					d.setMax(res.getInt(2));
					d.setSum(res.getInt(3));
					d.setAvg(res.getInt(4));
					
					a.add(d);
					
				}
				
				pmst=con.prepareStatement("select * from "+database);
				
			
				
				res=pmst.executeQuery();
				
				
				
				while(res.next())
				{
					d=new ExpdDTO();
					d.setExpd_No(res.getInt(1));
					d.setName(res.getString(2));
					d.setItems(res.getString(3));
					d.setAmount(res.getInt(4));
					d.setDate(res.getString(5));
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
