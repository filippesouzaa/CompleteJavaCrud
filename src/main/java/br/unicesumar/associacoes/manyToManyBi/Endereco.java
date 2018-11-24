package br.unicesumar.associacoes.manyToManyBi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="EnderecoMMBI")
@Table(name="endereco_mmbi")
public class Endereco extends BaseEntityStringId {
	@ManyToMany
	private List<Pessoa> pessoas;
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

}
