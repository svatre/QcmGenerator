package com.model;

import com.model.base.BaseProfesseur;

/**
 * This is the object class that relates to the professeur table.
 * Any customizations belong here.
 */
public class Professeur extends BaseProfesseur {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Professeur () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Professeur (java.lang.Integer _idProfesseur) {
		super(_idProfesseur);
	}

	/**
	 * Constructor for required fields
	 */
	public Professeur (
		java.lang.Integer _idProfesseur,
		com.model.Utilisateur _idUtilisateur,
		java.lang.String _prenom,
		java.lang.String _nom) {

		super (
			_idProfesseur,
			_idUtilisateur,
			_prenom,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}