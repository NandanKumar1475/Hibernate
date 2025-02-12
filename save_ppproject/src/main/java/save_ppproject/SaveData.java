package save_ppproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
	    Transaction tran = ses.getTransaction();
	    tran.begin();
	    Employee e = new Employee();
	    e.setName("candan");
	    e.setClgname("chandigarh"); 
	    e.setDept("cse");
	    int id = (Integer) ses.save(e);
	    tran.commit();
	    System.out.println("record is save with"+id);
	}

}
