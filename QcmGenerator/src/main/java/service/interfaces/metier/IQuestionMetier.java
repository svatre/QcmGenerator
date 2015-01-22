package service.interfaces.metier;

import java.util.List;

import model.Question;

public interface IQuestionMetier 
{
	void Create(Question question);
	
	Question GetById(String id);
	
	void Update(Question question);
	
	void Delete(Question question);
	
	List<Question> GetAll();
}
