package com.model;

import com.model.base.BaseQcm;

/**
 * This is the object class that relates to the qcm table.
 * Any customizations belong here.
 */
public class Qcm extends BaseQcm {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Qcm () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Qcm (java.lang.Integer _idQcm) {
		super(_idQcm);
	}

	/**
	 * Constructor for required fields
	 */
	public Qcm (
		java.lang.Integer _idQcm,
		com.model.Professeur _idProfesseur,
		java.util.Date _dateCreation,
		java.util.Date _dateDebut,
		java.util.Date _dateFin,
		java.lang.String _nom) {

		super (
			_idQcm,
			_idProfesseur,
			_dateCreation,
			_dateDebut,
			_dateFin,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}