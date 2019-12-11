package br.com.apk.jammind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.AlunoMural;
import br.com.apk.jammind.model.Mural;
import br.com.apk.jammind.repository.AlunoMuralRepository;
import br.com.apk.jammind.repository.MuralRepository;

@Service
public class MuralServiceIpml implements MuralService{
	
	@Autowired
	private MuralRepository muralRepository;
	
	@Autowired
	private AlunoMuralRepository alunoMuralRepository;

	@Override
	public Mural buscarMural(Integer idTema, Integer idAluno) {
		Mural mural = muralRepository.buscarMural(idTema);
		AlunoMural alunoMural = alunoMuralRepository.buscarTexto(idTema, idAluno);
		if(alunoMural == null) {
			mural.setTextoAluno("");
		}else {			
			mural.setTextoAluno(alunoMural.getTextoAluno());
		}
		return mural;
	}

//	@Override
//	public Mural buscarMural(Integer idTema) {
//		return muralRepository.buscarMural(idTema);
//	}
	
}
