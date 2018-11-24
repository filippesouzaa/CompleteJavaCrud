package br.unicesumar.jogador;

import javax.persistence.Entity;

import br.unicesumar.base.BaseEntityStringId;

@Entity
public class Jogador extends BaseEntityStringId {
	private String nome;

	public Jogador() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	


}
