package com.model;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@SuppressWarnings("deprecation")
public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
			try {				
				// Crée la SessionFactory
				String filePath = new File("hibernate.cfg.xml").getAbsolutePath();
				File file = new File(filePath);	
				sessionFactory =new Configuration().configure(file).buildSessionFactory();
				} 
	catch (HibernateException ex) {
		throw new RuntimeException("Problème de configuration : "+ ex.getMessage(), ex);
	}
}
	@SuppressWarnings("rawtypes")
	public static final ThreadLocal session = new ThreadLocal();
	@SuppressWarnings("unchecked")
	public static Session currentSession() throws HibernateException {
		Session s = (Session) session.get();
		// Ouvre une nouvelle Session, si ce Thread n'en a aucune
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	
	public static Session currentSession(SessionFactory sessionFactory) throws HibernateException {
		Session s = (Session) session.get();
		// Ouvre une nouvelle Session, si ce Thread n'en a aucune
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	@SuppressWarnings("unchecked")
	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		session.set(null);
		if (s != null)
			s.close();
	}
}

