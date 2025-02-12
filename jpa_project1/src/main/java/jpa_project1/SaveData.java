package jpa_project1;

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
		Transaction trans = ses.beginTransaction();
		User user = new User();
		user.setName("nandan");
		user.setEmail("nandankumar1475@gmail.com");
		user.setPassword("nandan");
		int id = (Integer)ses.save(user);
		trans.commit();
		System.out.println("Record save succesfully"+id);
		
	}

}
