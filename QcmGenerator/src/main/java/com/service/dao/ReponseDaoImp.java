package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.Reponse;
import com.service.interfaces.dao.IReponseDao;

public class ReponseDaoImp implements IReponseDao {

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
	
	public void Create(Reponse reponse) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(reponse);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Reponse GetById(String id) {
		// TODO Auto-generated method stub
		return (Reponse) sessionFactory.getCurrentSession().get(Reponse.class, id);
	}

	
	public void Update(Reponse reponse) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(reponse);
	}

	
	public void Delete(Reponse reponse) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(reponse);
	}

	
	public List<Reponse> GetAll() {
		List<Reponse> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Reponse.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
