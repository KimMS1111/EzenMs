package prt01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EXServlet")
public class EXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int add = num1 + num2;
		
		PrintWriter out = response.getWriter();
		out.print("이름 = " + name+"<br>");
		out.print("A = " + num1+"<br>");
		out.print("B = " + num2+"<br>");
		out.print(num1+" + "+num2+" = "+add+"<br>");
		out.print(num1+" * "+num2+" = "+ (num1*num2) +"<br>");
		out.print(num1+" - "+num2+" = "+ (num1-num2) +"<br>");
		out.print(num1+" / "+num2+" = "+ (num1/num2));
		
		
	}

}
