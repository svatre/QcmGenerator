package com.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Utilisateur;
import com.service.metier.UtilisateurMetier;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private String urlConnexion, urlCreationQcm, urlCreationQuestion, urlEleveAccueil;
	private String urlProfAccueil, urlQuestions, urlStatsQcm, urlAccueil ;
	private String identifiant, motdepasse;
	private UtilisateurMetier utilisateur;
    
    public Servlet() {
        super();
    }

	public void init() {
		urlConnexion = getInitParameter("urlConnexion");
		urlCreationQcm = getInitParameter("urlCreationQcm");
		urlCreationQuestion = getInitParameter("urlCreationQuestion");
		urlEleveAccueil = getInitParameter("urlEleveAccueil");
		urlProfAccueil = getInitParameter("urlProfAccueil");
		urlQuestions = getInitParameter("urlQuestions");
		urlStatsQcm = getInitParameter("urlStatsQcm");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*RequestDispatcher requestDispatcher; 
		requestDispatcher = request.getRequestDispatcher("/WEB-INF/View/Connexion.jsp");
		requestDispatcher.forward(request, response);*/

		String action = request.getParameter("action");
		RequestDispatcher requestDispatcher;
		
		if(action == null)
		{
			requestDispatcher = request.getRequestDispatcher(urlConnexion);
			requestDispatcher.forward(request, response);
		}
		
		switch(action)
		{
			case "connexion":
				identifiant = request.getParameter("identifiant");
				motdepasse = request.getParameter("mdp");
				/*List<Utilisateur> users = utilisateur.GetAll();
				
				for (Utilisateur utilisateur : users) {
					if(utilisateur.getIdentifiant().equals(identifiant))
					{
						if(utilisateur.getMdp().equals(motdepasse))
						{*/
							requestDispatcher = request.getRequestDispatcher(urlConnexion);
							requestDispatcher.forward(request, response);
						/*}
						else
						{
							
						}
					}
				}*/
				break;
			case "prof":
				requestDispatcher = request.getRequestDispatcher(urlProfAccueil);
				requestDispatcher.forward(request, response);
				break;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 urlAccueil = "http://localhost:8080/QcmGenerator/?action=connexion";
		 response.sendRedirect(urlAccueil);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

    private void validationIdentifiant( String identifiant ) throws Exception {
        if ( identifiant != null) {
            throw new Exception( "Merci de saisir un identifiant valide." );
        }
    }

    private void validationMotDePasse( String motDePasse ) throws Exception {
        if ( motDePasse != null ) {
            if ( motDePasse.length() < 3 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
        }
    }

}
