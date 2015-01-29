package com.service.interfaces.metier;

import java.util.List;

import com.model.Classe;

public interface IClasseMetier 
{
	void Create(Classe classe);
	
	Classe GetById(String id);
	
	void Update(Classe classe);
	
	void Delete(Classe classe);
	
	List<Classe> GetAll();
}
