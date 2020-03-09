import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession(false);
			String wid=req.getParameter("walletid");
			String password=req.getParameter("pass");
			if(wid.equals("payment") && password.equals("12345")){
				RequestDispatcher rd=req.getRequestDispatcher("Receipt");
				rd.forward(req, res);
			}
		else
		{ 
			out.println("you have entered a wrong walletid or password");
			RequestDispatcher rd=req.getRequestDispatcher("image.html");
			rd.include(req, res);
		}
	}
}