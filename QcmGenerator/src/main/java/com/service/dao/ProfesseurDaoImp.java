package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.Professeur;
import com.service.interfaces.dao.IProfesseurDao;

public class ProfesseurDaoImp implements IProfesseurDao {

	private Session _Session;	
	
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	public void Create(Professeur prof) {
		// TODO Auto-generated method stub
		_Session.persist(prof);
	}

	
	public Professeur GetById(String id) {
		// TODO Auto-generated method stub
		return (Professeur) _Session.get(Professeur.class, id);
	}

	
	public void Update(Professeur prof) {
		// TODO Auto-generated method stub
		_Session.update(prof);
	}

	
	public void Delete(Professeur prof) {
		// TODO Auto-generated method stub
		_Session.delete(prof);
	}

	
	public List<Professeur> GetAll() {
		List<Professeur> objects = null;
        try {
            Query query = _Session.createQuery("from " + Professeur.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
