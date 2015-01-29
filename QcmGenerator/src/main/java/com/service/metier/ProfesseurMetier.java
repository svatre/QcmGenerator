package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Professeur;
import com.service.interfaces.dao.IProfesseurDao;
import com.service.interfaces.metier.IProfesseurMetier;
@Service("professeurMetier")
public class ProfesseurMetier implements IProfesseurMetier {

	private IProfesseurDao _ProfesseurDao;
	
	public IProfesseurDao get_ProfesseurDao() {
		return _ProfesseurDao;
	}

	public void set_ProfesseurDao(IProfesseurDao _ProfesseurDao) {
		this._ProfesseurDao = _ProfesseurDao;
	}

	
	public void Create(Professeur prof) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurDao.Create(prof);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
	public Professeur GetById(String id) {
		// TODO Auto-generated method stub
		Professeur prof = new Professeur();
		try {
			prof = _ProfesseurDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return prof;
	}

	
	public void Update(Professeur prof) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurDao.Update(prof);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(Professeur prof) {
		// TODO Auto-generated method stub
		try {
			_ProfesseurDao.Delete(prof);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
	public List<Professeur> GetAll() {
		// TODO Auto-generated method stub
		List<Professeur> profs = null;
		try {
			profs = _ProfesseurDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return profs;
	}

}
