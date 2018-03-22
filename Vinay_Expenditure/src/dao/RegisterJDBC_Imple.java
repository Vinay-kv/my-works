package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import dto.Registerr;
public class RegisterJDBC_Imple implements RegisterDao
{


	

    @SuppressWarnings("finally")
	public int register(String database,String name,String password,String email,String date,String f1,String f2,String f3)
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
				
				String Name=re.getName();
				String Password=re.getPass1();
				String E_mail=re.getEmail();
				String Date=re.getDate();
				String Food1=re.getFood1();
				String Food2=re.getFood2();
				String Food3=re.getFood3();
				
				String query="insert into Registration_Details (data_base, Name, Password, E_mail, Date, Food1, Food2, Food3)"+
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
	
	}
