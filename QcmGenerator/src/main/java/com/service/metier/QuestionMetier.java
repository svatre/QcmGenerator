package com.service.metier;

import java.util.List;

import com.model.Question;
import com.service.interfaces.dao.IQuestionDao;
import com.service.interfaces.metier.IQuestionMetier;

public class QuestionMetier implements IQuestionMetier {

	private IQuestionDao _QuestionDao;
	
	public IQuestionDao get_QuestionDao() {
		return _QuestionDao;
	}

	public void set_QuestionDao(IQuestionDao _QuestionDao) {
		this._QuestionDao = _QuestionDao;
	}

	
	public void Create(Question question) {
		// TODO Auto-generated method stub
		try {
			_QuestionDao.Create(question);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public Question GetById(String id) {
		// TODO Auto-generated method stub
		Question question = new Question();
		try {
			question = _QuestionDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return question;
	}

	
	public void Update(Question question) {
		// TODO Auto-generated method stub
		try {
			_QuestionDao.Update(question);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(Question question) {
		// TODO Auto-generated method stub
		try {
			_QuestionDao.Delete(question);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<Question> GetAll() {
		// TODO Auto-generated method stub
		List<Question> questions = null;
		try {
			questions = _QuestionDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return questions;
	}

}
