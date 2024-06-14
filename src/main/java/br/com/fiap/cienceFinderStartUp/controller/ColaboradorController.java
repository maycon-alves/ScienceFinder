package br.com.fiap.cienceFinderStartUp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cienceFinderStartUp.model.Colaborador;
import br.com.fiap.cienceFinderStartUp.repository.ColaboradorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class ColaboradorController {	

	@Autowired
	private ColaboradorRepository colaboradorRepository;

	@GetMapping("colaborador/{id_colaborador}")
	public Colaborador buscar(@PathVariable Integer id_colaborador) {
		return colaboradorRepository.findById(id_colaborador).get();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/colaborador")
	public Colaborador cadastrar(@RequestBody Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}
}
