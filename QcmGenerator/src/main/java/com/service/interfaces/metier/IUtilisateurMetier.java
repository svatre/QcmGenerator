package com.service.interfaces.metier;

import java.util.List;

import com.model.Utilisateur;

public interface IUtilisateurMetier 
{
	void Create(Utilisateur utilisateur);
	
	Utilisateur GetById(String id);
	
	void Update(Utilisateur utilisateur);
	
	void Delete(Utilisateur utilisateur);
	
	List<Utilisateur> GetAll();
}
