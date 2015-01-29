package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.EtudiantQcm;
import com.model.HibernateUtil;
import com.model.Matiere;
import com.service.interfaces.dao.IMatiereDao;

public class MatiereDaoImp implements IMatiereDao {

	private Session _Session;
	
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	public void Create(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.persist(matiere);
	}

	
	public Matiere GetById(String id) {
		// TODO Auto-generated method stub
		return (Matiere) _Session.get(Matiere.class, id);
	}

	
	public void Update(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.update(matiere);
	}

	
	public void Delete(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.delete(matiere);
	}

	
	public List<Matiere> GetAll() {
		List<Matiere> objects = null;
        try {
            Query query = _Session.createQuery("from " + Matiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
