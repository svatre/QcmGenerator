package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Administrateur;
import com.model.HibernateUtil;
import com.service.interfaces.dao.IAdministrateurDao;

public class AdministrateurDaoImp implements IAdministrateurDao {

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
	public void Create(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			_Session.persist(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	@Override
	public Administrateur GetById(String id) {
		// TODO Auto-generated method stub
		Administrateur admin = null;
		try {
			admin = (Administrateur) _Session.get(Administrateur.class, id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		return admin;
				
	}

	@Override
	public void Update(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			_Session.update(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	@Override
	public void Delete(Administrateur admin) {
		// TODO Auto-generated method stub
		try {
			_Session.delete(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			
		}
		
	}

	@Override
	public List<Administrateur> GetAll() {
		 List<Administrateur> objects = null;
	        try {
	            Query query = _Session.createQuery("from " + Administrateur.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           
	        }
	        return objects;
	}

}
