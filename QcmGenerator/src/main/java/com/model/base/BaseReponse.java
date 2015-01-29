package com.model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the reponse table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="reponse"
 */
public abstract class BaseReponse  implements Serializable {

	public static String PROP_ID_QUESTION = "IdQuestion";
	public static String PROP_ID_REPONSE = "IdReponse";
	public static String PROP_BONNE_REPONSE = "BonneReponse";
	public static String PROP_CONTENU = "Contenu";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idReponse;

	// fields
	private boolean _bonneReponse;
	private java.lang.String _contenu;

	// many to one
	private com.model.Question _idQuestion;


	// constructors
	public BaseReponse () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseReponse (java.lang.Integer _idReponse) {
		this.setIdReponse(_idReponse);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseReponse (
		java.lang.Integer _idReponse,
		com.model.Question _idQuestion,
		boolean _bonneReponse,
		java.lang.String _contenu) {

		this.setIdReponse(_idReponse);
		this.setIdQuestion(_idQuestion);
		this.setBonneReponse(_bonneReponse);
		this.setContenu(_contenu);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id_reponse"
     */
	public java.lang.Integer getIdReponse () {
		return _idReponse;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idReponse the new ID
	 */
	public void setIdReponse (java.lang.Integer _idReponse) {
		this._idReponse = _idReponse;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: bonne_reponse
	 */
	public boolean isBonneReponse () {
		return _bonneReponse;
	}

	/**
	 * Set the value related to the column: bonne_reponse
	 * @param _bonneReponse the bonne_reponse value
	 */
	public void setBonneReponse (boolean _bonneReponse) {
		this._bonneReponse = _bonneReponse;
	}


	/**
	 * Return the value associated with the column: contenu
	 */
	public java.lang.String getContenu () {
		return _contenu;
	}

	/**
	 * Set the value related to the column: contenu
	 * @param _contenu the contenu value
	 */
	public void setContenu (java.lang.String _contenu) {
		this._contenu = _contenu;
	}


	/**
     * @hibernate.property
     *  column=id_question
	 * not-null=true
	 */
	public com.model.Question getIdQuestion () {
		return this._idQuestion;
	}

	/**
	 * Set the value related to the column: id_question
	 * @param _idQuestion the id_question value
	 */
	public void setIdQuestion (com.model.Question _idQuestion) {
		this._idQuestion = _idQuestion;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.model.base.BaseReponse)) return false;
		else {
			com.model.base.BaseReponse mObj = (com.model.base.BaseReponse) obj;
			if (null == this.getIdReponse() || null == mObj.getIdReponse()) return false;
			else return (this.getIdReponse().equals(mObj.getIdReponse()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdReponse()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdReponse().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}