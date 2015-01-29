package com.service.interfaces.dao;

import java.util.List;

import com.model.Qcm;

public interface IQcmDao 
{
	void Create(Qcm qcm);
	
	Qcm GetById(String id);
	
	void Update(Qcm qcm);
	
	void Delete(Qcm qcm);
	
	List<Qcm> GetAll();

}
