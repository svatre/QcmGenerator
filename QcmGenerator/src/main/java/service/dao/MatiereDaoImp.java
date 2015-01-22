package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.EtudiantQcm;
import model.HibernateUtil;
import model.Matiere;
import service.interfaces.dao.IMatiereDao;

public class MatiereDaoImp implements IMatiereDao {

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
	public void Create(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.persist(matiere);
	}

	@Override
	public Matiere GetById(String id) {
		// TODO Auto-generated method stub
		return (Matiere) _Session.get(Matiere.class, id);
	}

	@Override
	public void Update(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.update(matiere);
	}

	@Override
	public void Delete(Matiere matiere) {
		// TODO Auto-generated method stub
		_Session.delete(matiere);
	}

	@Override
	public List<Matiere> GetAll() {
		List<Matiere> objects = null;
        try {
            Query query = _Session.createQuery("from " + Matiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
