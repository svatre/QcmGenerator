package com.service.interfaces.metier;

import java.util.List;

import com.model.EtudiantQcm;

public interface IEtudiantQcmMetier 
{
	void Create(EtudiantQcm etudiantQcm);
	
	EtudiantQcm GetById(String id);
	
	void Update(EtudiantQcm etudiantQcm);
	
	void Delete(EtudiantQcm etudiantQcm);

	List<EtudiantQcm> GetAll();
}
