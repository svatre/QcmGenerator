package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.HibernateUtil;
import model.Qcm;
import service.interfaces.dao.IQcmDao;

public class QcmDaoImp implements IQcmDao {
	
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
	public void Create(Qcm qcm) {
		// TODO Auto-generated method stub
		_Session.persist(qcm);
	}

	@Override
	public Qcm GetById(String id) {
		// TODO Auto-generated method stub
		return (Qcm) _Session.get(Qcm.class, id);
	}

	@Override
	public void Update(Qcm qcm) {
		// TODO Auto-generated method stub
		_Session.update(qcm);
	}

	@Override
	public void Delete(Qcm qcm) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Qcm> GetAll() {
		List<Qcm> objects = null;
        try {
            Query query = _Session.createQuery("from " + Qcm.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;
	}

}
