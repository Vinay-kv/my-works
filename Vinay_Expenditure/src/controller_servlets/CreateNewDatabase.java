package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CreateNewDatabaseDAO;

public class CreateNewDatabase extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		String table=req.getParameter("database");
		CreateNewDatabaseDAO ta=new CreateNewDatabaseDAO();
		ta.CreateNewTable(table);
		//o.print("created the new database..");
		
		o.print("<br>");
		//RequestDispatcher dis=req.getRequestDispatcher("/Buttons");
		//dis.include(req, res);
		o.print("<br>");
		o.print("<body style=\"background-color:aqua\"><br><br>	created the new database..");
		o.print("<br><br><br><br>");
		o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/Register.html\">click here..</a> to register to new database.." +
				"<br><h1><p align=\"center\" style=\"color:red\">Remember this database name...</p></h1>"+
				"<h2><p align=\"center\" style=\"color:green\">And share with all your room/home mates...</p></h2>"+
				"<h3><p align=\"center\" style=\"color:indigo\">So that they should REGISTER and LOGIN using this DATABASE name...</p></h3>"+

				"<marquee><p>all rights reserved: <font color=\"blue\">@Vinay Thimble</font></p></marquee></body>");
		
		
		
		
	}

	
}
