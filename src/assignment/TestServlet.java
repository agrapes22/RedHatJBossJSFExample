package assignment;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	String firstName = "Adriel";
	String lastName = "Grapes";
    
    public TestServlet() 
    {
        super();
    }

    @Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("In init()");
	}

    @Override
	public void destroy() 
	{
    	System.out.println("In Destroy()");
	}

	//using default per instructions
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//request.getRequestDispatcher("TestForm.jsp").forward(request, response);
		
		//request.setAttribute("firstname", firstName);
		//request.setAttribute("lastname", lastName);
		
		String first = request.getParameter("firstname");
		String last = request.getParameter("lastname");
		
		//request.getRequestDispatcher("TestForm.jsp").forward(request, response);
		
		//request.setAttribute("firstname", firstName);
		//request.setAttribute("lastname", lastName);
		
		System.out.println("In doGet()");
		response.getWriter().append(first + " " + last);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setAttribute("firstname", "Adriel");
		request.setAttribute("lastname", "Grapes");
		doGet(request, response);
	}

}
