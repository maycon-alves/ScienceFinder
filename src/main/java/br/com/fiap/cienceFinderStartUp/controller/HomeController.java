package br.com.fiap.cienceFinderStartUp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class HomeController {
	
	@Autowired
	private DocumentoRepository documentoRepository;

	@GetMapping("/home")
	public List<Documento> buscarAprovados(){
		return documentoRepository.findByVerificacao("SIM");
	}
	
}
