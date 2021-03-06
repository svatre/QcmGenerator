package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Classe;
import com.service.interfaces.dao.IClasseDao;
import com.service.interfaces.metier.IClasseMetier;
@Service("classeMetier")
public class ClasseMetier implements IClasseMetier {

	private IClasseDao _ClasseDao;
	public IClasseDao get_ClasseDao() {
		return _ClasseDao;
	}

	public void set_ClasseDao(IClasseDao _ClasseDao) {
		this._ClasseDao = _ClasseDao;
	}

	
	public void Create(Classe classe) {
		// TODO Auto-generated method stub
		try {
			_ClasseDao.Create(classe);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
	public Classe GetById(String id) {
		// TODO Auto-generated method stub
		Classe classe = new Classe();
		try {
			classe=_ClasseDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return classe;
	}

	
	public void Update(Classe classe) {
		// TODO Auto-generated method stub
		try {
			_ClasseDao.Update(classe);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(Classe classe) {
		// TODO Auto-generated method stub
		try {
			_ClasseDao.Delete(classe);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<Classe> GetAll() {
		// TODO Auto-generated method stub
		List<Classe> Classes= null;
		try {
			Classes = _ClasseDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Classes;
	}

}
