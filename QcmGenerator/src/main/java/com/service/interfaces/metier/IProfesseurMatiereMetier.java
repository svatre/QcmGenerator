package com.service.interfaces.metier;

import java.util.List;

import com.model.ProfesseurMatiere;

public interface IProfesseurMatiereMetier 
{
	void Create(ProfesseurMatiere profMatiere);
	
	ProfesseurMatiere GetById(String id);
	
	void Update(ProfesseurMatiere profMatiere);
	
	void Delete(ProfesseurMatiere profMatiere);
	
	List<ProfesseurMatiere> GetAll();
}
