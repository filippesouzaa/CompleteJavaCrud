package br.unicesumar.pedido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private Integer numero;
	@Temporal(TemporalType.DATE)
	private Date emissao;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pedido_id")
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public Pedido() {
	}
	
	public Pedido(Integer numero, Date emissao) {
		this();
		this.numero = numero;
		this.emissao = emissao;
	}
	
	public void addItemPedido(ItemPedido it) {
		this.itens.add(it);
	}
	
	public List<ItemPedido> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getEmissao() {
		return emissao;
	}
	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}
	
	
	
	

}
