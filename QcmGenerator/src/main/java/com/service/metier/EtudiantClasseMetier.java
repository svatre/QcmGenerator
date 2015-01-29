package com.service.metier;

import java.util.List;

import com.model.EtudiantClasse;
import com.service.interfaces.dao.IEtudiantClasseDao;
import com.service.interfaces.metier.IEtudiantClasseMetier;

public class EtudiantClasseMetier implements IEtudiantClasseMetier {

	private IEtudiantClasseDao _EtudiantClasseDao;
	public IEtudiantClasseDao get_EtudiantClasseDao() {
		return _EtudiantClasseDao;
	}

	public void set_EtudiantClasseDao(IEtudiantClasseDao _EtudiantClasseDao) {
		this._EtudiantClasseDao = _EtudiantClasseDao;
	}

	
	public void Create(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		try {
			_EtudiantClasseDao.Create(etudiantClasse);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public EtudiantClasse GetById(String id) {
		// TODO Auto-generated method stub
		EtudiantClasse etudiantClasse = new EtudiantClasse();
		
		try {
			etudiantClasse = _EtudiantClasseDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiantClasse;
	}

	
	public void Update(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		try {
			_EtudiantClasseDao.Update(etudiantClasse);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		_EtudiantClasseDao.Delete(etudiantClasse);
	}

	
	public List<EtudiantClasse> GetAll() {
		List<EtudiantClasse> etudiantClasse = null;
		try {
			etudiantClasse=_EtudiantClasseDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return etudiantClasse;
	}

}
