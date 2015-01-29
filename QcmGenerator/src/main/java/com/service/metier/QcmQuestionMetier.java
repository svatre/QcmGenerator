package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.QcmQuestion;
import com.service.interfaces.dao.IQcmQuestionDao;
import com.service.interfaces.metier.IQcmQuestionMetier;
@Service("qcmQuestionMetier")
public class QcmQuestionMetier implements IQcmQuestionMetier {

	private IQcmQuestionDao _QcmQuestionDao;
	
	public IQcmQuestionDao get_QcmQuestionDao() {
		return _QcmQuestionDao;
	}

	public void set_QcmQuestionDao(IQcmQuestionDao _QcmQuestionDao) {
		this._QcmQuestionDao = _QcmQuestionDao;
	}

	@Override
	public void Create(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		try {
			_QcmQuestionDao.Create(qcmQuestion);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public QcmQuestion GetById(String id) {
		// TODO Auto-generated method stub
		QcmQuestion qcmQuestion = new QcmQuestion();
		try {
			qcmQuestion = _QcmQuestionDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return qcmQuestion;
	}

	@Override
	public void Update(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		try {
			_QcmQuestionDao.Update(qcmQuestion);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void Delete(QcmQuestion qcmQuestion) {
		// TODO Auto-generated method stub
		try {
			_QcmQuestionDao.Delete(qcmQuestion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<QcmQuestion> GetAll() {
		// TODO Auto-generated method stub
		List<QcmQuestion> qcmQuestion = null;
		try {
			qcmQuestion= _QcmQuestionDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return qcmQuestion;
	}

}
