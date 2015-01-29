package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.Utilisateur;
import com.service.interfaces.dao.IUtilisateurDao;

public class UtilisateurDaoImp implements IUtilisateurDao {

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
	public void Create(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		_Session.persist(utilisateur);
	}

	@Override
	public Utilisateur GetById(String id) {
		// TODO Auto-generated method stub
		return (Utilisateur) _Session.get(Utilisateur.class, id);
	}

	@Override
	public void Update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		_Session.update(utilisateur);
	}

	@Override
	public void Delete(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		_Session.delete(utilisateur);
	}

	@Override
	public List<Utilisateur> GetAll() {
		List<Utilisateur> objects = null;
        try {
            Query query = _Session.createQuery("from " + Utilisateur.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
