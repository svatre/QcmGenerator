package com.service.interfaces.metier;

import java.util.List;

import com.model.EtudiantClasse;

public interface IEtudiantClasseMetier 
{
	void Create(EtudiantClasse etudiantClasse);
	
	EtudiantClasse GetById(String id);
	
	void Update(EtudiantClasse etudiantClasse);
	
	void Delete(EtudiantClasse etudiantClasse);

	List<EtudiantClasse> GetAll();
}
