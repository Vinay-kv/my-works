package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Getting_AllMembers_inforamtion;
import dao.PasswordVerification;
import dao.PasswordVerificationJDBC_imple;
import dao.Registration_DatabaseDAO;
import dto.details;

public class HomePage extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{

		HttpSession session=req.getSession();
		
		String name=req.getParameter("name");
		session.setAttribute("name", name);
		
		String database=req.getParameter("database");
		session.setAttribute("database", database);
		
		String password=req.getParameter("pass");
		session.setAttribute("pass", password);
		
		res.setContentType("text/html");
		
		PrintWriter o=res.getWriter();
		
		PasswordVerification a=new PasswordVerificationJDBC_imple();
		
		String pwd=a.PasswordVerification(name,"Registration_Details_"+database);
		
		
		
		if(password.equals(pwd))
		{
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

			//Getting_AllMembers_inforamtion d=new Getting_AllMembers_inforamtion();
			//o.print("<br><br>");
			Registration_DatabaseDAO d=new Registration_DatabaseDAO();
			
			details dd=d.detailsGetIndi(name,"Registration_Details_"+database);
			o.print("<html><head><title>Homepage</title></head><body style=\"background-color:silver\" background=\"/Vinay_Expenditure/apics/home.jpg\">");
			o.print("<img height=\"70px\" width=\"1000px\" alt=\"vini lover\" src=\"/Vinay_Expenditure/b.jpg\">");
			//RequestDispatcher diss=req.getRequestDispatcher("/Buttons");
			
			o.print("<fieldset><legend>Your details...</legend>" +
					"<table border=\"05\"bordercolor=\"indigo\" bgcolor=\"orange\"  cellpadding=\"15\" cellspacing=\"3\">" +
					"<tr><th>name</th><th>E-Mail</th><th>date</th><th>");
			o.print("food1</th><th>food2</th><th>food3</th><th>Database</th></tr>");
			o.print("<tr><td>"+dd.getName()+"</td><td>"+dd.getEmail()+"</td><td>"+dd.getDate()+"</td><td>"+dd.getFood1()+"</td><td>"+dd.getFood2()+"</td><td>"+dd.getFood3()+ "</td><td>"+dd.getDatabase()+ "</td>");
			o.print("</tr></table></fieldset><br>" +
		"<fieldset><a href=\"AddExpd1.html\">Click here..</a><b><font color=\"orange\" face=\"Comic Sans MS\" > to add your Expenditure..</font></b></fieldset>"+
					"<br><center><table border=\"3\" bordercolor=\"indigo\" cellpadding=\"6\" ><tr><td><video src=\"/Vinay_Expenditure/audios/1.mp4\" controls width=\"200px\" height=\"200px\" ></video></td>"+
"<td><audio src=\"/Vinay_Expenditure/audios/ugram.mp3\" controls autoplay loop  ></audio></td>"+
					"<td><img  height=\"200px\" width=\"200px\" alt=\"vini\" src=\"/Vinay_Expenditure/a.jpg\"></td></tr></table></center><fieldset>");
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/inform\">click here.. </a><b><font color=\"orange\" face=\"Comic Sans MS\" > to see other members info..</font></b></fieldset>");
			o.print("<marquee><p>all rights reserved: <font color=\"vinay\">@Vinay Thimble</font></p></marquee></body></html>");
			
		}
		else
		{
			RequestDispatcher dis=req.getRequestDispatcher("/Buttons");
			o.print("<br>");
			dis.include(req, res);
			o.print("<br>");
			
			res.sendRedirect("http://www.localhost:8080/Vinay_Expenditure/LoginError.html");
		}
		
	}

}
