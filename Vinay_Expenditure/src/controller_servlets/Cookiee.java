package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookiee extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		
		Cookie[] a=req.getCookies();
		
		for(Cookie b:a)
		{
			o.print(b.getName());

			o.print(b.getValue()+",");
			o.println();
		}
		
		
		
	}

	
}
