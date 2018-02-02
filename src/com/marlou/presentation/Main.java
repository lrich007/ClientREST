package com.marlou.presentation;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//On fat un client
    	ClientConfig config = new DefaultClientConfig(); //On cr�e un client grace a library jersey
    	Client client = Client.create(config); // !attention : Client de Jersey
    	
    	//On prepare le chemin maintenant
    	URI uri = UriBuilder.fromUri("http://localhost:8084/proxibanquev3_bis").build();
    	
    	//On recupere le service grace a l'uri
    	WebResource service = client.resource(uri);
    	
    	//============Faire un virement
    	//WebResource path = service.path("banque").path("virement/1/2/10");
    	
    	//============Authentification
    	WebResource path = service.path("banque").path("authentification/maria@maria.fr/maria");
    	
    	//============Afficher la liste des clients
    	//WebResource path = service.path("banque").path("listAllClients");
    	
    	//============Afficher un compte � partir de son ID 
    	//WebResource path = service.path("banque").path("compte/1");
    	
    	//============Afficher une liste de comptes � partir de l'ID client
    	//WebResource path = service.path("banque").path("listComptes/8");
    	
    	//============Afficher un client � partir de son ID
    	//WebResource path = service.path("banque").path("client/4");
    	
    	//============Afficher la liste de clienet � partir d'un mot cle dans le nom de son conseiller
    	//WebResource path = service.path("banque").path("listAuthName/ric");
 
    	//============Modifier le nom du client
    	//WebResource path = service.path("banque").path("nomclient/8/louis");

    	
    	//============Modifier le prenom du client
    	//WebResource path = service.path("banque").path("prenomclient/6/caca");
    	
    	//============Modifier le prenom du client
    	//WebResource path = service.path("banque").path("courrielclient/6/caca");
    	
    	//============Modifier l'adresse du client
    	//WebResource path = service.path("banque").path("adresseclient/6/prout");
    	
    	
    	
    	//On met le resultat dans un objet (ici string car on a du string)
    	String resultat = path.get(String.class);
    	System.out.println("Le resultat de la requete est : " + resultat);
		
	}

}
