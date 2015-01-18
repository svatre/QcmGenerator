package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the question table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="question"
 */
public abstract class BaseQuestion  implements Serializable {

	public static String PROP_ID_PROFESSEUR = "IdProfesseur";
	public static String PROP_INTITULE = "Intitule";
	public static String PROP_ID_QUESTION = "IdQuestion";
	public static String PROP_ID_THEME = "IdTheme";
	public static String PROP_DATE_CREATION = "DateCreation";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idQuestion;

	// fields
	private java.util.Date _dateCreation;
	private java.lang.String _intitule;

	// many to one
	private model.Theme _idTheme;
	private model.Professeur _idProfesseur;

	// collections
	private java.util.Set _qcmQuestionSet;
	private java.util.Set _reponseSet;


	// constructors
	public BaseQuestion () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseQuestion (java.lang.Integer _idQuestion) {
		this.setIdQuestion(_idQuestion);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseQuestion (
		java.lang.Integer _idQuestion,
		model.Theme _idTheme,
		model.Professeur _idProfesseur,
		java.util.Date _dateCreation,
		java.lang.String _intitule) {

		this.setIdQuestion(_idQuestion);
		this.setIdTheme(_idTheme);
		this.setIdProfesseur(_idProfesseur);
		this.setDateCreation(_dateCreation);
		this.setIntitule(_intitule);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id_question"
     */
	public java.lang.Integer getIdQuestion () {
		return _idQuestion;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idQuestion the new ID
	 */
	public void setIdQuestion (java.lang.Integer _idQuestion) {
		this._idQuestion = _idQuestion;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: date_creation
	 */
	public java.util.Date getDateCreation () {
		return _dateCreation;
	}

	/**
	 * Set the value related to the column: date_creation
	 * @param _dateCreation the date_creation value
	 */
	public void setDateCreation (java.util.Date _dateCreation) {
		this._dateCreation = _dateCreation;
	}


	/**
	 * Return the value associated with the column: intitule
	 */
	public java.lang.String getIntitule () {
		return _intitule;
	}

	/**
	 * Set the value related to the column: intitule
	 * @param _intitule the intitule value
	 */
	public void setIntitule (java.lang.String _intitule) {
		this._intitule = _intitule;
	}


	/**
     * @hibernate.property
     *  column=id_theme
	 * not-null=true
	 */
	public model.Theme getIdTheme () {
		return this._idTheme;
	}

	/**
	 * Set the value related to the column: id_theme
	 * @param _idTheme the id_theme value
	 */
	public void setIdTheme (model.Theme _idTheme) {
		this._idTheme = _idTheme;
	}


	/**
     * @hibernate.property
     *  column=id_professeur
	 * not-null=true
	 */
	public model.Professeur getIdProfesseur () {
		return this._idProfesseur;
	}

	/**
	 * Set the value related to the column: id_professeur
	 * @param _idProfesseur the id_professeur value
	 */
	public void setIdProfesseur (model.Professeur _idProfesseur) {
		this._idProfesseur = _idProfesseur;
	}


	/**
	 * Return the value associated with the column: QcmQuestionSet
	 */
	public java.util.Set getQcmQuestionSet () {
		return this._qcmQuestionSet;
	}

	/**
	 * Set the value related to the column: QcmQuestionSet
	 * @param _qcmQuestionSet the QcmQuestionSet value
	 */
	public void setQcmQuestionSet (java.util.Set _qcmQuestionSet) {
		this._qcmQuestionSet = _qcmQuestionSet;
	}
	
	public void addToQcmQuestionSet (Object obj) {
		if (null == this._qcmQuestionSet) this._qcmQuestionSet = new java.util.HashSet();
		this._qcmQuestionSet.add(obj);
	}



	/**
	 * Return the value associated with the column: ReponseSet
	 */
	public java.util.Set getReponseSet () {
		return this._reponseSet;
	}

	/**
	 * Set the value related to the column: ReponseSet
	 * @param _reponseSet the ReponseSet value
	 */
	public void setReponseSet (java.util.Set _reponseSet) {
		this._reponseSet = _reponseSet;
	}
	
	public void addToReponseSet (Object obj) {
		if (null == this._reponseSet) this._reponseSet = new java.util.HashSet();
		this._reponseSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseQuestion)) return false;
		else {
			model.base.BaseQuestion mObj = (model.base.BaseQuestion) obj;
			if (null == this.getIdQuestion() || null == mObj.getIdQuestion()) return false;
			else return (this.getIdQuestion().equals(mObj.getIdQuestion()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdQuestion()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdQuestion().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}