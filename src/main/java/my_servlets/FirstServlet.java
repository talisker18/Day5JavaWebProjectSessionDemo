package my_servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    //here we do not use doPost() method. but the post method of form gets mapped to this service() method
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setfName(request.getParameter("firstname"));
		user.setlName("lastname");
		
		HttpSession session = request.getSession(); //this we can access from everywhere!!!
		//session will be alive as long as browser is still open
		session.setAttribute("userDetail", user); //write info to the session
		
		response.sendRedirect("second.jsp"); //just navigate to this jsp without passing any info. If we pass information, use:
		
		/**
		 * RequestDispatcher dispatcher = request.getRequestDispatcher("second.jsp");
		dispatcher.forward(request, response);
		 * 
		 * */
	}

}
