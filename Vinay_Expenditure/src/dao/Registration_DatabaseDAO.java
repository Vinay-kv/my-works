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

public class Registration_DatabaseDAO 
{
	public int checkRegistration_Database(String registration_Database)
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
				res=stmt.executeQuery("show tables");
				
				while(res.next())
				{
					if(res.getString(1).equalsIgnoreCase(registration_Database))
					{
					   a=1;
					}
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

public void createRegistration_Database(String registration_Database)
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
			a=stmt.executeUpdate("create table " +registration_Database+" (Name varchar(35) primary key,Password varchar(35),E_mail varchar(50),Date date,Food1 varchar(20),Food2 varchar(20),Food3 varchar(20),data_base varchar(25)) ");
			
			
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

public int insetIntoRegistration_Database(String database,String name,String password,String email,String date,String f1,String f2,String f3,String regDatabase)
{
	 
    int a=0;
	 Connection con=null;
	 Statement stmt=null;
	 PreparedStatement pmst=null;

		try 
		{
			new Driver();
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vinay_Expenditure?user=root&password=root");
			
			dto.Registerr re=new dto.Registerr();
			
			/*String Name=re.getName();
			String Password=re.getPass1();
			String E_mail=re.getEmail();
			String Date=re.getDate();
			String Food1=re.getFood1();
			String Food2=re.getFood2();
			String Food3=re.getFood3();*/
			
			String query="insert into " + regDatabase+ " (data_base, Name, Password, E_mail, Date, Food1, Food2, Food3)"+
					" values(?,?,?,?,?,?,?,?)";
			
			
							
			pmst=con.prepareStatement(query);
			pmst.setString(1, database);				
			pmst.setString(2, name);
			pmst.setString(3, password);
			pmst.setString(4, email);
			pmst.setString(5, date);
			pmst.setString(6, f1);
			pmst.setString(7, f2);
			pmst.setString(8, f3);
			
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
						stmt.close();
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

public details detailsGetIndi(String name, String RegDatabase)
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
			
			pmst=con.prepareStatement("select * from " +RegDatabase+ " where name=?");
			
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

public ArrayList<details> detailsGetAll(String RegDatabase)
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
			
			res=stmt.executeQuery("select * from "+RegDatabase);
			
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

public int check_Database(String database)
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
			res=stmt.executeQuery("show tables");
			
			while(res.next())
			{
				if(res.getString(1).equalsIgnoreCase(database))
				{
				   a=1;
				}
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

