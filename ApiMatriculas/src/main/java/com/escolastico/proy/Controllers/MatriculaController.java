package com.escolastico.proy.Controllers;

import java.util.ArrayList;
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

import com.escolastico.proy.entities.Matricula;
import com.escolastico.proy.Services.MatriculaService;
import com.escolastico.proy.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/{id}")
	public ResponseTemplateVO retrieve(@PathVariable(value="id") Long id) {
		return matriculaService.getMatriculawithPagosandCurso(id);
	}
	
	@GetMapping("/")
	public List<ResponseTemplateVO> list() {
		return matriculaService.findAll();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Matricula saveCurso(@RequestBody Matricula matricula) {		
		//og.info("Inside create method of CursoController");
		matriculaService.save(matricula);
		return matricula;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Matricula update(@RequestBody Matricula matricula, @PathVariable Long id) {		 			
		matriculaService.save(matricula);
		return matricula;
				
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		matriculaService.delete(id);
	}

}
