package com.escolastico.proy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolastico.proy.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
