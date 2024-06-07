package br.com.fiap.cienceFinderStartUp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_documento")
public class Documento {

	@Id
	@SequenceGenerator(name = "documento", sequenceName = "sq_tb_documento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documento")
	@Column(name = "id_identificadorDocumento")
	private Integer idDocumento;
	
	@Column(name= "nm_autor")
	private String autor;

	@Column(name = "cd_areaEstudo")
	private String areaEstudoDocumento;

	@Column(name = "nm_nomeDocumento")
	private String nomeDocumento;

	@Column(name = "ds_propostaEstudo")
	private String propostaEstudo;

	@Column(name = "cd_documentoVerificado")
	private String documentoVerificado; // deve ser um boolean, resolver com um enum pois o hibernate não resolveu o boolean

//	@OneToOne(mappedBy = "documento")
//	private DocumentoDetalhe documentoDetalhe;

	public Documento() {
		super();
	}

	public Documento(Integer idDocumento, String autor, String areaEstudoDocumento, String nomeDocumento, String propostaEstudo,
			String documentoVerificado) {
		super();
		this.idDocumento = idDocumento;
		this.autor = autor;	
		this.areaEstudoDocumento = areaEstudoDocumento;
		this.nomeDocumento = nomeDocumento;
		this.propostaEstudo = propostaEstudo;
		this.documentoVerificado = documentoVerificado;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getAreaEstudoDocumento() {
		return areaEstudoDocumento;
	}

	public void setAreaEstudoDocumento(String areaEstudoDocumento) {
		this.areaEstudoDocumento = areaEstudoDocumento;
	}

	public String getNomeDocumento() {
		return nomeDocumento;
	}

	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}

	public String getPropostaEstudo() {
		return propostaEstudo;
	}

	public void setPropostaEstudo(String propostaEstudo) {
		this.propostaEstudo = propostaEstudo;
	}

	public String getDocumentoVerificado() {
		return documentoVerificado;
	}

	public void setDocumentoVerificado(String documentoVerificado) {
		this.documentoVerificado = documentoVerificado;
	}

//	public DocumentoDetalhe getDocumentoDetalhe() {
//		return documentoDetalhe;
//	}
//
//	public void setDocumentoDetalhe(DocumentoDetalhe documentoDetalhe) {
//		this.documentoDetalhe = documentoDetalhe;
//	}

}
