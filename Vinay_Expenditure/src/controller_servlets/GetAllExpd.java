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

import dao.GetAll_ExpdDAO;
import dao.GetAll_Info;
import dto.ExpdDTO;
import dto.details;

public class GetAllExpd extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher dis=req.getRequestDispatcher("/Buttons.html");
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
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/LoginError.html\">Login again..</a>");
		}
		else
		{

			o.print("<br>");
			dis.include(req, res);
			o.print("<br>");
		
		GetAll_ExpdDAO get=new GetAll_ExpdDAO();
		
		ArrayList<ExpdDTO> ar=get.getExpdInfo((String)req.getSession().getAttribute("database"));
		ListIterator l=ar.listIterator();
	
		o.print("<!DOCTYPE html><html><head><title>all expenditures info</title></head><body style=\"background-color:silver\">");
		o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vinay lover\" src=\"/Vinay_Expenditure/tamanna.jpg\"><center>");
		o.print("<fieldset><legend>all expenditures info..</legend>");
		o.print("<table border=\"10\" bordercolor=\"indigo\" bgcolor=\"orange\"  cellpadding=\"15\" cellspacing=\"3\">");
		o.print("<tr><th>Expd_No</th><th>Name</th><th>Items</th><th>Amount</th><th>Date</th></tr>");
		
		while(l.hasNext())
		{
			ExpdDTO dd=(ExpdDTO) l.next();
			o.print("<tr><td>"+dd.getExpd_No()+"</td><td>"+dd.getName()+"</td><td>"+dd.getItems()+"</td><td>"+dd.getAmount()+"</td><td>"+dd.getDate()+"</td></tr>");
		}
		o.print("</table></fieldset><br>");
		//o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vini\" src=\"/Vinay_Expenditure/Tamanna1.jpg\"></center>");
		o.print("<marquee><p>all rights reserved: <font color=\"orange\">@Vinay Thimble</font></p></marquee></body></html>");
		}
		
	}

	
}
