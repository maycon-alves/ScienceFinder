package br.com.fiap.cienceFinderStartUp.controller;

import java.util.List;

import br.com.fiap.cienceFinderStartUp.service.AprovacaoService;
import br.com.fiap.cienceFinderStartUp.service.PesquisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cienceFinder/startUp/v1")
public class MenuController {

	@Autowired
	private DocumentoRepository documentoRepository;

	public MenuController(AprovacaoService aprovacaoService) {
		this.aprovacaoService = aprovacaoService;
	}

	public AprovacaoService aprovacaoService;

	@GetMapping("/avaliacao/pendentes")
	public List<Documento> buscarPendentesAprovacao() {
		return documentoRepository.findByVerificacao("NAO");
	}

	@PutMapping("/avaliacao/{id_identificadorDocumento}")
	public Documento aprovacaoDocumento(@PathVariable Integer id_identificadorDocumento,
			@RequestParam String documentoVerificado) {
		return aprovacaoService.aprovacaoDocumento(id_identificadorDocumento,documentoVerificado);
	}

}
