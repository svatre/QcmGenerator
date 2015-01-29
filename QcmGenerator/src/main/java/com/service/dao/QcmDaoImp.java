package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.Qcm;
import com.service.interfaces.dao.IQcmDao;

public class QcmDaoImp implements IQcmDao {
	
	private Session _Session;
		
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	public void Create(Qcm qcm) {
		// TODO Auto-generated method stub
		_Session.persist(qcm);
	}

	
	public Qcm GetById(String id) {
		// TODO Auto-generated method stub
		return (Qcm) _Session.get(Qcm.class, id);
	}

	
	public void Update(Qcm qcm) {
		// TODO Auto-generated method stub
		_Session.update(qcm);
	}

	
	public void Delete(Qcm qcm) {
		// TODO Auto-generated method stub

	}

	
	public List<Qcm> GetAll() {
		List<Qcm> objects = null;
        try {
            Query query = _Session.createQuery("from " + Qcm.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;
	}

}
