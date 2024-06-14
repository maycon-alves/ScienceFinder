package br.com.fiap.cienceFinderStartUp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.cienceFinderStartUp.model.BuscaPerfilOuDocumento;
import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.model.Estudante;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;
import br.com.fiap.cienceFinderStartUp.repository.EstudanteRepository;

@Service
public class PesquisaService {

	@Autowired
	EstudanteRepository estudanteRepository;

	@Autowired
	DocumentoRepository documentoRepository;

	public BuscaPerfilOuDocumento findAll(String texto) {
		List<Estudante> estudantes = estudanteRepository.findByNome(texto);
		List<Documento> documentos = documentoRepository.findByNome(texto);
		BuscaPerfilOuDocumento resultadoBusca = new BuscaPerfilOuDocumento(estudantes, documentos);
		return resultadoBusca;
	}

	public List<Documento> buscarAprovadosSimplificado() {
		List<Documento> documentos = documentoRepository.findByVerificacao("SIM");
		List<Documento> documentosTratados = new ArrayList<>();
		if (documentos != null) {
			for (Documento item : documentos) {
				Documento documento = new Documento();
				documento.setAreaEstudoDocumento(item.getAreaEstudoDocumento());
				documento.setAutor(item.getAutor());
				documento.setDocumentoVerificado(item.getDocumentoVerificado());
				documento.setIdDocumento(item.getIdDocumento());
				documento.setNomeDocumento(item.getNomeDocumento());
				documento.setPropostaEstudo(item.getPropostaEstudo()); //(item.getPropostaEstudo().substring(0, 10)) + "...");
				documentosTratados.add(documento);
			}
			return documentosTratados;
		} else {
			return documentos;
		}
	}

}
