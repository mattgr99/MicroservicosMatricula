package com.escolastico.proy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolastico.proy.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
