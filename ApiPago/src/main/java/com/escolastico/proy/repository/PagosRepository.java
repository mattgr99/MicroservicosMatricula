package com.escolastico.proy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolastico.proy.entities.Pagos;

@Repository
public interface PagosRepository extends JpaRepository<Pagos, Long>{

}

