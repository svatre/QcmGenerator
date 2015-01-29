package com.service.interfaces.dao;

import java.util.List;

import com.model.Administrateur;

public interface IAdministrateurDao 
{
	void Create(Administrateur admin);
	
	Administrateur GetById(String id);
	
	List<Administrateur> GetAll();
	
	void Update(Administrateur admin);
	
	void Delete(Administrateur admin);
}
