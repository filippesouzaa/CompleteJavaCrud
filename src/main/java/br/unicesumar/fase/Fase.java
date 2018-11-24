package br.unicesumar.fase;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.unicesumar.base.BaseEntityStringId;

@Entity
public class Fase extends BaseEntityStringId {
	private Integer numero;
	private String descricao;

	public Fase() {
		super();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	


}
