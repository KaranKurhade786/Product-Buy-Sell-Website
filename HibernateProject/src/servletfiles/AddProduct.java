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

import entity.Product;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
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
		String prodid,category;
		 String  prodnm,salesperson;
		 double price;
		 try
		 {
		 prodid=request.getParameter("prodid");
		 prodnm=request.getParameter("prodnm");
		 salesperson=request.getParameter("salesperson");
		 category=request.getParameter("category");
		 price=Double.parseDouble(request.getParameter("price"));
		 Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.addAnnotatedClass(Product.class).buildSessionFactory();
			Session ses=sf.getCurrentSession();
			ses.beginTransaction();

			Product obj=new Product();
			obj.setProdid(prodid);
			obj.setProdnm(prodnm);
			obj.setCategory(category);
			obj.setPrices(price);
			obj.setSalesperson(salesperson);
			ses.save(obj);
			ses.getTransaction().commit();
			
		 }
		 catch(Exception e)
		 {
			 out.println(e);
		 }
		 
		
	}

}
