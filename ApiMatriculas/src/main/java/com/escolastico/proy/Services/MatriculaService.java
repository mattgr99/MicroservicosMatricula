package com.escolastico.proy.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.escolastico.proy.VO.Curso;
import com.escolastico.proy.VO.Pagos;
import com.escolastico.proy.VO.Persona;
import com.escolastico.proy.VO.ResponseTemplateVO;
import com.escolastico.proy.entities.Matricula;
import com.escolastico.proy.repository.MatriculaRepository;

@Service
public class MatriculaService {
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Autowired
	private RestTemplate restTemplate; 
	
	public void save(Matricula matricula) {
		
			try {
				matriculaRepository.save(matricula);
			}
			catch(Exception ex) {
				throw ex;
			}
		
	}

	
	
	public Matricula findById(Long id) {		
		return matriculaRepository.findById(id).get();
	}

	
	public void delete(Long id) {
		try {
			matriculaRepository.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}
	
	public ResponseTemplateVO getMatriculawithPagosandCurso(Long id) {
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Matricula matricula = matriculaRepository.findById(id).get();
		Persona persona= 
				restTemplate.getForObject("http://localhost:9002/persona/"+ matricula.getPersonaId(), 
						Persona.class);
		
		Curso curso = 
				restTemplate.getForObject("http://localhost:9003/cursos/"+ matricula.getCursoId(), 
						Curso.class);
		
		Pagos pago = 
				restTemplate.getForObject("http://localhost:9004/pagos/"+ matricula.getPagoId(), 
						Pagos.class);
		
		
		vo.setMatricula(matricula);
		vo.setCurso(curso);
		vo.setPago(pago);
		vo.setPersona(persona);
		
		return vo;
		
		
	}
	
	
	
	
	public List<ResponseTemplateVO> findAll() {		
		List<Matricula> listabusqueda= new ArrayList();
		List<ResponseTemplateVO> listareferencias= new ArrayList();
		listabusqueda= matriculaRepository.findAll();
		for (Matricula objeto: listabusqueda) {
			listareferencias.add(getMatriculawithPagosandCurso(objeto.getMatriculaId()));
		}
		return  listareferencias;
	}

}
