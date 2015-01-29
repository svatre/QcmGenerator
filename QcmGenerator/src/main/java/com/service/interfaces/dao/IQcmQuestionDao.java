package com.service.interfaces.dao;

import java.util.List;

import com.model.QcmQuestion;

public interface IQcmQuestionDao 
{
	void Create(QcmQuestion qcmQuestion);
	
	QcmQuestion GetById(String id);
	
	void Update(QcmQuestion qcmQuestion);
	
	void Delete(QcmQuestion qcmQuestion);
	
	List<QcmQuestion> GetAll();
}
