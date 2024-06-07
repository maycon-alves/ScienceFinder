package br.com.fiap.cienceFinderStartUp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cienceFinderStartUp.model.Estudante;
import br.com.fiap.cienceFinderStartUp.repository.EstudanteRepository;

@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class EstudanteController {

	@Autowired
	private EstudanteRepository estudanteRepository;
	
	
	@GetMapping("/estudante/{id_estudante}")
	public Estudante buscar (@PathVariable Integer id_estudante) {
		return estudanteRepository.findById(id_estudante).get();
	}
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/estudante")
	public Estudante cadastrar (@RequestBody Estudante estudante) {
		return estudanteRepository.save(estudante);
	}
}
