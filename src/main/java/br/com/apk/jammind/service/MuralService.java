package br.com.apk.jammind.service;

import br.com.apk.jammind.model.Mural;

public interface MuralService {
	
	Mural buscarMural(Integer idTema, Integer idAluno);
}
