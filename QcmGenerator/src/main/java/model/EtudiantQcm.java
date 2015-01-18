package model;

import model.base.BaseEtudiantQcm;

/**
 * This is the object class that relates to the etudiant_qcm table.
 * Any customizations belong here.
 */
public class EtudiantQcm extends BaseEtudiantQcm {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public EtudiantQcm () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public EtudiantQcm (java.lang.Integer _idEtudiantqcm) {
		super(_idEtudiantqcm);
	}

	/**
	 * Constructor for required fields
	 */
	public EtudiantQcm (
		java.lang.Integer _idEtudiantqcm,
		model.Qcm _idQcm,
		model.Etudiant _idEtudiant,
		java.lang.Float _note) {

		super (
			_idEtudiantqcm,
			_idQcm,
			_idEtudiant,
			_note);
	}

/*[CONSTRUCTOR MARKER END]*/
}