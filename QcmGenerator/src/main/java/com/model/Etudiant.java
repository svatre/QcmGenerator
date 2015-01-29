package com.model;

import com.model.base.BaseEtudiant;

/**
 * This is the object class that relates to the etudiant table.
 * Any customizations belong here.
 */
public class Etudiant extends BaseEtudiant {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Etudiant () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Etudiant (java.lang.Integer _idEtudiant) {
		super(_idEtudiant);
	}

	/**
	 * Constructor for required fields
	 */
	public Etudiant (
		java.lang.Integer _idEtudiant,
		com.model.Utilisateur _idUtilisateur,
		java.lang.String _prenom,
		java.lang.String _nom) {

		super (
			_idEtudiant,
			_idUtilisateur,
			_prenom,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}