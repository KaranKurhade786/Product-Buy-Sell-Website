package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Product;

public class sessionbean {
	public Session getSes()
	{
		    Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.addAnnotatedClass(Product.class).buildSessionFactory();
			Session ses=sf.getCurrentSession();
			ses.beginTransaction();
		    return ses;
	}

}
