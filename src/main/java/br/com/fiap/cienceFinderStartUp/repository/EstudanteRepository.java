package br.com.fiap.cienceFinderStartUp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fiap.cienceFinderStartUp.model.Estudante;
import br.com.fiap.cienceFinderStartUp.model.Login;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer>{
	
	List<Estudante> findByIdEstudante(Integer id);
	
	@Query("from Estudante where nomeEstudante = :login and senhaEstudante = :senha")
	List<Estudante> findByLogin(@Param("login")String login, @Param("senha")String senha);
	
}
