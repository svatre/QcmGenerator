package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ProfesseurMatiere;
import com.service.interfaces.dao.IProfesseurMatiereDao;
import com.service.interfaces.metier.IProfesseurMatiereMetier;
@Service("professeurMatiereMetier")
public class ProfesseurMatiereMetier implements IProfesseurMatiereMetier {

	private IProfesseurMatiereDao _ProfesseurMatiereDao;
	
	public IProfesseurMatiereDao get_ProfesseurMatiereDao() {
		return _ProfesseurMatiereDao;
	}

	public void set_ProfesseurMatiereDao(IProfesseurMatiereDao _ProfesseurMatiereDao) {
		this._ProfesseurMatiereDao = _ProfesseurMatiereDao;
	}

	
	public void Create(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurMatiereDao.Create(profMatiere);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public ProfesseurMatiere GetById(String id) {
		// TODO Auto-generated method stub
		ProfesseurMatiere profMatiere = new ProfesseurMatiere();
		try {
			profMatiere= _ProfesseurMatiereDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return profMatiere;
	}

	
	public void Update(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurMatiereDao.Update(profMatiere);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
	public void Delete(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurMatiereDao.Delete(profMatiere);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<ProfesseurMatiere> GetAll() {
		// TODO Auto-generated method stub
		List<ProfesseurMatiere> profMatieres = null;
		try {
			profMatieres = _ProfesseurMatiereDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return profMatieres;
	}

}
