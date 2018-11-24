package br.unicesumar.associacoes.uniEnderecoParaPessoa;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="EnderecoEPP")
@Table(name="endereco_epp")
public class Endereco extends BaseEntityStringId {

	@ManyToOne
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

}
