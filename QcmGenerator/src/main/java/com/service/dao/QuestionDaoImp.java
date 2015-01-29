package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.Question;
import com.service.interfaces.dao.IQuestionDao;

public class QuestionDaoImp implements IQuestionDao {

	private Session _Session;
	
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	@Override
	public void Create(Question question) {
		// TODO Auto-generated method stub
		_Session.persist(question);
	}

	@Override
	public Question GetById(String id) {
		// TODO Auto-generated method stub
		return (Question) _Session.get(Question.class, id);
	}

	@Override
	public void Update(Question question) {
		// TODO Auto-generated method stub
		_Session.update(question);
	}

	@Override
	public void Delete(Question question) {
		// TODO Auto-generated method stub
		_Session.delete(question);
	}

	@Override
	public List<Question> GetAll() {
		List<Question> objects = null;
        try {
            Query query = _Session.createQuery("from " + Question.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
