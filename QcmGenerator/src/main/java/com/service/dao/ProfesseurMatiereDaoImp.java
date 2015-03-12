package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.ProfesseurMatiere;
import com.service.interfaces.dao.IProfesseurMatiereDao;

public class ProfesseurMatiereDaoImp implements IProfesseurMatiereDao {

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
	
	public void Create(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(profMatiere);
		s.beginTransaction().commit();
		s.close();
	}

	
	public ProfesseurMatiere GetById(String id) {
		// TODO Auto-generated method stub
		return (ProfesseurMatiere) sessionFactory.getCurrentSession().get(ProfesseurMatiere.class, id);
	}

	
	public void Update(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(profMatiere);
	}

	
	public void Delete(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(profMatiere);
	}

	
	public List<ProfesseurMatiere> GetAll() {
		List<ProfesseurMatiere> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + ProfesseurMatiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
