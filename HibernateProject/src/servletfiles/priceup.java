package servletfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.sessionbean;

/**
 * Servlet implementation class priceup
 */
@WebServlet("/priceup")
public class priceup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public priceup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int srno;
		double price;
		PrintWriter out=response.getWriter();
		try
		{
			srno=Integer.parseInt(request.getParameter("srno"));
			price=Double.parseDouble(request.getParameter("price"));
			sessionbean obj=new sessionbean();
			Session ses=obj.getSes();
			Query i=ses.createQuery("update Product set prices=:pr where srno=:sr ");
			i.setParameter("pr", price);
			i.setParameter("sr", srno);
			int q=i.executeUpdate();
			ses.getTransaction().commit();
			ses.close();
		    if(q>0)
		    {
		    	out.println("Price Changed");
		    }
		    else
		    {
		    	out.println("Not Changed Activity Failed");
		    }
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}
