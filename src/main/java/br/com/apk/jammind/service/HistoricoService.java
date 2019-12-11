package br.com.apk.jammind.service;

import java.util.List;

import br.com.apk.jammind.model.Historico;

public interface HistoricoService {

	void salvarHistorico(Historico historico);
	List<Historico> listarTarefasConcluidas(Integer idAluno);
	List<Boolean> listarTarefasConcluidasAluno(Integer idAluno);
}
