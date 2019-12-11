package br.com.apk.jammind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.Historico;
import br.com.apk.jammind.service.HistoricoService;

@RestController
@RequestMapping("/historicos")
public class HistoricoController {

	@Autowired
	private HistoricoService historicoService;
	
	@PostMapping("/salvar")
	public ResponseEntity<HttpStatus> salvarHistorico(@RequestBody Historico historico){
		historicoService.salvarHistorico(historico);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("tarefas/{idAluno}")
	public List<Historico> listarTarefasConcluidas(@PathVariable Integer idAluno){
		return historicoService.listarTarefasConcluidas(idAluno);
	}
	
	@GetMapping("/concluidos/{idAluno}")
	public List<Boolean> listarTarefasCincluidasAluno(@PathVariable Integer idAluno){
		return historicoService.listarTarefasConcluidasAluno(idAluno);
	}
}
