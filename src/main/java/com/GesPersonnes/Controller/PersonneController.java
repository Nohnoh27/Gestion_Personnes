package com.GesPersonnes.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GesPersonnes.Entities.Personne;
import com.GesPersonnes.Metier.PersonneMetier;

@RestController
@RequestMapping(value="/Personne")
public class PersonneController {

	@Autowired
	private PersonneMetier personneMetier;
	
	@GetMapping(value="/findPersonne/{id}")
	public Optional<Personne> findPersonne(@PathVariable (value="id") String id){
		return personneMetier.findPersonne(Long.parseLong(id));
	}
	
	@PostMapping("/etudiant")
	public Personne creeEtudiant(@Validated @RequestBody Personne p)
	{
		personneMetier.savePersonne(p);
		return p;
	}
	
	@PutMapping("/UpdatePersonne")
	public String UpdatePersonne(@PathVariable @RequestBody Personne p)
	{
		personneMetier.savePersonne(p);
		return"success:Update a ete bien faite";
	}
	
	@GetMapping("/getAllPersonne")
	public List<Personne> getAllPersonne()
	{
		return personneMetier.ListPersonne();
	}
	
	@DeleteMapping(value="/delete personne/{id}")
	public String deletePersonne(@PathVariable String id)
	{
		personneMetier.removePersonne(Long.parseLong(id));
		return "ok!";
	}
}
