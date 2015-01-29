package com.service.interfaces.dao;

import java.util.List;

import com.model.EtudiantQcm;

public interface IEtudiantQcmDao 
{
	void Create(EtudiantQcm etudiantQcm);
	
	EtudiantQcm GetById(String id);
	
	void Update(EtudiantQcm etudiantQcm);
	
	void Delete(EtudiantQcm etudiantQcm);

	List<EtudiantQcm> GetAll();
}
