package br.com.apk.jammind.service;

import br.com.apk.jammind.model.AlunoMural;

public interface AlunoMuralService {

	void salvarTexto(AlunoMural alunoMural);
	AlunoMural buscarTexto(Integer idMural, Integer idAluno);
}
