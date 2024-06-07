package br.com.fiap.cienceFinderStartUp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cienceFinderStartUp.model.DocumentoDetalhe;

public interface DocumentoDetalheRepository extends JpaRepository<DocumentoDetalhe, Integer> {

	List<DocumentoDetalhe> findByIdDocumentoDetalhe (Integer id);
	
}
