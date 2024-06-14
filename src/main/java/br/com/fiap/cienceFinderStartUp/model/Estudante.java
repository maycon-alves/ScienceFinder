package br.com.fiap.cienceFinderStartUp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_estudante")
public class Estudante {

	@Id
	@SequenceGenerator(name = "estudante", sequenceName = "sq_tb_estudante", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudante")
	@Column(name = "id_estudante")
	private Integer idEstudante;

	@Column(name = "nr_documentoEstudante")
	private String documentoEstudante;

	@Column(name = "nm_nomeEstudante")
	private String nomeEstudante;

	@Column(name = "cd_areaInteresse")
	private String areaInteresse;

	@Column(name = "cd_senhaEstudante")
	private String senhaEstudante;

	@Column(name = "dt_dataUltimoLogin")
	private String ultimoLogin;

	public Estudante() {
		super();
	}

	public Estudante(Integer id_estudante, String nr_documentoEstudante, String nm_nomeEstudante,
			String cd_areaInteresse, String cd_senhaEstudante, String dt_dataUltimoLogin) {
		super();
		this.idEstudante = id_estudante;
		this.documentoEstudante = nr_documentoEstudante;
		this.nomeEstudante = nm_nomeEstudante;
		this.areaInteresse = cd_areaInteresse;
		this.senhaEstudante = cd_senhaEstudante;
		this.ultimoLogin = dt_dataUltimoLogin;
	}

	public String getDocumentoEstudante() {
		return documentoEstudante;
	}

	public void setDocumentoEstudante(String nr_documentoEstudante) {
		this.documentoEstudante = nr_documentoEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nm_nomeEstudante) {
		this.nomeEstudante = nm_nomeEstudante;
	}

	public String getAreaInteresse() {
		return areaInteresse;
	}

	public void setAreaInteresse(String cd_areaInteresse) {
		this.areaInteresse = cd_areaInteresse;
	}

	public String getSenhaEstudante() {
		return senhaEstudante;
	}

	public void setSenhaEstudante(String senhaEstudante) {
		this.senhaEstudante = senhaEstudante;
	}

	public String getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(String ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public Integer getIdEstudante() {
		return idEstudante;
	}

	public void setIdEstudante(Integer idEstudante) {
		this.idEstudante = idEstudante;
	}

	@Override
	public String toString() {
		return "Estudante [idEstudante=" + idEstudante + ", documentoEstudante=" + documentoEstudante
				+ ", nomeEstudante=" + nomeEstudante + ", areaInteresse=" + areaInteresse + "]";
	}

}
