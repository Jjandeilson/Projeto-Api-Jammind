package br.com.apk.jammind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.AlunoMural;
import br.com.apk.jammind.repository.AlunoMuralRepository;

@Service
public class AlunoMuralServiceIpml implements AlunoMuralService{
	
	@Autowired
	private AlunoMuralRepository alunoMuralRepository;

	@Override
	public void salvarTexto(AlunoMural alunoMural) {
		alunoMuralRepository.save(alunoMural);		
	}

	@Override
	public AlunoMural buscarTexto(Integer idMural, Integer idAluno) {
		return alunoMuralRepository.buscarTexto(idMural, idAluno);
	}

}
