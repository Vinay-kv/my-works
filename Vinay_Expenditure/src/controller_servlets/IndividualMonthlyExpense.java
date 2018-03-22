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

import dao.IndividualMonthlyExpenseDAO;
import dto.ExpdDTO;

public class IndividualMonthlyExpense extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
	String S_id=null;
    Cookie[] c=null;
    String month;
    String name;
	RequestDispatcher dis=req.getRequestDispatcher("/Buttons");
	
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
	
	
	if(S_id==null)
	{
		//res.sendRedirect("/LoginError.html");
		o.print("Your session expired...  ");
		o.print("<a href=\"http://www.localhost:8080/Vinay_Expenditure/Loginn.html\">Login again..</a>");
	}
	else
	{
		o.print("<br>");
		dis.include(req, res);
		o.print("<br>");
        month=req.getParameter("month");
		name=(String)req.getSession(true).getAttribute("name");
		IndividualMonthlyExpenseDAO indv=new IndividualMonthlyExpenseDAO();
		ArrayList<ExpdDTO> ar=indv.getIndividualMonthlyExpense((String)req.getSession().getAttribute("database"),name, month);
		
		ListIterator l=ar.listIterator();
		
		o.print("<!DOCTYPE html><html><head><title>Individual Monthly Expense</title></head><body style=\"background-color:silver\" background=\"/Vinay_Expenditure/apics/sunrise.jpg\">");
		o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vinay lover\" src=\"/Vinay_Expenditure/samu.jpg\"><center>");
		//border=\"10\" bordercolor=\"indigo\" bgcolor=\"orange\"
		o.print("<fieldset><legend>Your's Monthly Expense..</legend>");
		o.print("<table   border=\"3\" bordercolor=\"indigo\" cellpadding=\"6\" cellspacing=\"1\">");
		o.print("<tr><th>Expd_No</th><th>Name</th><th>Items</th><th>Amount</th><th>Date</th></tr>");
		
		l.hasNext();
		l.next();
		while(l.hasNext())
		{
			ExpdDTO dd=(ExpdDTO) l.next();
			o.print("<tr><td>"+dd.getExpd_No()+"</td><td>"+dd.getName()+"</td><td>"+dd.getItems()+"</td><td>"+dd.getAmount()+"</td><td>"+dd.getDate()+"</td></tr>");
		}
		o.print("</table></fieldset><br>");
		//o.print("<center><img height=\"200px\" width=\"250px\" align=\"center\" alt=\"vini\" src=\"/Vinay_Expenditure/Tamanna1.jpg\"></center>");
		
		o.print("<fieldset><legend>Summary..</legend>");
		o.print("<table border=\"10\" bordercolor=\"green\" bgcolor=\"fuchsia\"  cellpadding=\"15\" cellspacing=\"3\">");
		o.print("<tr><th>Min EXP</th><th>Max EXP</th><th>Total EXP</th><th>Avg EXP</th></tr>");
		o.print("<tr><td>"+ar.get(0).getMin()+"</td><td>"+ar.get(0).getMax()+"</td><td>"+ar.get(0).getSum()+"</td><td>"+ar.get(0).getAvg()+"</td></tr>");
		o.print("</table></fieldset><br>");
		o.print("<marquee><p>all rights reserved: <font color=\"blue\">@Vinay Thimble</font></p></marquee></body></html>");

	
	}

		
		
	}

	
}
