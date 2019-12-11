package br.com.apk.jammind.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.Historico;
import br.com.apk.jammind.repository.HistoricoRepository;

@Service
public class HistoricoServiceIpml implements HistoricoService{

	@Autowired
	private HistoricoRepository historicoRepository;

	@Override
	public void salvarHistorico(Historico historico) {
		historico.setDataConclusao(LocalDate.now());
		historicoRepository.save(historico);		
	}

	@Override
	public List<Historico> listarTarefasConcluidas(Integer idAluno) {
		return historicoRepository.hisotoricoTarefa(idAluno);
	}

	@Override
	public List<Boolean> listarTarefasConcluidasAluno(Integer idAluno) {
		return historicoRepository.tarefasConcluidas(idAluno);
	}
}
