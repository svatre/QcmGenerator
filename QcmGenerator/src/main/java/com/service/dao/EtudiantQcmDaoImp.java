package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.EtudiantQcm;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IEtudiantQcmDao;

public class EtudiantQcmDaoImp implements IEtudiantQcmDao {

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
	
	public void Create(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(etudiantQcm);
		s.beginTransaction().commit();
		s.close();
	}

	
	public EtudiantQcm GetById(String id) {
		// TODO Auto-generated method stub
		return (EtudiantQcm) sessionFactory.getCurrentSession().get(EtudiantQcm.class, id);
	}

	
	public void Update(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(etudiantQcm);
	}

	
	public void Delete(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(etudiantQcm);
	}

	
	public List<EtudiantQcm> GetAll() {
		List<EtudiantQcm> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + EtudiantQcm.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
