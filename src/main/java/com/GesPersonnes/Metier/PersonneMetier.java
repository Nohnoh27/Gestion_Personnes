package com.GesPersonnes.Metier;

import java.util.List;
import java.util.Optional;

import com.GesPersonnes.Entities.Personne;

public interface PersonneMetier {
	void savePersonne (Personne p);
	void removePersonne(Long Id);
	void updatePersonne(Personne e);
	 List<Personne>ListPersonne();
	 Optional<Personne> findPersonne(Long Id);
}
