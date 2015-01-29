package com.service.interfaces.dao;

import java.util.List;

import com.model.Etudiant;

public interface IEtudiantDao 
{
	void Create(Etudiant etudiant);
	
	Etudiant GetById(String id);
	
	void Update(Etudiant etudiant);
	
	void Delete(Etudiant etudiant);
	
	List<Etudiant> GetAll();
}
