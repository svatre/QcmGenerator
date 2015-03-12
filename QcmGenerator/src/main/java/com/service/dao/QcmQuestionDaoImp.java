package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.QcmQuestion;
import com.service.interfaces.dao.IQcmQuestionDao;

public class QcmQuestionDaoImp implements IQcmQuestionDao {

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
	
	
	public void Create(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(qcmQuestion);
		s.beginTransaction().commit();
		s.close();
	}

	
	public QcmQuestion GetById(String id) {
		// TODO Auto-generated method stub
		return (QcmQuestion)sessionFactory.getCurrentSession().get(QcmQuestion.class, id);
	}

	
	public void Update(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(qcmQuestion);
	}

	
	public void Delete(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(qcmQuestion);
	}

	
	public List<QcmQuestion> GetAll() {
		List<QcmQuestion> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + QcmQuestion.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
