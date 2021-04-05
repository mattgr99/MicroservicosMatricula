package com.escolastico.proy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.escolastico.proy.entities.Curso;
import com.escolastico.proy.repository.CursoRepository;

import lombok.extern.slf4j.Slf4j;


@Service

public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	
	
	public void save(Curso curso) {
		
			try {
				cursoRepository.save(curso);
			}
			catch(Exception ex) {
				throw ex;
			}
		
	}

	
	
	public Curso findById(Long id) {		
		return cursoRepository.findById(id).get();
	}

	
	public void delete(Long id) {
		try {
			cursoRepository.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	
	
	public List<Curso> findAll() {		
		return (List<Curso>) cursoRepository.findAll();
	}

}
