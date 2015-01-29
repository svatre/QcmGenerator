package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.ProfesseurMatiere;
import com.service.interfaces.dao.IProfesseurMatiereDao;

public class ProfesseurMatiereDaoImp implements IProfesseurMatiereDao {

	private Session _Session;
		
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	public void Create(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.persist(profMatiere);
	}

	
	public ProfesseurMatiere GetById(String id) {
		// TODO Auto-generated method stub
		return (ProfesseurMatiere) _Session.get(ProfesseurMatiere.class, id);
	}

	
	public void Update(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.update(profMatiere);
	}

	
	public void Delete(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.delete(profMatiere);
	}

	
	public List<ProfesseurMatiere> GetAll() {
		List<ProfesseurMatiere> objects = null;
        try {
            Query query = _Session.createQuery("from " + ProfesseurMatiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
