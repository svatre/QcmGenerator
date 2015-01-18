package model;

import model.base.BaseProfesseurMatiere;

/**
 * This is the object class that relates to the professeur_matiere table.
 * Any customizations belong here.
 */
public class ProfesseurMatiere extends BaseProfesseurMatiere {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ProfesseurMatiere () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ProfesseurMatiere (java.lang.Integer _idProfesseurmatiere) {
		super(_idProfesseurmatiere);
	}

	/**
	 * Constructor for required fields
	 */
	public ProfesseurMatiere (
		java.lang.Integer _idProfesseurmatiere,
		model.Matiere _idMatiere,
		model.Professeur _idProfesseur) {

		super (
			_idProfesseurmatiere,
			_idMatiere,
			_idProfesseur);
	}

/*[CONSTRUCTOR MARKER END]*/
}