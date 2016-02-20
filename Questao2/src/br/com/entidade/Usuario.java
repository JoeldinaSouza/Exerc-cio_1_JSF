package br.com.entidade;

public class Usuario {
	
	private String nome;
	private String nascimento;
	private int matricula;

	public Usuario() {
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return nascimento;
	}

	public void setData(String data) {
		this.nascimento = nascimento;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
