package service.interfaces.dao;

import java.util.List;

import model.Question;

public interface IQuestionDao 
{
	void Create(Question question);
	
	Question GetById(String id);
	
	void Update(Question question);
	
	void Delete(Question question);
	
	List<Question> GetAll();
}
