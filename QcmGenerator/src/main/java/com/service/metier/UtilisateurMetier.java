package com.service.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Utilisateur;
import com.service.interfaces.dao.IUtilisateurDao;
import com.service.interfaces.metier.IUtilisateurMetier;

@Service("utilisateurMetier")
public class UtilisateurMetier implements IUtilisateurMetier {

	private IUtilisateurDao _UtilisateurDao;
	
	public IUtilisateurDao get_UtilisateurDao() {
		return _UtilisateurDao;
	}

	public void set_UtilisateurDao(IUtilisateurDao _UtilisateurDao) {
		this._UtilisateurDao = _UtilisateurDao;
	}

	@Override
	public void Create(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try {
			_UtilisateurDao.Create(utilisateur);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public Utilisateur GetById(String id) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur();
		try {
			utilisateur =_UtilisateurDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return utilisateur;
	}

	@Override
	public void Update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try {
			_UtilisateurDao.Update(utilisateur);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void Delete(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try {
			_UtilisateurDao.Delete(utilisateur);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Utilisateur> GetAll() {
		// TODO Auto-generated method stub
		List<Utilisateur> utilisateurs = null;
		try {
			utilisateurs = _UtilisateurDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return utilisateurs;
	}

}
