package service.interfaces.metier;

import java.util.List;

import model.Reponse;

public interface IReponseMetier
{
	void Create(Reponse reponse);
	
	Reponse GetById(String id);
	
	void Update(Reponse reponse);
	
	void Delete(Reponse reponse);
	
	List<Reponse> GetAll();
}
