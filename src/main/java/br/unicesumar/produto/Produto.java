package br.unicesumar.produto;

import java.math.BigDecimal;

import javax.persistence.Entity;

import br.unicesumar.base.BaseEntityStringId;

@Entity
public class Produto extends BaseEntityStringId {
	private String codigo;
	private BigDecimal preco;
	private String descricao;

	public Produto() {
		super();
	}

	public Produto(String codigo, BigDecimal preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	


}
