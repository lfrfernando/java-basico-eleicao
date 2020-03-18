package br.fai.eleicao;


public class Candidatos {
	
	
	protected int id;
	protected String nome;
	
	public void primeiroCandidato(String nome) {
		setNome("joão");
	}
	
	public void  primeiroCandidato(int id) {
		setId(1234);
	}


	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}






