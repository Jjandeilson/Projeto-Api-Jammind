package br.com.apk.jammind.service;

import java.util.List;

import br.com.apk.jammind.model.Usuario;

public interface UsuarioService {

	Usuario Salvar(Usuario usuario);
	Usuario buscar(Usuario usuario);
	void salvarNaSala(Integer idUsuario, Usuario codigoSala);
	List<Usuario> listaDeAluno(Integer idSala);
}
