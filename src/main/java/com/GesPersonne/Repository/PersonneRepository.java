package com.GesPersonne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesPersonnes.Entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
