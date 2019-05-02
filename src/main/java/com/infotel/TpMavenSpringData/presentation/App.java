package com.infotel.TpMavenSpringData.presentation;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Iservice services =  context.getBean("serviceImpl", ServiceImpl.class);
    	Personne p = context.getBean("personne", Personne.class); 
    	
    	// AJOUT DE PERSONNE
    	

    	
    	p.setIdPersonne(1);
    	p.setNom("Baroudi");
    	p.setPrenom("zakarya");
    	p.setAge(25);
    	
    	System.out.println("personne ajoutée: "+p);
    	services.ajouterPersonne(p);
    	
  
    	
    	
    	/*
  
    	//supprimer
    	
    	Personne p = context.getBean("personne", Personne.class);
    	
    
    	p.setIdPersonne(2);
    	services.supprimerPersonne(p);
    	
    	System.out.println("personne suprimée"); */
    
    	
    	
    	 //modifier
    	
    	//Modifier	tous les attributs
    	/*	
   	Personne p = context.getBean("personne", Personne.class);
   	
   	
   	p.setIdPersonne(3);
   	p.setNom("Iron");
   	p.setPrenom("Man");
   	p.setAge(38); 
   	
    services.modifierPersonne(p);
    System.out.println("personne modifiée"); */
    	
    	
    
    	//services.modifierNomPersonne("spider", 3);
    	
    	// lister personnes
    //	System.out.println(services.findAllPersonnes()); 
    	
    	
    	//adresse
    	
    	//ajouter adresse
    	
    	
    	/*Adresse a = context.getBean("adresse", Adresse.class);
    	a.setNomRue("Rue Poliveau");
    	a.setNumRue("10");
    	a.setVille("Paris");
    	a.setCp("75005");
    	
    	
     	services.ajouterAdresse(a);
        System.out.println("adresse ajoutée: " +a);
    	
    	/*Adresse a2 = context.getBean("adresse", Adresse.class);
    	a2.setNomRue("avenue du maine");
    	a2.setNumRue("33");
    	a2.setVille("Paris");
    	a2.setCp("75015");
    	
    	
    	
     	services.ajouterAdresse(a2); 
     	System.out.println("adresse ajoutée: " +a2);*/
 
    	
     	// modifier adresse
 
    	/*Adresse a = context.getBean("adresse", Adresse.class);
    	
    
    	a.setIdAdresse(1);
    	a.setNomRue("Rue de L'esperance");
    	a.setNumRue("11");
    	a.setVille("Paris");
    	a.setCp ("75013");
    	
    	services.modifierAdresse(a);
    	
    	System.out.println("adresse modifiée");
    	
    	/*supprimer
    	
    	Iservice services =  context.getBean("serviceImpl", ServiceImpl.class);
    	Adresse a = context.getBean("adresse", Adresse.class);
    	a = services.getAdresse(1);
    	
    	services.supprimerAdresse(a);*/
    	
    	
    	
    	services.ajouterAdressePersonne(services.getAdresse(1), 1);
    	
    	
    	
    	
    	

    	context.close();
    }
}
