package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.Qcm;
import com.service.interfaces.dao.IQcmDao;

public class QcmDaoImp implements IQcmDao {
	
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
	
	public void Create(Qcm qcm) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(qcm);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Qcm GetById(String id) {
		// TODO Auto-generated method stub
		return (Qcm) sessionFactory.getCurrentSession().get(Qcm.class, id);
	}

	
	public void Update(Qcm qcm) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(qcm);
	}

	
	public void Delete(Qcm qcm) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(qcm);
	}

	
	public List<Qcm> GetAll() {
		List<Qcm> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Qcm.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;
	}

}
