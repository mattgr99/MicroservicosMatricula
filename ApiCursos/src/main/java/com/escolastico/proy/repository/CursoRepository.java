package com.escolastico.proy.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.escolastico.proy.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
