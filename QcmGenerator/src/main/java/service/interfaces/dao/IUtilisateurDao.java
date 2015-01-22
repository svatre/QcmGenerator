package service.interfaces.dao;

import java.util.List;

import model.Utilisateur;

public interface IUtilisateurDao 
{
	void Create(Utilisateur utilisateur);
	
	Utilisateur GetById(String id);
	
	void Update(Utilisateur utilisateur);
	
	void Delete(Utilisateur utilisateur);
	
	List<Utilisateur> GetAll();
}
