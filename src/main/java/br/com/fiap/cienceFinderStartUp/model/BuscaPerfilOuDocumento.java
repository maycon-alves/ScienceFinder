package br.com.fiap.cienceFinderStartUp.model;

import java.util.List;

public class BuscaPerfilOuDocumento {

	private List<Estudante> estudante;
	private List<Documento> documento;

	public BuscaPerfilOuDocumento() {
		super();
	}

	public BuscaPerfilOuDocumento(List<Estudante> estudante, List<Documento> documento) {
		super();
		this.estudante = estudante;
		this.documento = documento;
	}

	public List<Estudante> getEstudante() {
		return estudante;
	}

	public void setEstudante(List<Estudante> estudante) {
		this.estudante = estudante;
	}

	public List<Documento> getDocumento() {
		return documento;
	}

	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "BuscaPerfilOuDocumento [estudante=" + estudante + ", documento=" + documento + "]";
	}
}
