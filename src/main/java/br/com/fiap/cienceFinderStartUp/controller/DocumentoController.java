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

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;

@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class DocumentoController {

	@Autowired
	private DocumentoRepository documentoRepository;

	@GetMapping("documento/{id_documento}")
	public Documento buscar(@PathVariable Integer id_documento) {
		return documentoRepository.findById(id_documento).get();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/documento")
	public Documento cadastrar(@RequestBody Documento documento) {
		return documentoRepository.save(documento);
	}
}
