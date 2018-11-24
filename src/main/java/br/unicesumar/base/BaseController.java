package br.unicesumar.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class BaseController<TIPO_DO_ID, ENTITY extends BaseEntity<TIPO_DO_ID>, REPOSITORY extends JpaRepository<ENTITY, TIPO_DO_ID>> {
	@Autowired
	private REPOSITORY repo;
	
	
	@GetMapping
	public List<ENTITY> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public TIPO_DO_ID post(@RequestBody ENTITY novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") TIPO_DO_ID id) {
		repo.deleteById(id);		
	}
	
	@GetMapping("/{id}")
	public ENTITY getPeloId(@PathVariable("id") TIPO_DO_ID id) {
		return repo.findById(id).get();		
	}


}
