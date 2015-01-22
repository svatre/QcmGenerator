package service.interfaces.metier;

import java.util.List;

import model.Administrateur;

public interface IAdministrateurMetier 
{
	void Create(Administrateur admin);
	
	Administrateur GetById(String id);
	
	void Update(Administrateur admin);
	
	void Delete(Administrateur admin);
	
	List<Administrateur> GetAll();
}
