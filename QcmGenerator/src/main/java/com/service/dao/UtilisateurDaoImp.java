package com.service.dao;

import java.io.Console;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.model.HibernateUtil;
import com.model.Utilisateur;
import com.service.interfaces.dao.IUtilisateurDao;

public class UtilisateurDaoImp implements IUtilisateurDao {

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
	
	
	public void Create(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try
		{		
			Session s = HibernateUtil.currentSession(sessionFactory);
			s.save(utilisateur);
			s.beginTransaction().commit();
			s.close();
			//sessionFactory.getCurrentSession().persist(utilisateur);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	
	public Utilisateur GetById(String id) {
		// TODO Auto-generated method stub
		return (Utilisateur) sessionFactory.getCurrentSession().get(Utilisateur.class, id);
	}

	
	public void Update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(utilisateur);
	}

	
	public void Delete(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(utilisateur);
	}

	
	public List<Utilisateur> GetAll() {
		List<Utilisateur> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Utilisateur.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
