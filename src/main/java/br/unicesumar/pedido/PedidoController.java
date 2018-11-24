	package br.unicesumar.pedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
	@Autowired
	private PedidoRepository repo;

	//curl -X GET http://localhost:9091/api/pedidos
	@GetMapping
	public List<Pedido> getPedidos() {
		return repo.findAll();
	}
	
	//curl -X POST http://localhost:9091/api/produtos -H "Content-Type: application/json" -d '{"codigo": "100", "nome": "Omo Progress", "preco": 17.78}'
	@PostMapping
	public Long postPedido(@RequestBody Pedido novo) {
		repo.save(novo);
		return novo.getId();
	}
	
	//curl -X DELETE http://localhost:9091/api/pedidos/800d8fce-e302-4702-b974-8405f662c0bd	
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable("id") Long id) {
		repo.deleteById(id);		
	}
	
	//curl -X GET http://localhost:9091/api/pedidos/800d8fce-e302-4702-b974-8405f662c0bd	
	@GetMapping("/{id}")
	public Pedido getPedidoPeloId(@PathVariable("id") Long id) {
		return repo.findById(id).get();		
	}
	

}



