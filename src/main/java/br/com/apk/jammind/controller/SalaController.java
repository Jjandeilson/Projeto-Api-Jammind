package br.com.apk.jammind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.Sala;
import br.com.apk.jammind.service.SalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {

	@Autowired
	private SalaService salaService;
	
	@PostMapping("/novo")
	public ResponseEntity<HttpStatus> salvar(@RequestBody Sala sala){
		salaService.salvar(sala);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/buscar/{id}")
	public List<Sala> buscar(@PathVariable("id") Integer id){
		return salaService.buscarSala(id);
	}
	
	@DeleteMapping("/{idAluno}/remover")
	public void removerAluno(@PathVariable Integer idAluno) {
		salaService.revoverAluno(idAluno);
	}
	
	@PatchMapping("/novo")
	public ResponseEntity<HttpStatus> editarSala(@RequestBody Sala sala){
		salaService.editarSala(sala);
		return ResponseEntity.ok().build();
	}
}
