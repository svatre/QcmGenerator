package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Classe;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IClasseDao;

public class ClasseDaoImp implements IClasseDao {

	private SessionFactory sessionFactory;	
	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	
	public void Create(Classe classe) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(classe);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Classe GetById(String id) {
		// TODO Auto-generated method stub
		return (Classe) sessionFactory.getCurrentSession().get(Classe.class, id);
	}

	
	public void Update(Classe classe) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(classe);
	}

	
	public void Delete(Classe classe) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(classe);
	}

	
	public List<Classe> GetAll() {
		// TODO Auto-generated method stub
		 List<Classe> objects = null;
	        try {
	            Query query = sessionFactory.getCurrentSession().createQuery("from " + Classe.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           CloseSession();
	        }
	        return objects;
	}

}
