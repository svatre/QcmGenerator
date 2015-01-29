package com.service.interfaces.dao;

import java.util.List;

import com.model.Matiere;

public interface IMatiereDao 
{
	void Create(Matiere matiere);
	
	Matiere GetById(String id);
	
	void Update(Matiere matiere);
	
	void Delete(Matiere matiere);
	
	List<Matiere> GetAll();
}
