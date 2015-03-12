package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.HibernateUtil;
import com.model.Question;
import com.service.interfaces.dao.IQuestionDao;

public class QuestionDaoImp implements IQuestionDao {

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
	
	public void Create(Question question) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.currentSession(sessionFactory);
		s.save(question);
		s.beginTransaction().commit();
		s.close();
	}

	
	public Question GetById(String id) {
		// TODO Auto-generated method stub
		return (Question) sessionFactory.getCurrentSession().get(Question.class, id);
	}

	
	public void Update(Question question) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(question);
	}

	
	public void Delete(Question question) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(question);
	}

	
	public List<Question> GetAll() {
		List<Question> objects = null;
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from " + Question.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
