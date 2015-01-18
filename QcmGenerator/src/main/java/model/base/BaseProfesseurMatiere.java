package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the professeur_matiere table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="professeur_matiere"
 */
public abstract class BaseProfesseurMatiere  implements Serializable {

	public static String PROP_ID_MATIERE = "IdMatiere";
	public static String PROP_ID_PROFESSEUR = "IdProfesseur";
	public static String PROP_ID_PROFESSEURMATIERE = "IdProfesseurmatiere";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idProfesseurmatiere;

	// many to one
	private model.Matiere _idMatiere;
	private model.Professeur _idProfesseur;


	// constructors
	public BaseProfesseurMatiere () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseProfesseurMatiere (java.lang.Integer _idProfesseurmatiere) {
		this.setIdProfesseurmatiere(_idProfesseurmatiere);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseProfesseurMatiere (
		java.lang.Integer _idProfesseurmatiere,
		model.Matiere _idMatiere,
		model.Professeur _idProfesseur) {

		this.setIdProfesseurmatiere(_idProfesseurmatiere);
		this.setIdMatiere(_idMatiere);
		this.setIdProfesseur(_idProfesseur);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id_professeurmatiere"
     */
	public java.lang.Integer getIdProfesseurmatiere () {
		return _idProfesseurmatiere;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idProfesseurmatiere the new ID
	 */
	public void setIdProfesseurmatiere (java.lang.Integer _idProfesseurmatiere) {
		this._idProfesseurmatiere = _idProfesseurmatiere;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
     * @hibernate.property
     *  column=id_matiere
	 * not-null=true
	 */
	public model.Matiere getIdMatiere () {
		return this._idMatiere;
	}

	/**
	 * Set the value related to the column: id_matiere
	 * @param _idMatiere the id_matiere value
	 */
	public void setIdMatiere (model.Matiere _idMatiere) {
		this._idMatiere = _idMatiere;
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


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseProfesseurMatiere)) return false;
		else {
			model.base.BaseProfesseurMatiere mObj = (model.base.BaseProfesseurMatiere) obj;
			if (null == this.getIdProfesseurmatiere() || null == mObj.getIdProfesseurmatiere()) return false;
			else return (this.getIdProfesseurmatiere().equals(mObj.getIdProfesseurmatiere()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdProfesseurmatiere()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdProfesseurmatiere().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}