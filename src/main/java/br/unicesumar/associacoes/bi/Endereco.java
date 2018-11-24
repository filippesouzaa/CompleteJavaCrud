package br.unicesumar.associacoes.bi;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="EnderecoBI")
@Table(name="endereco_bi")
public class Endereco extends BaseEntityStringId {
	@ManyToOne
	private Pessoa pessoa;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}

}
