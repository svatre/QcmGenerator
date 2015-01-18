package model;

import model.base.BaseTheme;

/**
 * This is the object class that relates to the theme table.
 * Any customizations belong here.
 */
public class Theme extends BaseTheme {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Theme () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Theme (java.lang.Integer _idTheme) {
		super(_idTheme);
	}

	/**
	 * Constructor for required fields
	 */
	public Theme (
		java.lang.Integer _idTheme,
		java.lang.String _nom) {

		super (
			_idTheme,
			_nom);
	}

/*[CONSTRUCTOR MARKER END]*/
}