package br.unicesumar.base;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntityStringId extends BaseEntity<String> {
	@Id
	private String id;
	
	
	public BaseEntityStringId() {
		this.setId(UUID.randomUUID().toString());
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	

}
