package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Qcm;
import com.service.interfaces.dao.IQcmDao;
import com.service.interfaces.metier.IQcmMetier;
@Service("qcmMetier")
public class QcmMetier implements IQcmMetier {

	private IQcmDao _QcmDao;
	
	public IQcmDao get_QcmDao() {
		return _QcmDao;
	}

	public void set_QcmDao(IQcmDao _QcmDao) {
		this._QcmDao = _QcmDao;
	}

	@Override
	public void Create(Qcm qcm) {
		// TODO Auto-generated method stub
		try {
			_QcmDao.Create(qcm);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public Qcm GetById(String id) {
		// TODO Auto-generated method stub
		Qcm qcm = new Qcm();
		try {
			qcm = _QcmDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return qcm;
	}

	@Override
	public void Update(Qcm qcm) {
		// TODO Auto-generated method stub
		try {
			_QcmDao.Update(qcm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void Delete(Qcm qcm) {
		// TODO Auto-generated method stub
		try {
			_QcmDao.Delete(qcm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Qcm> GetAll() {
		// TODO Auto-generated method stub
		List<Qcm> qcm = null;
		try {
			qcm = _QcmDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return qcm;
	}

}
