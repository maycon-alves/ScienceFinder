package br.com.fiap.cienceFinderStartUp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.model.Estudante;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {

	List<Documento> findByIdDocumento(Integer id);

	@Query("from Documento where documentoVerificado = :documentoVerificado")
	List<Documento> findByVerificacao(@Param("documentoVerificado") String documentoVerificado);

	@Query("from Documento where autor = :autor")
	List<Documento> findByAutor(@Param("autor") String autor);

	@Query("from Documento where nomeDocumento like :nomeDocumento%")
	List<Documento> findByNome(@Param("nomeDocumento") String nomeDocumento);
}
