package br.com.apk.jammind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.AlunoMural;
import br.com.apk.jammind.service.AlunoMuralService;

@RestController
@RequestMapping("/texto")
public class AlunoMuralController {

	@Autowired
	private AlunoMuralService alunoMuralService;
	
	@PostMapping("/salvar")
	public ResponseEntity<HttpStatus> salvarTexto(@RequestBody AlunoMural alunoMural){
		alunoMuralService.salvarTexto(alunoMural);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/buscar/{idMural}/{idAluno}")
	public AlunoMural buscarTexto(@PathVariable Integer idMural, @PathVariable Integer idAluno) {
		return alunoMuralService.buscarTexto(idMural, idAluno);
	}
}
