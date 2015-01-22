package service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import model.HibernateUtil;
import model.ProfesseurMatiere;
import service.interfaces.dao.IProfesseurMatiereDao;

public class ProfesseurMatiereDaoImp implements IProfesseurMatiereDao {

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
	public void Create(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.persist(profMatiere);
	}

	@Override
	public ProfesseurMatiere GetById(String id) {
		// TODO Auto-generated method stub
		return (ProfesseurMatiere) _Session.get(ProfesseurMatiere.class, id);
	}

	@Override
	public void Update(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.update(profMatiere);
	}

	@Override
	public void Delete(ProfesseurMatiere profMatiere) {
		// TODO Auto-generated method stub
		_Session.delete(profMatiere);
	}

	@Override
	public List<ProfesseurMatiere> GetAll() {
		List<ProfesseurMatiere> objects = null;
        try {
            Query query = _Session.createQuery("from " + ProfesseurMatiere.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
