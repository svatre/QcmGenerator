package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the utilisateur table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="utilisateur"
 */
public abstract class BaseUtilisateur  implements Serializable {

	public static String PROP_IDENTIFIANT = "Identifiant";
	public static String PROP_ID_UTILISATEUR = "IdUtilisateur";
	public static String PROP_TYPE = "Type";
	public static String PROP_MDP = "Mdp";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idUtilisateur;

	// fields
	private java.lang.String _mdp;
	private java.lang.String _type;
	private java.lang.String _identifiant;

	// collections
	private java.util.Set _etudiantSet;
	private java.util.Set _professeurSet;
	private java.util.Set _administrateurSet;


	// constructors
	public BaseUtilisateur () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUtilisateur (java.lang.Integer _idUtilisateur) {
		this.setIdUtilisateur(_idUtilisateur);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUtilisateur (
		java.lang.Integer _idUtilisateur,
		java.lang.String _mdp,
		java.lang.String _type,
		java.lang.String _identifiant) {

		this.setIdUtilisateur(_idUtilisateur);
		this.setMdp(_mdp);
		this.setType(_type);
		this.setIdentifiant(_identifiant);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="id_utilisateur"
     */
	public java.lang.Integer getIdUtilisateur () {
		return _idUtilisateur;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idUtilisateur the new ID
	 */
	public void setIdUtilisateur (java.lang.Integer _idUtilisateur) {
		this._idUtilisateur = _idUtilisateur;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: mdp
	 */
	public java.lang.String getMdp () {
		return _mdp;
	}

	/**
	 * Set the value related to the column: mdp
	 * @param _mdp the mdp value
	 */
	public void setMdp (java.lang.String _mdp) {
		this._mdp = _mdp;
	}


	/**
	 * Return the value associated with the column: type
	 */
	public java.lang.String getType () {
		return _type;
	}

	/**
	 * Set the value related to the column: type
	 * @param _type the type value
	 */
	public void setType (java.lang.String _type) {
		this._type = _type;
	}


	/**
	 * Return the value associated with the column: identifiant
	 */
	public java.lang.String getIdentifiant () {
		return _identifiant;
	}

	/**
	 * Set the value related to the column: identifiant
	 * @param _identifiant the identifiant value
	 */
	public void setIdentifiant (java.lang.String _identifiant) {
		this._identifiant = _identifiant;
	}


	/**
	 * Return the value associated with the column: EtudiantSet
	 */
	public java.util.Set getEtudiantSet () {
		return this._etudiantSet;
	}

	/**
	 * Set the value related to the column: EtudiantSet
	 * @param _etudiantSet the EtudiantSet value
	 */
	public void setEtudiantSet (java.util.Set _etudiantSet) {
		this._etudiantSet = _etudiantSet;
	}
	
	public void addToEtudiantSet (Object obj) {
		if (null == this._etudiantSet) this._etudiantSet = new java.util.HashSet();
		this._etudiantSet.add(obj);
	}



	/**
	 * Return the value associated with the column: ProfesseurSet
	 */
	public java.util.Set getProfesseurSet () {
		return this._professeurSet;
	}

	/**
	 * Set the value related to the column: ProfesseurSet
	 * @param _professeurSet the ProfesseurSet value
	 */
	public void setProfesseurSet (java.util.Set _professeurSet) {
		this._professeurSet = _professeurSet;
	}
	
	public void addToProfesseurSet (Object obj) {
		if (null == this._professeurSet) this._professeurSet = new java.util.HashSet();
		this._professeurSet.add(obj);
	}



	/**
	 * Return the value associated with the column: AdministrateurSet
	 */
	public java.util.Set getAdministrateurSet () {
		return this._administrateurSet;
	}

	/**
	 * Set the value related to the column: AdministrateurSet
	 * @param _administrateurSet the AdministrateurSet value
	 */
	public void setAdministrateurSet (java.util.Set _administrateurSet) {
		this._administrateurSet = _administrateurSet;
	}
	
	public void addToAdministrateurSet (Object obj) {
		if (null == this._administrateurSet) this._administrateurSet = new java.util.HashSet();
		this._administrateurSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseUtilisateur)) return false;
		else {
			model.base.BaseUtilisateur mObj = (model.base.BaseUtilisateur) obj;
			if (null == this.getIdUtilisateur() || null == mObj.getIdUtilisateur()) return false;
			else return (this.getIdUtilisateur().equals(mObj.getIdUtilisateur()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdUtilisateur()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdUtilisateur().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}