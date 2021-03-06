package com.service.interfaces.metier;

import java.util.List;

import com.model.Etudiant;

public interface IEtudiantMetier
{
	void Create(Etudiant etudiant);
	
	Etudiant GetById(String id);
	
	void Update(Etudiant etudiant);
	
	void Delete(Etudiant etudiant);

	List<Etudiant> GetAll();
}
