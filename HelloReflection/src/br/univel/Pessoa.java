package br.univel;

import br.univel.anotation.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;

@Tabela("cad_pessoa")
public class Pessoa {
	
	//@Tabela("oi") nao pode por causa do Target na annotation Tabela
	private int id;
	private String Nome;
	private EstadoCivil estadoCivil;
	private Uf uf;

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}
