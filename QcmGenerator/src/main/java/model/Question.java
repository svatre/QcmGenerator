package model;

import model.base.BaseQuestion;

/**
 * This is the object class that relates to the question table.
 * Any customizations belong here.
 */
public class Question extends BaseQuestion {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Question () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Question (java.lang.Integer _idQuestion) {
		super(_idQuestion);
	}

	/**
	 * Constructor for required fields
	 */
	public Question (
		java.lang.Integer _idQuestion,
		model.Theme _idTheme,
		model.Professeur _idProfesseur,
		java.util.Date _dateCreation,
		java.lang.String _intitule) {

		super (
			_idQuestion,
			_idTheme,
			_idProfesseur,
			_dateCreation,
			_intitule);
	}

/*[CONSTRUCTOR MARKER END]*/
}