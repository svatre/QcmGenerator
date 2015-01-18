package model;

import model.base.BaseClasse;

/**
 * This is the object class that relates to the classe table.
 * Any customizations belong here.
 */
public class Classe extends BaseClasse {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Classe () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Classe (java.lang.Integer _idClasse) {
		super(_idClasse);
	}

	/**
	 * Constructor for required fields
	 */
	public Classe (
		java.lang.Integer _idClasse,
		java.lang.String _nom) {

		super (
			_idClasse,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}