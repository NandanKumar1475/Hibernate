package save_ppproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testcfg {
	public static void main(String[] args) {
		System.out.println("Loading started....");
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		System.out.println(ses);
	}

}
