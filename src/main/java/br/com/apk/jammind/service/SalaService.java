package br.com.apk.jammind.service;

import java.util.List;

import br.com.apk.jammind.model.Sala;

public interface SalaService {

	void salvar(Sala sala);
	List<Sala> buscarSala(Integer id);
	void revoverAluno(Integer idAluno);
	void editarSala(Sala sala);
	List<Sala> listarSalasDoAluno(Integer idUsuario);
}
