package com.service.interfaces.metier;

import java.util.List;

import com.model.Professeur;

public interface IProfesseurMetier
{
	void Create(Professeur prof);
	
	Professeur GetById(String id);
	
	void Update(Professeur prof);
	
	void Delete(Professeur prof);
	
	List<Professeur> GetAll();
}
