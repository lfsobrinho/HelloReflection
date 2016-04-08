package br.univel.enums;

public enum Uf {
	
	PR(4, "Paran�"),
	SC(5, "Santa Catarina"),
	RS(6, "Rio Grande do Sul");
	
	private int id;
	private String nome;
	
	private Uf(int _id , String _nome){
		this.id = _id;
		this.nome = _nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}

