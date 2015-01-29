package com.model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the theme table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="theme"
 */
public abstract class BaseTheme  implements Serializable {

	public static String PROP_NOM = "Nom";
	public static String PROP_ID_THEME = "IdTheme";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idTheme;

	// fields
	private java.lang.String _nom;

	// collections
	private java.util.Set _questionSet;


	// constructors
	public BaseTheme () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTheme (java.lang.Integer _idTheme) {
		this.setIdTheme(_idTheme);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTheme (
		java.lang.Integer _idTheme,
		java.lang.String _nom) {

		this.setIdTheme(_idTheme);
		this.setNom(_nom);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id_theme"
     */
	public java.lang.Integer getIdTheme () {
		return _idTheme;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idTheme the new ID
	 */
	public void setIdTheme (java.lang.Integer _idTheme) {
		this._idTheme = _idTheme;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: nom
	 */
	public java.lang.String getNom () {
		return _nom;
	}

	/**
	 * Set the value related to the column: nom
	 * @param _nom the nom value
	 */
	public void setNom (java.lang.String _nom) {
		this._nom = _nom;
	}


	/**
	 * Return the value associated with the column: QuestionSet
	 */
	public java.util.Set getQuestionSet () {
		return this._questionSet;
	}

	/**
	 * Set the value related to the column: QuestionSet
	 * @param _questionSet the QuestionSet value
	 */
	public void setQuestionSet (java.util.Set _questionSet) {
		this._questionSet = _questionSet;
	}
	
	public void addToQuestionSet (Object obj) {
		if (null == this._questionSet) this._questionSet = new java.util.HashSet();
		this._questionSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.model.base.BaseTheme)) return false;
		else {
			com.model.base.BaseTheme mObj = (com.model.base.BaseTheme) obj;
			if (null == this.getIdTheme() || null == mObj.getIdTheme()) return false;
			else return (this.getIdTheme().equals(mObj.getIdTheme()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdTheme()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdTheme().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}