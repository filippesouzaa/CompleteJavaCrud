	package br.unicesumar.jogador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;


@RestController
@RequestMapping("/api/jogadores")
public class JogadorController extends BaseController<String, Jogador, JogadorRepository>{
	

}



