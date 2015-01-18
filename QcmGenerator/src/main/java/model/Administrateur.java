package model;

import model.base.BaseAdministrateur;

/**
 * This is the object class that relates to the administrateur table.
 * Any customizations belong here.
 */
public class Administrateur extends BaseAdministrateur {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Administrateur () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Administrateur (java.lang.Integer _idAdministrateur) {
		super(_idAdministrateur);
	}

	/**
	 * Constructor for required fields
	 */
	public Administrateur (
		java.lang.Integer _idAdministrateur,
		model.Utilisateur _idUtilisateur,
		java.lang.String _nom) {

		super (
			_idAdministrateur,
			_idUtilisateur,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}