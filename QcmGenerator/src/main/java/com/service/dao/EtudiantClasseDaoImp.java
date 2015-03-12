package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.EtudiantClasse;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IEtudiantClasseDao;

public class EtudiantClasseDaoImp implements IEtudiantClasseDao {
	
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
	
	
	public void Create(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(etudiantClasse);
		s.beginTransaction().commit();
		s.close();
	}

	
	public EtudiantClasse GetById(String id) {
		// TODO Auto-generated method stub
		return (EtudiantClasse) sessionFactory.getCurrentSession().get(EtudiantClasse.class, id);
	}

	
	public void Update(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(etudiantClasse);

	}

	
	public void Delete(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(etudiantClasse);
	}

	
	public List<EtudiantClasse> GetAll() {
		 List<EtudiantClasse> objects = null;
	        try {
	            Query query = sessionFactory.getCurrentSession().createQuery("from " + EtudiantClasse.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           
	        }
	        return objects;
	}

}
