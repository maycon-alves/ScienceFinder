package br.com.fiap.cienceFinderStartUp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_colaborador")
public class Colaborador {

	@Id
	@SequenceGenerator(name = "colaborador", sequenceName = "sq_tb_colaborador", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colaborador")
	@Column(name = "id_colabodador")
	private Integer idColaborador;

	@Column(name = "nm_nomeColaborador")
	private String nome;

	@Column(name = "nr_documentoColaborador")
	private String documento;

	@Column(name = "cd_areaEstudo")
	private String areaEstudo;

	@Column(name = "cd_verificacao")
	private String verificado; // deve ser um boolean, resolver com um enum pois o hibernate não resolveu o
								// boolean

	@Column(name = "cd_senhaColaborador")
	private String senhaColaborador;

	@Column(name = "dt_dataUltimoLogin")
	private String ultimoLogin;

	public Colaborador() {
		super();
	}

	public Colaborador(Integer idColaborador, String documento, String nome, String areaEstudo, String verificado,
			String senhaColaborador, String ultimoLogin) {
		super();
		this.idColaborador = idColaborador;
		this.nome = nome;
		this.documento = documento;
		this.areaEstudo = areaEstudo;
		this.verificado = verificado;
		this.senhaColaborador = senhaColaborador;
		this.ultimoLogin = ultimoLogin;
	}

	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getAreaEstudo() {
		return areaEstudo;
	}

	public void setAreaEstudo(String areaEstudo) {
		this.areaEstudo = areaEstudo;
	}

	public String getVerificado() {
		return verificado;
	}

	public void setVerificado(String verificado) {
		this.verificado = verificado;
	}

	public String getSenhaColaborador() {
		return senhaColaborador;
	}

	public void setSenhaColaborador(String senhaColaborador) {
		this.senhaColaborador = senhaColaborador;
	}

	public String getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(String ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

}
