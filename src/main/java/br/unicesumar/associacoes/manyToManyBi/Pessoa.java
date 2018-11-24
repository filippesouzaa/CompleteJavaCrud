package br.unicesumar.associacoes.manyToManyBi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="PessoaMMBI")
@Table(name="pessoa_mmbi")
public class Pessoa extends BaseEntityStringId {
	@ManyToMany(mappedBy="pessoas")
	private List<Endereco> enderecos;
	
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	

}
