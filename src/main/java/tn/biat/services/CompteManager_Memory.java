package tn.biat.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import tn.biat.entities.Compte;

@Repository
@Profile("DEV")
public class CompteManager_Memory implements ICompteService {

	 private static List<Compte> comptes = Arrays.asList(
	            new Compte("C100", "Marwene", new BigDecimal("100")),
	            new Compte("C100", "Marwene", new BigDecimal("100")),
	            new Compte("C100", "Marwene", new BigDecimal("100"))
	    );
	 
	
   
    @Override
    public List<Compte> findAll() {
        return comptes;
    }

    
}
