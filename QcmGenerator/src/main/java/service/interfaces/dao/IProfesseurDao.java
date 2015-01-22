package service.interfaces.dao;

import java.util.List;

import model.Professeur;

public interface IProfesseurDao 
{
	void Create(Professeur prof);
	
	Professeur GetById(String id);
	
	void Update(Professeur prof);
	
	void Delete(Professeur prof);
	
	List<Professeur> GetAll();
}
