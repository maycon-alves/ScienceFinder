package br.com.fiap.cienceFinderStartUp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;

@Service
public class HomeService {

	@Autowired
	DocumentoRepository documentoRepository;

	public List<Documento> buscarAprovadosSimplificado() {
		List<Documento> documentos = documentoRepository.findByVerificacao("SIM");
		List<Documento> documentosTratados = null;
		for (Documento item : documentos) {
			Documento documento = new Documento();
			documento.setAreaEstudoDocumento(item.getAreaEstudoDocumento());
			documento.setAutor(item.getAutor());
			documento.setDocumentoVerificado(item.getDocumentoVerificado());
			documento.setIdDocumento(item.getIdDocumento());
			documento.setNomeDocumento(item.getNomeDocumento());
			documento.setPropostaEstudo((item.getPropostaEstudo().substring(0, 10)) + "...");
			documentosTratados.add(documento);
		}
		return documentosTratados;
	}

}
