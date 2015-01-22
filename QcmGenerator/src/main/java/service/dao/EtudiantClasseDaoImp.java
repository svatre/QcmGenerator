package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.EtudiantClasse;
import model.HibernateUtil;
import service.interfaces.dao.IEtudiantClasseDao;

public class EtudiantClasseDaoImp implements IEtudiantClasseDao {
	
	private Session _Session;
	
	@SuppressWarnings("unused")
	private Session get_Session() {
		return HibernateUtil.currentSession();
	}
	
	public void CloseSession()
	{
		HibernateUtil.closeSession();
	}
	
	@Override
	public void Create(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		_Session.persist(etudiantClasse);
	}

	@Override
	public EtudiantClasse GetById(String id) {
		// TODO Auto-generated method stub
		return (EtudiantClasse) _Session.get(EtudiantClasse.class, id);
	}

	@Override
	public void Update(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		_Session.update(etudiantClasse);

	}

	@Override
	public void Delete(EtudiantClasse etudiantClasse) {
		// TODO Auto-generated method stub
		_Session.delete(etudiantClasse);
	}

	@Override
	public List<EtudiantClasse> GetAll() {
		 List<EtudiantClasse> objects = null;
	        try {
	            Query query = _Session.createQuery("from " + EtudiantClasse.class.getName());
	            objects = query.list();
	        } catch (Exception e) {
	            
	        } finally {
	           
	        }
	        return objects;
	}

}
