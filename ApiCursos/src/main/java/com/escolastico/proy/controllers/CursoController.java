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

import com.escolastico.proy.entities.Curso;
import com.escolastico.proy.service.CursoService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cursos")
//@Slf4j
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/{id}")
	public Curso retrieve(@PathVariable(value="id") Long id) {
		return cursoService.findById(id);
	}
	
	@GetMapping("/")
	public List<Curso> list() {
		return cursoService.findAll();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso saveCurso(@RequestBody Curso curso) {		
		//og.info("Inside create method of CursoController");
		cursoService.save(curso);
		return curso;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso update(@RequestBody Curso curso, @PathVariable Long id) {		 			
		cursoService.save(curso);
		return curso;
				
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		cursoService.delete(id);
	}	

}
