package model;

import model.base.BaseQcmQuestion;

/**
 * This is the object class that relates to the qcm_question table.
 * Any customizations belong here.
 */
public class QcmQuestion extends BaseQcmQuestion {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public QcmQuestion () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public QcmQuestion (java.lang.Integer _idQcmquestion) {
		super(_idQcmquestion);
	}

	/**
	 * Constructor for required fields
	 */
	public QcmQuestion (
		java.lang.Integer _idQcmquestion,
		model.Qcm _idQcm,
		model.Question _idQuestion) {

		super (
			_idQcmquestion,
			_idQcm,
			_idQuestion);
	}

/*[CONSTRUCTOR MARKER END]*/
}