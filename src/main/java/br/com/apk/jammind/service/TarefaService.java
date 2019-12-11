package br.com.apk.jammind.service;

import java.util.List;

import br.com.apk.jammind.model.Tarefa;

public interface TarefaService {

	List<Tarefa> listaDeTarefas(Integer idTema, Integer idAluno);
	Boolean responderTarefa(Integer idTarefa, Character opcao);
	List<Tarefa> listarhistorico(Integer idAluno);
}
