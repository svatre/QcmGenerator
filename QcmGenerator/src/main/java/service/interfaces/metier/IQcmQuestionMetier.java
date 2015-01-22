package service.interfaces.metier;

import java.util.List;

import model.QcmQuestion;

public interface IQcmQuestionMetier 
{
	void Create(QcmQuestion qcmQuestion);
	
	QcmQuestion GetById(String id);
	
	void Update(QcmQuestion qcmQuestion);
	
	void Delete(QcmQuestion qcmQuestion);
	
	List<QcmQuestion> GetAll();
	
}
