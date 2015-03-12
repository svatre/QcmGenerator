package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Administrateur;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IAdministrateurDao;

public class AdministrateurDaoImp implements IAdministrateurDao {

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

	
	public void Create(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			Session s = HibernateUtil.currentSession(sessionFactory);
			s.save(admin);
			s.beginTransaction().commit();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	
	public Administrateur GetById(String id) {
		// TODO Auto-generated method stub
		Administrateur admin = null;
		try {
			admin = (Administrateur) sessionFactory.getCurrentSession().get(Administrateur.class, id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		return admin;
				
	}

	
	public void Update(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	
	public void Delete(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	
	public List<Administrateur> GetAll() {
		 List<Administrateur> objects = null;
	        try {
	            Query query = sessionFactory.getCurrentSession().createQuery("from " + Administrateur.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           
	        }
	        return objects;
	}

}
