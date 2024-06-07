package br.com.fiap.cienceFinderStartUp.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_documento_detalhe")
public class DocumentoDetalhe {

	@Id
	@SequenceGenerator(name = "documentoDetalhe", sequenceName = "sq_tb_documentoDetalhe", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documentoDetalhe")
	@Column(name = "id_detalhe")
	private Integer idDocumentoDetalhe;

	@Column(name = "dt_dataCriacao")
	private Calendar dataCriacaoDocumento;

	@Column(name = "dt_dataModificacao")
	private Calendar dataModificacaoDocumento;

	@Column(name = "dt_dataDesabilitacao")
	private Calendar dataDesabilitacaoDocumento;

	@Column(name = "qt_acessos")
	private Integer quantidadeAcesso;

	@OneToOne
	@JoinColumn(name = "id_identificadorDocumento")
	private Documento documento;

	public DocumentoDetalhe() {
		super();
	}

	public DocumentoDetalhe(Integer idDocumentoDetalhe, Calendar dataCriacaoDocumento,
			Calendar dataModificacaoDocumento, Calendar dataDesabilitacaoDocumento, Integer quantidadeAcesso) {
		super();
		this.idDocumentoDetalhe = idDocumentoDetalhe;
		this.dataCriacaoDocumento = dataCriacaoDocumento;
		this.dataModificacaoDocumento = dataModificacaoDocumento;
		this.dataDesabilitacaoDocumento = dataDesabilitacaoDocumento;
		this.quantidadeAcesso = quantidadeAcesso;
	}

	public Integer getIdDocumentoDetalhe() {
		return idDocumentoDetalhe;
	}

	public void setIdDocumentoDetalhe(Integer idDocumentoDetalhe) {
		this.idDocumentoDetalhe = idDocumentoDetalhe;
	}

	public Calendar getDataCriacaoDocumento() {
		return dataCriacaoDocumento;
	}

	public void setDataCriacaoDocumento(Calendar dataCriacaoDocumento) {
		this.dataCriacaoDocumento = dataCriacaoDocumento;
	}

	public Calendar getDataModificacaoDocumento() {
		return dataModificacaoDocumento;
	}

	public void setDataModificacaoDocumento(Calendar dataModificacaoDocumento) {
		this.dataModificacaoDocumento = dataModificacaoDocumento;
	}

	public Calendar getDataDesabilitacaoDocumento() {
		return dataDesabilitacaoDocumento;
	}

	public void setDataDesabilitacaoDocumento(Calendar dataDesabilitacaoDocumento) {
		this.dataDesabilitacaoDocumento = dataDesabilitacaoDocumento;
	}

	public Integer getQuantidadeAcesso() {
		return quantidadeAcesso;
	}

	public void setQuantidadeAcesso(Integer quantidadeAcesso) {
		this.quantidadeAcesso = quantidadeAcesso;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}
