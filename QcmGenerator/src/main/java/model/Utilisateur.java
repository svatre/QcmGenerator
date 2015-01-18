package model;

import model.base.BaseUtilisateur;

/**
 * This is the object class that relates to the utilisateur table.
 * Any customizations belong here.
 */
public class Utilisateur extends BaseUtilisateur {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Utilisateur () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Utilisateur (java.lang.Integer _idUtilisateur) {
		super(_idUtilisateur);
	}

	/**
	 * Constructor for required fields
	 */
	public Utilisateur (
		java.lang.Integer _idUtilisateur,
		java.lang.String _mdp,
		java.lang.String _type,
		java.lang.String _identifiant) {

		super (
			_idUtilisateur,
			_mdp,
			_type,
			_identifiant);
	}

/*[CONSTRUCTOR MARKER END]*/
}