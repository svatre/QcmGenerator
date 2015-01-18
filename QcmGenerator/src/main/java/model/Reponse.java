package model;

import model.base.BaseReponse;

/**
 * This is the object class that relates to the reponse table.
 * Any customizations belong here.
 */
public class Reponse extends BaseReponse {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Reponse () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Reponse (java.lang.Integer _idReponse) {
		super(_idReponse);
	}

	/**
	 * Constructor for required fields
	 */
	public Reponse (
		java.lang.Integer _idReponse,
		model.Question _idQuestion,
		boolean _bonneReponse,
		java.lang.String _contenu) {

		super (
			_idReponse,
			_idQuestion,
			_bonneReponse,
			_contenu);
	}

/*[CONSTRUCTOR MARKER END]*/
}