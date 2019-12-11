package br.com.apk.jammind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.Historico;
import br.com.apk.jammind.model.Tarefa;
import br.com.apk.jammind.repository.HistoricoRepository;
import br.com.apk.jammind.repository.TarefaRepository;

@Service
public class TarefaServiceIpml implements TarefaService{

	@Autowired
	private TarefaRepository tarefaRepository;

	@Autowired 
	private HistoricoRepository historicoRepository;
	
	@Override
	public List<Tarefa> listaDeTarefas(Integer idTema, Integer idAluno) {
		List<Tarefa> tarefas = tarefaRepository.listaDeTarefa(idTema);
		List<Historico> historicos = historicoRepository.hisotoricoTarefa(idAluno);
		for(int i = 0; i < historicos.size(); i++) {
			for(int j = 0; j < tarefas.size(); j++) {
				if(historicos.get(i).getTarefa().getIdTarefa() == tarefas.get(j).getIdTarefa()) {
					System.out.println(historicos.get(i).getTarefa().getIdTarefa());
					tarefas.get(j).setConcluido(historicos.get(i).getConcluido());
				}
			}
		}
		return tarefas;
	}

	@Override
	public Boolean responderTarefa(Integer idTarefa, Character opcao) {
		Tarefa tarefa = tarefaRepository.getOne(idTarefa);
		if(tarefa.getResposta().equals(opcao)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Tarefa> listarhistorico(Integer idAluno) {
		return tarefaRepository.listarHistorico(idAluno);
	}
}
