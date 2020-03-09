import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CartDetails extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		
		out.println("<html><style>body{background:#ddd6f3;} </style><body><center><h1>CART DETAILS</h1>");
		out.println("<form action=Logout method=post><input type=submit value=LOGOUT style=float:right;background-color:black;color:white;padding:10px 20px></form>");
		out.println("<form method=post action=payment.html>");
		String img1=req.getParameter("img1");
		String img2=req.getParameter("img2");
		String img3=req.getParameter("img3");
		
		int t1=0,t2=0,t3=0;

		 //int i=Integer.parseInt(s);//out.println(quantity[0]);
		//out.println(quantity[1]);
		//out.println(quantity[2]);
         if(img1!=null){
         	 t1=1000*Integer.parseInt(req.getParameter("quan1"));

		     out.println(img1+" "+t1+"</br>");
		}
		if(img2!=null){
			 t2=1500*Integer.parseInt(req.getParameter("quan2"));
		out.println(img2+" "+t2+"</br>");
		}
		if(img3!=null){
		   t3=2000*Integer.parseInt(req.getParameter("quan3"));
		 out.println(img3+" "+t3+"</br>");
		}
		
		/*else
		{
		  out.println("<h3>NO PRODUCTS SELECTED</h3>");
		}*/
		//
		int total=t1+t2+t3;
		out.println("The total price is:"+total+"<br>");
		
		out.println("<input type=submit value=pay style=background-color:#021b79;color:white;padding:10px;></form><br>");
		out.println("<a href=image.html><input type=submit value=Back style=background-color:#021b79;color:white;padding:10px>");
		out.println("</center></body></html>");
	}
	
}




	


	