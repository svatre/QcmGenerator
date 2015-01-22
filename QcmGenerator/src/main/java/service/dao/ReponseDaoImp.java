package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.HibernateUtil;
import model.Reponse;
import service.interfaces.dao.IReponseDao;

public class ReponseDaoImp implements IReponseDao {

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
	public void Create(Reponse reponse) {
		// TODO Auto-generated method stub
		_Session.persist(reponse);
	}

	@Override
	public Reponse GetById(String id) {
		// TODO Auto-generated method stub
		return (Reponse) _Session.get(Reponse.class, id);
	}

	@Override
	public void Update(Reponse reponse) {
		// TODO Auto-generated method stub
		_Session.update(reponse);
	}

	@Override
	public void Delete(Reponse reponse) {
		// TODO Auto-generated method stub
		_Session.delete(reponse);
	}

	@Override
	public List<Reponse> GetAll() {
		List<Reponse> objects = null;
        try {
            Query query = _Session.createQuery("from " + Reponse.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
