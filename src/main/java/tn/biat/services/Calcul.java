package tn.biat.services;

import org.springframework.stereotype.Service;

@Service
public class Calcul implements ICalcul {
	
	
	@Override
	public int additionner(int a, int b) {
		return a+b;
	}

}
