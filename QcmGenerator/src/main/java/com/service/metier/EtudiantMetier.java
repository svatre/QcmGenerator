package com.service.metier;

import java.util.List;

import com.model.Etudiant;
import com.service.interfaces.dao.IEtudiantDao;
import com.service.interfaces.metier.IEtudiantMetier;

public class EtudiantMetier implements IEtudiantMetier {

	private IEtudiantDao _EtudiantDao;
	
	public IEtudiantDao get_EtudiantDao() {
		return _EtudiantDao;
	}

	public void set_EtudiantDao(IEtudiantDao _EtudiantDao) {
		this._EtudiantDao = _EtudiantDao;
	}

	@Override
	public void Create(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try {
			_EtudiantDao.Create(etudiant);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public Etudiant GetById(String id) {
		// TODO Auto-generated method stub
		Etudiant etudiant = new Etudiant();
		try {
			etudiant = _EtudiantDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiant;
	}

	@Override
	public void Update(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try {
			_EtudiantDao.Update(etudiant);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void Delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try {
			_EtudiantDao.Delete(etudiant);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Etudiant> GetAll() {
		// TODO Auto-generated method stub
		List<Etudiant> etudiants = null;
		try {
			etudiants = _EtudiantDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiants;
	}

}
