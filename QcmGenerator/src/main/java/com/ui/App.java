package com.ui;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Utilisateur;
import com.service.metier.UtilisateurMetier;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Utilisateur user = new Utilisateur();
		user.setIdUtilisateur(1);
		user.setMdp("prof");
		user.setType("Prof");
		user.setIdentifiant("Prof");
		UtilisateurMetier userService = (UtilisateurMetier) context.getBean("utilisateurMetier");
		userService.Create(user);
		context.close();
	}

}
