package br.com.apk.jammind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.Tema;
import br.com.apk.jammind.service.TemaService;

@RestController
@RequestMapping("/temas")
public class TemaController {

	@Autowired
	private TemaService temaService;
	
	@GetMapping("/listar")
	public List<Tema> buscarTema(){
		return temaService.buscarTemas();
	}
	
	@GetMapping("/{id}/temas")
	public List<Tema> listar(@PathVariable("id") Integer id){
		return temaService.listaDeTemasSalas(id);
	}
	
	@PutMapping("/{idSala}/{idTema}/ativa")
	public ResponseEntity<Tema> ativarTema(@PathVariable("idSala") Integer idSala, @PathVariable("idTema") Integer idTema){
		temaService.ativarTema(idSala, idTema);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{idSala}/{idTema}/desativa")
	public ResponseEntity<Tema> desativar(@PathVariable("idSala") Integer idSala, @PathVariable("idTema") Integer idTema){
		temaService.desativarTema(idSala, idTema);
		return ResponseEntity.ok().build();
	}
}
