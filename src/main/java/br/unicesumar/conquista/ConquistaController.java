	package br.unicesumar.conquista;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;


@RestController
@RequestMapping("/api/conquistas")
public class ConquistaController extends BaseController<Long, Conquista, ConquistaRepository>{
	

}



