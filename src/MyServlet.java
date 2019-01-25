

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(" <form id=\"auth\" ></form>\r\n" + 
				"  <p>Input  data</p>\r\n" + 
				"  <p> Login <input name=\"login\" form=\"auth\">\r\n</p>" + 
				"  <p> Password <input type=\"password\" name=\"pass\" form=\"auth\"></p>\r\n" + 
				"  <p><input type=\"submit\" form=\"auth\" formaction=\"\" formmethod=\"POST\"></p> ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String log = request.getParameter("login");
		String pas = request.getParameter("pass");
//		System.out.println(log + " " + pas);
		response.setContentType("text/html;charset=UTF-8");
		if (log.equals("123") && pas.equals("123") )  response.getWriter().print("Hello <3"); else response.getWriter().print(" <form id=\"auth\" ></form>\r\n" + 
				"  <p>Input  data</p>\r\n" + 
				"  <p> Login <input name=\"login\" form=\"auth\">\r\n</p>" + 
				"  <p> Password <input type=\"password\" name=\"pass\" form=\"auth\"></p>\r\n" + 
				"  <p><input type=\"submit\" form=\"auth\" formaction=\"\" formmethod=\"POST\"></p> "+
				"  <p>Not correct</p>");
//		doGet(request, response);
	}
}
