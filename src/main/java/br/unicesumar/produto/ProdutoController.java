	package br.unicesumar.produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController extends BaseController<String, Produto, ProdutoRepository>{

}



