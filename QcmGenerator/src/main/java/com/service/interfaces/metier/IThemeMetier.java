package com.service.interfaces.metier;

import java.util.List;

import com.model.Theme;

public interface IThemeMetier 
{
	void Create(Theme theme);
	
	Theme GetById(String id);
	
	void Update(Theme theme);
	
	void Delete(Theme theme);
	
	List<Theme> GetAll();
}
