package model;

import model.base.BaseMatiere;

/**
 * This is the object class that relates to the matiere table.
 * Any customizations belong here.
 */
public class Matiere extends BaseMatiere {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Matiere () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Matiere (java.lang.Integer _idMatiere) {
		super(_idMatiere);
	}

	/**
	 * Constructor for required fields
	 */
	public Matiere (
		java.lang.Integer _idMatiere,
		java.lang.String _nom) {

		super (
			_idMatiere,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}