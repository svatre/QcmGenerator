package service.interfaces.dao;

import java.util.List;

import model.Reponse;

public interface IReponseDao 
{
	void Create(Reponse reponse);
	
	Reponse GetById(String id);
	
	void Update(Reponse reponse);
	
	void Delete(Reponse reponse);
	
	List<Reponse> GetAll();
}
