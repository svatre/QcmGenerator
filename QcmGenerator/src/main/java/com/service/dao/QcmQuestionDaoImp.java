package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.QcmQuestion;
import com.service.interfaces.dao.IQcmQuestionDao;

public class QcmQuestionDaoImp implements IQcmQuestionDao {

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
	public void Create(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		_Session.persist(qcmQuestion);
	}

	@Override
	public QcmQuestion GetById(String id) {
		// TODO Auto-generated method stub
		return (QcmQuestion) _Session.get(QcmQuestion.class, id);
	}

	@Override
	public void Update(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		_Session.update(qcmQuestion);
	}

	@Override
	public void Delete(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		_Session.delete(qcmQuestion);
	}

	@Override
	public List<QcmQuestion> GetAll() {
		List<QcmQuestion> objects = null;
        try {
            Query query = _Session.createQuery("from " + QcmQuestion.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
