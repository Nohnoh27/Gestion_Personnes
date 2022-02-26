package com.GesPersonnes.MetierImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GesPersonne.Repository.PersonneRepository;
import com.GesPersonnes.Entities.Personne;

@Service
@Transactional
public class PersonneMetierImplementation {

	@Autowired
	PersonneRepository personneRepository;
	
	public List<Personne>ListPersonne(){
		return personneRepository.findAll();
	}
	
	public void savePersonne (Personne p) {
		personneRepository.save(p);
    }
	

	public void removeEtudiant(Long id) {
		personneRepository.deleteById(id);
	}
	public void updateEtudiant (Personne p)
	{
		personneRepository.save(p);
	}
	
	public Optional<Personne> findPersonne(Long Id) {
		return personneRepository.findById(Id);
	}
}
