package com.service.interfaces.dao;

import java.util.List;

import com.model.EtudiantClasse;

public interface IEtudiantClasseDao 
{
	void Create(EtudiantClasse etudiantClasse);
	
	EtudiantClasse GetById(String id);
	
	void Update(EtudiantClasse etudiantClasse);
	
	void Delete(EtudiantClasse etudiantClasse);
	
	List<EtudiantClasse> GetAll();

}
