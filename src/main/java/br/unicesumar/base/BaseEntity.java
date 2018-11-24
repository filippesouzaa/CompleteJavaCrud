package br.unicesumar.base;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity<ID> {
	
	public abstract ID getId();
	
	public abstract void setId(ID id);

}
