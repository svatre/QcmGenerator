package com.service.interfaces.metier;

import java.util.List;

import com.model.Qcm;

public interface IQcmMetier 
{
	void Create(Qcm qcm);
	
	Qcm GetById(String id);
	
	void Update(Qcm qcm);
	
	void Delete(Qcm qcm);

	List<Qcm> GetAll();
}
