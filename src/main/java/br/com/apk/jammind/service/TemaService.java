package br.com.apk.jammind.service;

import java.util.List;

import br.com.apk.jammind.model.Tema;

public interface TemaService {

	List<Tema> buscarTemas();
	List<Tema> listaDeTemasSalas(Integer idSala);
	void ativarTema(Integer idSala, Integer idTema);
	void desativarTema(Integer idSala, Integer idTema);
}
