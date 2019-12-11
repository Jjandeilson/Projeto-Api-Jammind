package br.com.apk.jammind.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.Sala;
import br.com.apk.jammind.model.Usuario;
import br.com.apk.jammind.repository.SalaRepository;
import br.com.apk.jammind.repository.UsuarioRepository;

@Service
public class UsuarioServiceIpml implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private SalaRepository salaRepository;

	@Override //salvando usuario no banco de dados
	public Usuario Salvar(Usuario usuario) {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			data = sdf.parse(usuario.getConverteData());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		usuario.setDataNascimento(data);
		Usuario usuarioBanco = usuarioRepository.save(usuario);
		
		return usuarioBanco;
	}

	@Override //busca usuario pelo email e senha
	public Usuario buscar(Usuario usuario) {
		return usuarioRepository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
	}
	
	@Override
	public void salvarNaSala(Integer idSala, Usuario idUsuario) {
		List<Sala> salas = new ArrayList<Sala>();
		Usuario usuario = new Usuario();
		Sala sala = new Sala();
		
		usuario = usuarioRepository.getOne(idSala);
		sala = salaRepository.findByCodigoSala(idUsuario.getCodigoSala());
		System.out.println(sala.getCodigoSala());
		salas = salaRepository.listarSalasDoUsuario(idSala);
	
		if(sala != null) {
			for(Sala s: salas) {
				if(s.getIdSala() == sala.getIdSala()) {
					System.out.println("Sim");
				}else {
					System.out.println("Não");
				}
			}
		}
		salas.add(sala);
		
		if(salas.size() > 0) {
			usuario.setSalas(salas);
			usuarioRepository.save(usuario);
		}
	}

	@Override
	public List<Usuario> listaDeAluno(Integer idSala) {
		return usuarioRepository.listaDeAlunos(idSala);
	}
}
