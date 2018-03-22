package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AllExpenseDAO;
import dto.ExpdDTO;

public class Buttons extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		String S_id=null;	
		Cookie[] c=null;
		c=req.getCookies();
		//o.print(c.length);

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
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/LoginError.html\">Login again..</a>");
		}
		else
		{
	      
			o.print("<!DOCTYPE html><html><body>");
			o.print("<p align=\"right\">");
			o.print("<table>");
			  o.print("<tr>");
			      o.print("<td><form  action=\"http://www.localhost:8080/Vinay_Expenditure/homepage?name="+req.getSession().getAttribute("name")+"&database="+req.getSession().getAttribute("database")+"&pass="+req.getSession().getAttribute("pass")+ " \" method=\"post\">");
			o.print("<button type=\"submit\" style=\"color:orange;size:15\" >Home</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/AddExpd1.html\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">Add expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/MonthlyExpd.html\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:orange\">Mine monthly expenditure</button>");
			o.print("</form></td>");
			o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/Range.html\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">Mine duration expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/indi_exp\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">Mine all expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form  action=\"http://www.localhost:8080/Vinay_Expenditure/inform\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:orange;size:15\" >All member's info</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/allexpd\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">All member's expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/Logout\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:orange\">Logout</button>");
			o.print("</form></td>");
			  o.print("</tr>");
			o.print("</table>");
			o.print("</p>");
			o.print("<p align=\"right\">");
			o.print("<table>");
			 o.print(" <tr>");
			      o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/MonthlyExpd1.html\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:orange\">All members monthly expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/Range1.html\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">All members duration expenditure</button>");
			o.print("</form></td>");
			    o.print("<td><form action=\"http://www.localhost:8080/Vinay_Expenditure/AllExpense\" method=\"get\">");
			o.print("<button type=\"submit\" style=\"color:green\">All members complete expenditure</button>");
			o.print("</form></td>");
			o.print("</tr>");
			o.print("</table>");
			o.print("</p>");
			o.print("</body></html>");		
			}
}
}
