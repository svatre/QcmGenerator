package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.Professeur;
import com.service.interfaces.dao.IProfesseurDao;

public class ProfesseurDaoImp implements IProfesseurDao {

	private SessionFactory sessionFactory;	
	
	@SuppressWarnings("unused")
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
	
	public void Create(Professeur prof) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(prof);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Professeur GetById(String id) {
		// TODO Auto-generated method stub
		return (Professeur) sessionFactory.getCurrentSession().get(Professeur.class, id);
	}

	
	public void Update(Professeur prof) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(prof);
	}

	
	public void Delete(Professeur prof) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(prof);
	}

	
	public List<Professeur> GetAll() {
		List<Professeur> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Professeur.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
