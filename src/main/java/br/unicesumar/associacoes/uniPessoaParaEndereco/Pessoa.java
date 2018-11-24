package br.unicesumar.associacoes.uniPessoaParaEndereco;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="PessoaPPE")
@Table(name="pessoa_ppe")
public class Pessoa extends BaseEntityStringId {
	
	@OneToMany
	@JoinColumn(name="pessoa_id")
	private List<Endereco> enderecos;
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

}
