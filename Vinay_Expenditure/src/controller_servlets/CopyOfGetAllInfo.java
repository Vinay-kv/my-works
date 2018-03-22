package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetAll_Info;
import dao.Registration_DatabaseDAO;
import dto.details;

public class CopyOfGetAllInfo extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher dis=req.getRequestDispatcher("/Buttons");
		
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		String S_id=null;
		Cookie[] c=null;
		
		c=req.getCookies();
		
		if(c!=null)
		{
		for (Cookie a:c) 
		{
			if(a.getName().equalsIgnoreCase("JSESSIONID"))
			{
				S_id=a.getValue();
				//o.print("Session id is "+S_id);
			}
			
		}
		}
		
		
		if(S_id==null)
		{
			//res.sendRedirect("/LoginError.html");
			o.print("Your session expired...  ");
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/Loginn.html\">Login again..</a>");
		}
		else
		{

		
		//GetAll_Info get=new GetAll_Info();
		//ArrayList<details> ar=get.getInfo();
		
		Registration_DatabaseDAO get=new Registration_DatabaseDAO();
		ArrayList<details> ar=get.detailsGetAll("Registration_Details_"+(String)req.getSession().getAttribute("database"));
		ListIterator l=ar.listIterator();
		o.print("<br>");
		dis.include(req, res);
		o.print("<br>");
	
		o.print("<!DOCTYPE html><html><head><title>all members info</title></head><body style=\"background-color:silver\" background=\"/Vinay_Expenditure/apics/leafs.jpg\">");
		o.print("<img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vinay lover\" src=\"/Vinay_Expenditure/samu.jpg\">");
		o.print("<center><fieldset style=\"color:orange\"><legend>all members info..</legend>");
		//border=\"10\" bordercolor=\"indigo\" bgcolor=\"orange\" 
		o.print("<table  border=\"3\" bordercolor=\"indigo\" cellpadding=\"6\" cellspacing=\"1\" bgcolor=\"green\">");
		o.print("<tr><th>name</th><th>E-Mail</th><th>date</th><th>food1</th><th>food2</th><th>food3</th><th>Database</th></tr>");
		
		while(l.hasNext())
		{
			details dd=(details) l.next();
			o.print("<tr><td>"+dd.getName()+"</td><td>"+dd.getEmail()+"</td><td>"+dd.getDate()+"</td><td>"+dd.getFood1()+"</td><td>"+dd.getFood2()+"</td><td>"+dd.getFood3()+ "</td><td>"+dd.getDatabase()+ "</td></tr>");
		}
		o.print("</table></fieldset></center><br>");
		o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vini\" src=\"/Vinay_Expenditure/vinay.jpg\"></center>");
		o.print("<marquee><p>all rights reserved: <font color=\"orange\">@Vinay Thimble</font></p></marquee></body></html>");
		}
		
	}

	
}
