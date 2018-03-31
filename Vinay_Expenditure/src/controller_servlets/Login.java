package controller_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		out.print(
				"<html><head><title>Login</title></head><body>	<form action=\"./login\" method=\"post\">		<br><br><br><fieldset title=\"Login\"><legend><B>Login to Vinay_Expenditure ...</B> </legend><BR>Enter your name : <input type=\"text\" name=\"name\" required=\"required\"/><BR><BR>Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type=\"password\" name=\"pass\" required=\"required\"/><BR><BR><input type=\"submit\" value=\"Sign In\" /></fieldset></form><a href=\"Register.html\"> click here</a> if you don't have account</body></html>");

	}

}
