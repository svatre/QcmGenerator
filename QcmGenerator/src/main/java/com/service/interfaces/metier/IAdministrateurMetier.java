package com.service.interfaces.metier;

import java.util.List;

import com.model.Administrateur;

public interface IAdministrateurMetier 
{
	void Create(Administrateur admin);
	
	Administrateur GetById(String id);
	
	void Update(Administrateur admin);
	
	void Delete(Administrateur admin);
	
	List<Administrateur> GetAll();
}
