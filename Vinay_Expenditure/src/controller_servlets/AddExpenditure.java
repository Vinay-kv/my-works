package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AddExpenditureDAO;

public class AddExpenditure extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{

		String S_id=null;
		int count=0;
		Cookie[] c=null;
		RequestDispatcher dis=req.getRequestDispatcher("/Buttons.html");
		
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
				S_id=a.getValue();
				//o.print("Session id is "+S_id);
			}
			
		}
		}
		
		
		/*if((S_id.equals("vi"))||(!req.getSession(false).getId().equalsIgnoreCase(S_id)))
		{
			res.sendRedirect("/LoginError.html");
			
		}*/
		
		if(S_id==null)
		{
			//res.sendRedirect("/LoginError.html");
			o.print("Your session expired...  ");
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/Loginn.html\">Login again..</a>");
		}
		else
		{
			if(req.getSession(false).getId().equalsIgnoreCase(S_id))
			{
		String item=req.getParameter("item");
		String amount=req.getParameter("amount");
		String date=req.getParameter("date");
		
		String name=(String) req.getSession(false).getAttribute("name");
		AddExpenditureDAO add=new AddExpenditureDAO();
		String aa=(String) req.getSession().getAttribute("database");
		count=add.AddExp(aa,name, item, amount, date);
		
		
		if(count==0)
		{
			o.print("<br>");
			dis.include(req, res);
			o.print("<br>");
			o.print("<body style=\"background-color:aqua\"><br><br>	your expenditure data is not added..");
			o.print("<br><br><br><br>");
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/AddExpd1.html\">click here..</a> to try again..<marquee><p>all rights reserved: <font color=\"blue\">@Vinay Thimble</font></p></marquee></body>");
			
		}
		else
		{
			o.print("<br>");
			dis.include(req, res);
			o.print("<br>");
			o.print("<body style=\"background-color:silver\"><b><font color=\"green\" face=\"Comic Sans MS\" > successfully added..</font></b>");
			o.print("<br><br>");
			o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/AddExpd1.html\">click here..</a><b><font color=\"violet\" face=\"Comic Sans MS\" >  to add another item..</font></b><marquee><p>all rights reserved: <font color=\"blue\">@Vinay Thimble</font></p></marquee></body></body>");
			
		}
			}
		}
		
	
		
	}

	
}
