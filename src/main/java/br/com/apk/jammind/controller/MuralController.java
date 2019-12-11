package br.com.apk.jammind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.Mural;
import br.com.apk.jammind.service.MuralService;

@RestController
@RequestMapping("/murais")
public class MuralController {

	@Autowired
	private MuralService muralService;
	
//	@GetMapping("/{idTema}")
//	public Mural buscarMural(@PathVariable Integer idTema) {
//		return muralService.buscarMural(idTema);
//	}
	
	@GetMapping("/buscar/{idTema}/{idAluno}")
	public Mural buscarMural(@PathVariable Integer idTema, @PathVariable Integer idAluno) {
		return muralService.buscarMural(idTema, idAluno);
	}
}
