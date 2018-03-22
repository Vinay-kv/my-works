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

import dao.GetAll_Info;
import dto.details;

public class GetAllInfo extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Cookie[] c=req.getCookies();
		String S_id=c[0].getName();
		
		if(!S_id.equalsIgnoreCase(req.getSession(false).getId()))
		{
			res.sendRedirect("/LoginError.html");
			
		}
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		
		GetAll_Info get=new GetAll_Info();
		
		ArrayList<details> ar=get.getInfo();
		ListIterator l=ar.listIterator();
	
		o.print("<!DOCTYPE html><html><head><title>all members info</title></head><body background=\"/Vinay_Expenditure/33.jpg\">");
		o.print("<img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vinay lover\" src=\"/Vinay_Expenditure/tamanna.jpg\">");
		o.print("<fieldset><legend>all members info..</legend>");
		o.print("<table border=\"10\" bordercolor=\"indigo\" bgcolor=\"orange\"  cellpadding=\"15\" cellspacing=\"3\">");
		o.print("<tr><th>name</th><th>E-Mail</th><th>date</th><th>food1</th><th>food2</th><th>food3</th><th>Database</th></tr>");
		
		while(l.hasNext())
		{
			details dd=(details) l.next();
			o.print("<tr><td>"+dd.getName()+"</td><td>"+dd.getEmail()+"</td><td>"+dd.getDate()+"</td><td>"+dd.getFood1()+"</td><td>"+dd.getFood2()+"</td><td>"+dd.getFood3()+ "</td><td>"+dd.getDatabase()+ "</td></tr>");
		}
		o.print("</table></fieldset><br>");
		o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vini\" src=\"/Vinay_Expenditure/Tamanna1.jpg\"></center>");
		o.print("</body></html>");
		
	}

	
}
