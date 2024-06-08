package br.com.fiap.cienceFinderStartUp.model;

import java.util.List;

public class Perfil {

	private Estudante estudante;

	private List<Documento> documento;

	public Perfil() {
		super();
	}

	public Perfil(Estudante estudante, List<Documento> documento) {
		super();
		this.estudante = estudante;
		this.documento = documento;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
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
		return "Perfil [estudante=" + estudante + ", documento=" + documento + "]";
	}

}
