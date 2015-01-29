package com.service.metier;

import java.util.List;

import com.model.Theme;
import com.service.interfaces.dao.IThemeDao;
import com.service.interfaces.metier.IThemeMetier;

public class ThemeMetier implements IThemeMetier {

	private IThemeDao _ThemeDao;
	
	public IThemeDao get_ThemeDao() {
		return _ThemeDao;
	}

	public void set_ThemeDao(IThemeDao _ThemeDao) {
		this._ThemeDao = _ThemeDao;
	}

	
	public void Create(Theme theme) {
		// TODO Auto-generated method stub
		try {
			_ThemeDao.Create(theme);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public Theme GetById(String id) {
		// TODO Auto-generated method stub
		Theme theme = new Theme();
		try {
			theme= _ThemeDao.GetById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return theme;
	}

	
	public void Update(Theme theme) {
		// TODO Auto-generated method stub
		try {
			_ThemeDao.Update(theme);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public void Delete(Theme theme) {
		// TODO Auto-generated method stub
		try {
			_ThemeDao.Delete(theme);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public List<Theme> GetAll() {
		// TODO Auto-generated method stub
		List<Theme> themes = null;
		try {
			themes = _ThemeDao.GetAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return themes;
	}

}
