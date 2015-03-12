package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.EtudiantQcm;
import com.model.HibernateUtil;
import com.model.Matiere;
import com.service.interfaces.dao.IMatiereDao;

public class MatiereDaoImp implements IMatiereDao {

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
	
	public void Create(Matiere matiere) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(matiere);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Matiere GetById(String id) {
		// TODO Auto-generated method stub
		return (Matiere) sessionFactory.getCurrentSession().get(Matiere.class, id);
	}

	
	public void Update(Matiere matiere) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(matiere);
	}

	
	public void Delete(Matiere matiere) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(matiere);
	}

	
	public List<Matiere> GetAll() {
		List<Matiere> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Matiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
