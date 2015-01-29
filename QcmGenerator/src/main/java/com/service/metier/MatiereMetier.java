package com.service.metier;

import java.util.List;

import com.model.Matiere;
import com.service.interfaces.dao.IMatiereDao;
import com.service.interfaces.metier.IMatiereMetier;

public class MatiereMetier implements IMatiereMetier {

	private IMatiereDao _MatiereDao;
	
	public IMatiereDao get_MatiereDao() {
		return _MatiereDao;
	}

	public void set_MatiereDao(IMatiereDao _MatiereDao) {
		this._MatiereDao = _MatiereDao;
	}

	
	public void Create(Matiere matiere) {
		// TODO Auto-generated method stub
		try {
			_MatiereDao.Create(matiere);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public Matiere GetById(String id) {
		// TODO Auto-generated method stub
		Matiere matiere = new Matiere();
		try {
			matiere = _MatiereDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return matiere;
	}

	
	public void Update(Matiere matiere) {
		// TODO Auto-generated method stub
		try {
			_MatiereDao.Update(matiere);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(Matiere matiere) {
		// TODO Auto-generated method stub
		try {
			_MatiereDao.Delete(matiere);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<Matiere> GetAll() {
		// TODO Auto-generated method stub
		List<Matiere> matieres = null;
		try {
			matieres = _MatiereDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return matieres;
	}

}
