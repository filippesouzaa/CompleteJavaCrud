package br.unicesumar.associacoes.uniPessoaParaEndereco;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.unicesumar.base.BaseEntityStringId;

@Entity(name="EnderecoPPE")
@Table(name="endereco_ppe")
public class Endereco extends BaseEntityStringId {

}
