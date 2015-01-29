package com.service.metier;

import java.util.List;

import com.model.Administrateur;
import com.service.interfaces.dao.IAdministrateurDao;
import com.service.interfaces.metier.IAdministrateurMetier;

public class AdministrateurMetier implements IAdministrateurMetier {

	private IAdministrateurDao _AdministrateurDao;
	
	public IAdministrateurDao get_AdministrateurDao() {
		return _AdministrateurDao;
	}

	public void set_AdministrateurDao(IAdministrateurDao _AdministrateurDao) {
		this._AdministrateurDao = _AdministrateurDao;
	}

	@Override
	public void Create(Administrateur admin) {
		// TODO Auto-generated method stub
		try 
		{
			_AdministrateurDao.Create(admin);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Administrateur GetById(String id) {
		Administrateur admin = new Administrateur();
		// TODO Auto-generated method stub
		try 
		{
			admin = _AdministrateurDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admin;
	}

	@Override
	public void Update(Administrateur admin) {
		// TODO Auto-generated method stub
		try 
		{
			_AdministrateurDao.Update(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void Delete(Administrateur admin) {
		// TODO Auto-generated method stub
		try 
		{
			_AdministrateurDao.Delete(admin);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Administrateur> GetAll() {
		// TODO Auto-generated method stub
		List<Administrateur> admins = null;
		try 
		{
			admins = _AdministrateurDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admins;
	}

}
