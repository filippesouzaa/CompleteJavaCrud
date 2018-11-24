package br.unicesumar.associacoes.bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="PessoaBI")
@Table(name="pessoa_bi")
public class Pessoa extends BaseEntityStringId {
	@OneToMany(mappedBy="pessoa")
	private List<Endereco> enderecos;
	
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	

}
