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

import br.com.fiap.cienceFinderStartUp.model.DocumentoDetalhe;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoDetalheRepository;

@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class DocumentoDetalheController {

	@Autowired
	private DocumentoDetalheRepository documentoDetalheRepository;
	
	@GetMapping("documento/detalhe/{id_documento}")
	public DocumentoDetalhe buscar (@PathVariable Integer id_documento) {
		return documentoDetalheRepository.findById(id_documento).get();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/documentoDetalhe")
	public DocumentoDetalhe cadastrar (@RequestBody DocumentoDetalhe documento) {
		return documentoDetalheRepository.save(documento);
	}
	
}
