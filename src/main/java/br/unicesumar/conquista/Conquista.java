package br.unicesumar.conquista;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.unicesumar.base.BaseEntityLongId;
import br.unicesumar.fase.Fase;
import br.unicesumar.jogador.Jogador;

@Entity
public class Conquista extends BaseEntityLongId {
	@Temporal(TemporalType.DATE)
	private Date dia;
	
	private Integer nivel;
	
	@ManyToOne
	private Jogador jogador;
	
	@ManyToOne
	private Fase fase;

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}
	
	


}
