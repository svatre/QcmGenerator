package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Etudiant;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IEtudiantDao;

public class EtudiantDaoImp implements IEtudiantDao {
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
	public void Create(Etudiant etudiant) {
		// TODO Auto-generated method stub
		_Session.persist(etudiant);
	}

	@Override
	public Etudiant GetById(String id) {
		// TODO Auto-generated method stub
		return (Etudiant) _Session.get(Etudiant.class, id);
	}

	@Override
	public void Update(Etudiant etudiant) {
		// TODO Auto-generated method stub
		_Session.update(etudiant);
	}

	@Override
	public void Delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		_Session.delete(etudiant);
	}

	@Override
	public List<Etudiant> GetAll() {
		List<Etudiant> objects = null;
        try {
            Query query = _Session.createQuery("from " + Etudiant.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
