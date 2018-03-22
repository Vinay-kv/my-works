package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

import business_logic.RegisterDaoGetter;
//import dao.Register1;
import dao.RegisterDao;
import dao.Registration_DatabaseDAO;
import dto.Registerr;

public class Register extends HttpServlet 
{
	int j=0;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int a=0;
		String[] foodss=new String[10];
		
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		//o.print("your enterd details are:");
		
		String database=req.getParameter("database");
		String name=req.getParameter("name");
		//o.println(name+",");
		
		String password1=req.getParameter("password1");
		//o.println(password1+",");
		
		String password2=req.getParameter("password2");
		//o.println(password2+",");
		
		String email=req.getParameter("email");
		//o.println(email+",");
		
		String date=req.getParameter("date");
		//o.println(date+",");
		
		String[] foods=req.getParameterValues("foods");
		for (int i = 0; i < foods.length; i++) 
		{
		    foodss[i]=foods[i];
		}
		
		
		if(!password1.equals(password2))
		{
			o.println("<br><br><br><html><body><font color=\"red\">Password did't match....</font><marquee><p>all rights reserved: <font color=\"orange\">@Vinay Thimble</font></p></marquee></body></html>");
		}
		else
		{
		    dto.Registerr r=new dto.Registerr();
			r.setName(name);
			r.setPass1(password1);
			r.setPass2(password2);
			r.setEmail(email);
			r.setDate(date);
			r.setFood1(foodss[0]);
			r.setFood1(foodss[1]);
			r.setFood1(foodss[2]);
			
			RegisterDao r1=business_logic.RegisterDaoGetter.getRegisterDao("jdbc");
			
			Registration_DatabaseDAO reg=new Registration_DatabaseDAO();
			int succ=reg.checkRegistration_Database("Registration_Details_"+database);
			int ss=reg.check_Database(database);
			
			if(succ==1)
			{
				if(ss==1)
				{
					a=reg.insetIntoRegistration_Database(database,name, password1, email, date, foodss[0], foodss[1], foodss[2],"Registration_Details_"+database);
					if(a==1)
					{
						r1.register(database,name, password1, email, date, foodss[0], foodss[1], foodss[2]);

					}
				}
			}
			
			else
			{
				if(ss==1)
				{
					reg.createRegistration_Database("Registration_Details_"+database);
					a=reg.insetIntoRegistration_Database(database,name, password1, email, date, foodss[0], foodss[1], foodss[2],"Registration_Details_"+database);
					if(a==1)
					{

                          r1.register(database,name, password1, email, date, foodss[0], foodss[1], foodss[2]);
					}

				}
			}
			
			
			
						
			if(a==1)
			{
				o.println("<br><br><br><html><body style=\"background-color:aqua\"><h3><b><font color=\"orange\" face=\"Comic Sans MS\" >Registration successfull.. </font></b></h3></body></html>");
				o.println("<br><html><body style=\"background-color:aqua\"><b><font color=\"green\" face=\"Comic Sans MS\" >Welcome to the worlds best Expenditure management platform......  </font></b></body></html>");
				o.println("<br><html><body style=\"background-color:aqua\"><b><font color=\"navy\" face=\"Comic Sans MS\" >Developed especially to the peoples who are living in shared,rented house.. </font></b></body></html>");
				o.println("<br><html><body style=\"background-color:silver\"><b><font color=\"violet\" face=\"Comic Sans MS\" >Make the best use of this...</font></b><h1></body></html>");

				o.println("<br><html><body><a href=\"http://www.localhost:8080/Vinay_Expenditure/Loginn.html\"><b><font color=\"orange\" face=\"Comic Sans MS\" >Login here</font></b></a><marquee><p>all rights reserved: <font color=\"orange\">@Vinay Thimble</font></p></marquee></body></html>");
			}
			else
			{
				o.println("<br><br><br><html><body style=\"background-color:aqua\"><h3><b><font color=\"red\" face=\"Comic Sans MS\" >Registration Unsuccessfull.. </font></b></h3></body></html>");
				o.println("<br><html><body style=\"background-color:aqua\"><b><font color=\"green\" face=\"Comic Sans MS\" >Your name or password or e-mail may already used by other, try to give different </font></b></body></html>");
				o.println("<br><html><body style=\"background-color:aqua\"><b><font color=\"navy\" face=\"Comic Sans MS\" > name or password or e-mail,and Register</font></b></body></html>");
				o.println("<br><html><body style=\"background-color:silver\"><b><font color=\"violet\" face=\"Comic Sans MS\" >please select atleast three foods..</font></b></body></html>");

				o.println("<br><html><body><a href=\"http://www.localhost:8080/Vinay_Expenditure/Register.html\"><b><font color=\"orange\" face=\"Comic Sans MS\" >Register again here..</font></b></a><marquee><p>all rights reserved: <font color=\"orange\">@Vinay Thimble</font></p></marquee></body></html>");

			}
			
		}
	}
}
