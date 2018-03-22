package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String S_id=null;
		Cookie[] c=null;
		
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		
		c=req.getCookies();
		//o.print(c.length);

		if(c!=null)
		{
		for (Cookie a:c) 
		{
			if(a.getName().equalsIgnoreCase("JSESSIONID"))
			{
				a.setMaxAge(0);
				res.addCookie(a);
				res.sendRedirect("http://www.localhost:8080/Vinay_Expenditure/Loginn.html");
				
			}
			
		}
		}

		
		
	}

	
}
