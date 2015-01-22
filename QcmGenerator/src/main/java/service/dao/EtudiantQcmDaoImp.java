package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.EtudiantQcm;
import model.HibernateUtil;
import service.interfaces.dao.IEtudiantQcmDao;

public class EtudiantQcmDaoImp implements IEtudiantQcmDao {

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
	public void Create(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		_Session.persist(etudiantQcm);
	}

	@Override
	public EtudiantQcm GetById(String id) {
		// TODO Auto-generated method stub
		return (EtudiantQcm) _Session.get(EtudiantQcm.class, id);
	}

	@Override
	public void Update(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		_Session.update(etudiantQcm);
	}

	@Override
	public void Delete(EtudiantQcm etudiantQcm) {
		// TODO Auto-generated method stub
		_Session.delete(etudiantQcm);
	}

	@Override
	public List<EtudiantQcm> GetAll() {
		List<EtudiantQcm> objects = null;
        try {
            Query query = _Session.createQuery("from " + EtudiantQcm.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
