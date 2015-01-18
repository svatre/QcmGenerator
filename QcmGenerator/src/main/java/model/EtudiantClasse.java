package model;

import model.base.BaseEtudiantClasse;

/**
 * This is the object class that relates to the etudiant_classe table.
 * Any customizations belong here.
 */
public class EtudiantClasse extends BaseEtudiantClasse {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public EtudiantClasse () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public EtudiantClasse (java.lang.Integer _idEtudiantclasse) {
		super(_idEtudiantclasse);
	}

	/**
	 * Constructor for required fields
	 */
	public EtudiantClasse (
		java.lang.Integer _idEtudiantclasse,
		model.Etudiant _idEtudiant,
		model.Classe _idClasse) {

		super (
			_idEtudiantclasse,
			_idEtudiant,
			_idClasse);
	}

/*[CONSTRUCTOR MARKER END]*/
}