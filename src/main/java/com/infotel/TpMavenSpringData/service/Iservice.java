package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {
	public Personne ajouterPersonne(Personne p);
	public Optional<Personne> getPersonne(int idPersonne);
	public Personne modifierPersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public List<Personne> findAllPersonnes();
	public List<Personne> rechercherParPrenom(String prenom);
	public int modifierNomPersonne(@Param("x") String nom, @Param("y") int id);
	public int ajouterAdressePersonne(Adresse adresse, int idPersonne);
	
	
	public Adresse ajouterAdresse(Adresse a);
	public Optional<Adresse> affichageAdresse(int idAdresse);
	public Adresse getAdresse(int idAdresse);
	public Adresse modifierAdresse(Adresse a);
	public void supprimerAdresse(Adresse a);
	public List<Adresse> findAllAdresses();


}
