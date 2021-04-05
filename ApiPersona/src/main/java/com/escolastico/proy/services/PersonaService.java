package com.escolastico.proy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolastico.proy.entities.Persona;
import com.escolastico.proy.repository.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	
	
	public void save(Persona persona) {
		
			try {
				personaRepository.save(persona);
			}
			catch(Exception ex) {
				throw ex;
			}
		
	}

	
	
	public Persona findById(Long id) {		
		return personaRepository.findById(id).get();
	}

	
	public void delete(Long id) {
		try {
			personaRepository.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	
	
	public List<Persona> findAll() {		
		return (List<Persona>) personaRepository.findAll();
	}

}
