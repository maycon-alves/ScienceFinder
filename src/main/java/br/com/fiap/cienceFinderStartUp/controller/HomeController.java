package br.com.fiap.cienceFinderStartUp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.cienceFinderStartUp.model.BuscaPerfilOuDocumento;
import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.service.PesquisaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class HomeController {

	public HomeController(PesquisaService pesquisaService) {
		this.pesquisaService = pesquisaService;
	}

	public PesquisaService pesquisaService;

	@GetMapping("/home")
	public List<Documento> buscarAprovados() {
		return pesquisaService.buscarAprovadosSimplificado();
	}

	@GetMapping("/home/explorer/{texto_busca}")
	public BuscaPerfilOuDocumento buscaPerfilOuDocumento(@PathVariable String texto_busca) {
		return pesquisaService.findAll(texto_busca);
	}
}
