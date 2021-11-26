package my_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(false); //here we dont create new session for browser, so put false...we created session in FirstServlet
		
		if(session!=null) {
			out.println("<h3>Session was created at "+session.getCreationTime()+"</h3>");
			out.println("<h3>Session ID is "+session.getId()+"</h3>");
			
			User user = (User) session.getAttribute("userDetail"); //now we can access age and email
			
			out.println("<p>print user with age and email from last form: "+user+"</p>");
			
			user.setContactNumber(123456);
			user.setCity("Frenkendorf");
			
			out.println("<p>print full user details: "+user+"</p>");
			
			
		}else {
			out.println("no session");
		}
	}

}
