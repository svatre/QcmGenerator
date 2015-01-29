package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Classe;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IClasseDao;

public class ClasseDaoImp implements IClasseDao {

	private Session _Session;
	
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	
	public void Create(Classe classe) {
		// TODO Auto-generated method stub
		_Session.persist(classe);
	}

	
	public Classe GetById(String id) {
		// TODO Auto-generated method stub
		return (Classe) _Session.get(Classe.class, id);
	}

	
	public void Update(Classe classe) {
		// TODO Auto-generated method stub
		_Session.update(classe);
	}

	
	public void Delete(Classe classe) {
		// TODO Auto-generated method stub
		_Session.delete(classe);
	}

	
	public List<Classe> GetAll() {
		// TODO Auto-generated method stub
		 List<Classe> objects = null;
	        try {
	            Query query = _Session.createQuery("from " + Classe.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           CloseSession();
	        }
	        return objects;
	}

}
