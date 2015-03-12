package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.Theme;
import com.service.interfaces.dao.IThemeDao;

public class ThemeDaoImp implements IThemeDao {

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
	
	public void Create(Theme theme) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(theme);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Theme GetById(String id) {
		// TODO Auto-generated method stub
		return (Theme) sessionFactory.getCurrentSession().get(Theme.class, id);
	}

	
	public void Update(Theme theme) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(theme);
	}

	
	public void Delete(Theme theme) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(theme);
	}

	
	public List<Theme> GetAll() {
		List<Theme> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Theme.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
