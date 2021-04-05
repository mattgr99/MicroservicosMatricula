package com.escolastico.proy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.escolastico.proy.entities.Pagos;
import com.escolastico.proy.service.PagosService;

@RestController
@RequestMapping("/pagos")
public class PagosController {
	
	@Autowired
	private PagosService pagosService;
	
	@GetMapping("/{id}")
	public Pagos retrieve(@PathVariable(value="id") Long id) {
		return pagosService.findById(id);
	}
	
	@GetMapping("/")
	public List<Pagos> list() {
		return pagosService.findAll();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Pagos saveCurso(@RequestBody Pagos pagos) {		
		//og.info("Inside create method of CursoController");
		pagosService.save(pagos);
		return pagos;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pagos update(@RequestBody Pagos pagos, @PathVariable Long id) {		 			
		pagosService.save(pagos);
		return pagos;
				
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pagosService.delete(id);
	}	
}


