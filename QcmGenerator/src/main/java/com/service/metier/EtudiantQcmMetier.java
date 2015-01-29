package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.EtudiantQcm;
import com.service.interfaces.dao.IEtudiantQcmDao;
@Service("etudiantQcmMetier")
public class EtudiantQcmMetier implements IEtudiantQcmDao {

	private IEtudiantQcmDao _EtudiantQcmDao;
	
	public IEtudiantQcmDao get_EtudiantQcmDao() {
		return _EtudiantQcmDao;
	}

	public void set_EtudiantQcmDao(IEtudiantQcmDao _EtudiantQcmDao) {
		this._EtudiantQcmDao = _EtudiantQcmDao;
	}

	
	public void Create(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		try {
			_EtudiantQcmDao.Create(etudiantQcm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public EtudiantQcm GetById(String id) {
		// TODO Auto-generated method stub
		EtudiantQcm etudiantQcm = new EtudiantQcm();
		try {
			etudiantQcm = _EtudiantQcmDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiantQcm;
	}

	
	public void Update(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		try {
			_EtudiantQcmDao.Update(etudiantQcm);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
	public void Delete(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		try {
			_EtudiantQcmDao.Delete(etudiantQcm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<EtudiantQcm> GetAll() {
		// TODO Auto-generated method stub
		List<EtudiantQcm> etudiantQcms =null;
		try {
			etudiantQcms=_EtudiantQcmDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiantQcms;
	}

}
