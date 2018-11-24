package br.unicesumar.pedido;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.produto.Produto;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private BigDecimal valor;
	private BigDecimal quantidade;
	private BigDecimal percentualDeDesconto;
	
	@ManyToOne
	private Produto produto;
	
	public ItemPedido() {
	}
	
	public ItemPedido(BigDecimal valor, BigDecimal quantidade, BigDecimal percentualDeDesconto, Produto produto) {
		this();
		this.valor = valor;
		this.quantidade = quantidade;
		this.percentualDeDesconto = percentualDeDesconto;
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPercentualDeDesconto() {
		return percentualDeDesconto;
	}
	public void setPercentualDeDesconto(BigDecimal percentualDeDesconto) {
		this.percentualDeDesconto = percentualDeDesconto;
	}
	
	

}
