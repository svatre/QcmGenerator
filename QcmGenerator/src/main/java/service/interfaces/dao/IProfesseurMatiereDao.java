package service.interfaces.dao;

import java.util.List;

import model.ProfesseurMatiere;

public interface IProfesseurMatiereDao 
{
	void Create(ProfesseurMatiere profMatiere);
	
	ProfesseurMatiere GetById(String id);
	
	void Update(ProfesseurMatiere profMatiere);
	
	void Delete(ProfesseurMatiere profMatiere);
	
	List<ProfesseurMatiere> GetAll();
}
