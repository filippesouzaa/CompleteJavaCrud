	package br.unicesumar.fase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.base.BaseController;


@RestController
@RequestMapping("/api/fases")
public class FaseController extends BaseController<String, Fase, FaseRepository>{

}



