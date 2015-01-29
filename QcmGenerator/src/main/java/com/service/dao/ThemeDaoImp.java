package com.service.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.HibernateUtil;
import com.model.Theme;
import com.service.interfaces.dao.IThemeDao;

public class ThemeDaoImp implements IThemeDao {

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
	public void Create(Theme theme) {
		// TODO Auto-generated method stub
		_Session.persist(theme);
	}

	@Override
	public Theme GetById(String id) {
		// TODO Auto-generated method stub
		return (Theme) _Session.get(Theme.class, id);
	}

	@Override
	public void Update(Theme theme) {
		// TODO Auto-generated method stub
		_Session.update(theme);
	}

	@Override
	public void Delete(Theme theme) {
		// TODO Auto-generated method stub
		_Session.delete(theme);
	}

	@Override
	public List<Theme> GetAll() {
		List<Theme> objects = null;
        try {
            Query query = _Session.createQuery("from " + Theme.class.getName());
            objects = query.list();
        } catch (Exception e) {
            
        } finally {
           
        }
        return objects;// TODO Auto-generated method stub
	}

}
