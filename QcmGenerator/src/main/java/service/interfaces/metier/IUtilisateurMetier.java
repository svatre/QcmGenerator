package service.interfaces.metier;

import java.util.List;

import model.Utilisateur;

public interface IUtilisateurMetier 
{
	void Create(Utilisateur utilisateur);
	
	Utilisateur GetById(String id);
	
	void Update(Utilisateur utilisateur);
	
	void Delete(Utilisateur utilisateur);
	
	List<Utilisateur> GetAll();
}
