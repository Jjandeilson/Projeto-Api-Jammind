package br.com.apk.jammind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apk.jammind.model.Tarefa;
import br.com.apk.jammind.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	private TarefaService tarefaService;
	
	@GetMapping("{idTema}/tarefas/{idAluno}")
	public List<Tarefa> listaDeTarefa(@PathVariable Integer idTema, @PathVariable Integer idAluno){
		return tarefaService.listaDeTarefas(idTema, idAluno);
	}
	
	@PostMapping("{idTarefa}/resposta")
	public Boolean resposta(@PathVariable Integer idTarefa, @RequestBody Character opcao) {
		return tarefaService.responderTarefa(idTarefa, opcao);
	}
	
	@GetMapping("/historico/{idAluno}")
	public List<Tarefa> listarHisorico(@PathVariable Integer idAluno){
		return tarefaService.listarhistorico(idAluno);
	}
}
