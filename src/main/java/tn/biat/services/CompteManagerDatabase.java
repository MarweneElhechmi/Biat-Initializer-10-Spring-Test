package tn.biat.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import tn.biat.entities.Compte;

@Repository
@Profile("PROD")
public class CompteManagerDatabase implements ICompteService {

	
	 
	@Autowired
	private EntityManager em;
  
   @Override
   public List<Compte> findAll() {
       return em.createQuery("from Compte c").getResultList();
   }

   
}