package jpa_project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Delete_Record {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.beginTransaction();
		User user = ses.get(User.class, 1);
		if(user!=null) {
			ses.delete(user);
			tran.commit();
			System.out.println("Record deleted");
			
		}
	}

}
