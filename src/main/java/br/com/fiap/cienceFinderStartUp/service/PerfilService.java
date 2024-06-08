package br.com.fiap.cienceFinderStartUp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.model.Estudante;
import br.com.fiap.cienceFinderStartUp.model.Perfil;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;
import br.com.fiap.cienceFinderStartUp.repository.EstudanteRepository;

@Service
public class PerfilService {

	@Autowired
	private DocumentoRepository documentoRepository;
	@Autowired
	private EstudanteRepository estudanteRepository;

	public Perfil getPerfilDaPessoa(Integer id_estudante) {
		Estudante estudante = new Estudante();
		List<Documento> documentos = new ArrayList<>();
		estudante = estudanteRepository.findById(id_estudante).get();
		documentos = documentoRepository.findByAutor(estudante.getNomeEstudante());
		Perfil perfil = new Perfil(estudante, documentos);
		return perfil;
	}

}
