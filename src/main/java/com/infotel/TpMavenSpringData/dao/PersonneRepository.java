package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
@Transactional
public interface PersonneRepository  extends JpaRepository<Personne, Integer>  {
	
	public List<Personne> findByPrenom(String x);
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> rechercherParMc(@Param("x") String nom); // @query ou requete nommer
	
	@Modifying
	@Query("update Personne SET nom = :x where id = :y")
	public int modifierNomPersonne(@Param("x") String nom, @Param("y") int id);
	@Modifying
	@Query ("update Personne SET adresse = :x where idpersonne= :y")
	public int ajouterAdressePersonne(@Param("x")Adresse adresse , @Param("y")int idPersonne);
	

}
