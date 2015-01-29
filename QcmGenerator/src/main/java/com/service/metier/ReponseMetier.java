package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Reponse;
import com.service.interfaces.dao.IReponseDao;
import com.service.interfaces.metier.IReponseMetier;
@Service("reponseMetier")
public class ReponseMetier implements IReponseMetier {

	private IReponseDao _ReponseDao;
	
	public IReponseDao get_ReponseDao() {
		return _ReponseDao;
	}

	public void set_ReponseDao(IReponseDao _ReponseDao) {
		this._ReponseDao = _ReponseDao;
	}

	@Override
	public void Create(Reponse reponse) {
		// TODO Auto-generated method stub
		try {
			_ReponseDao.Create(reponse);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public Reponse GetById(String id) {
		// TODO Auto-generated method stub
		Reponse rep = new Reponse();
		try {
			rep = _ReponseDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rep;
	}

	@Override
	public void Update(Reponse reponse) {
		// TODO Auto-generated method stub
		try {
			_ReponseDao.Update(reponse);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void Delete(Reponse reponse) {
		// TODO Auto-generated method stub
		try {
			_ReponseDao.Delete(reponse);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Reponse> GetAll() {
		// TODO Auto-generated method stub
		List<Reponse> reponses = null;
		try {
			reponses = _ReponseDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return reponses;
	}

}
