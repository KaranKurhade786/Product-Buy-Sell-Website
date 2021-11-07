package servletfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import entity.Buyer;


/**
 * Servlet implementation class AddProduct1
 */
@WebServlet("/AddProduct1")
public class AddProduct1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int age,cdno;
		double amt;
		String  name,address;
		try
		{
		   age=Integer.parseInt(request.getParameter("age"));
		   cdno=Integer.parseInt(request.getParameter("cdno"));
		   amt=Double.parseDouble(request.getParameter("amt"));
		   name=request.getParameter("name");
		   address=request.getParameter("address");
		  Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Buyer.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		   Buyer obj=new Buyer();
		   obj.setAddress(address);
		   obj.setAge(age);
		   obj.setAmt(amt);
		   obj.setCdno(cdno);
		   obj.setName(name);
		 
		   ses.save(obj);
		  ses.getTransaction().commit(); 
		  response.sendRedirect("paysuccess.jsp");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
