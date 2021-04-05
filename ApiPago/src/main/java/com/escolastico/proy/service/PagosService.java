package com.escolastico.proy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolastico.proy.entities.Pagos;
import com.escolastico.proy.repository.PagosRepository;

@Service
public class PagosService {

	@Autowired
	private PagosRepository pagosRepository;
	
	
	
	public void save(Pagos pagos) {
		
			try {
				pagosRepository.save(pagos);
			}
			catch(Exception ex) {
				throw ex;
			}
		
	}

	
	
	public Pagos findById(Long id) {		
		return pagosRepository.findById(id).get();
	}

	
	public void delete(Long id) {
		try {
			pagosRepository.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	
	
	public List<Pagos> findAll() {		
		return (List<Pagos>) pagosRepository.findAll();
	}
}
