package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Etudiant;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IEtudiantDao;

public class EtudiantDaoImp implements IEtudiantDao {
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
	
	public void Create(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(etudiant);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Etudiant GetById(String id) {
		// TODO Auto-generated method stub
		return (Etudiant) sessionFactory.getCurrentSession().get(Etudiant.class, id);
	}

	
	public void Update(Etudiant etudiant) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(etudiant);
	}

	
	public void Delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(etudiant);
	}

	
	public List<Etudiant> GetAll() {
		List<Etudiant> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Etudiant.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
