package save_ppproject;

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
		Employee emp = ses.get(Employee.class, 1);
		if(emp!=null) {
			ses.delete(emp);
			tran.commit();
			System.out.println("Record deleted");
			
		}
				
	}

}
