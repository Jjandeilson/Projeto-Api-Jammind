package br.com.apk.jammind.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.Sala;
import br.com.apk.jammind.model.Usuario;
import br.com.apk.jammind.repository.SalaRepository;
import br.com.apk.jammind.repository.TemaRepository;
import br.com.apk.jammind.repository.UsuarioRepository;

@Service
public class SalaServiceIpml implements SalaService{
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private TemaRepository temaRepository;

	@Override
	public void salvar(Sala sala) {
		int codigo = (int) Math.round(Math.random() * 10000);
		Usuario usuario = usuarioRepository.getOne(sala.getIdUsuario());
		Sala salaBanco = salaRepository.findByCodigoSala(sala.getCodigoSala());
		sala.setUsuarios(Arrays.asList(usuario));
		sala.setTemas(temaRepository.findAll());
		
		if(salaBanco == null) {
			sala.setCodigoSala("JAM" + String.valueOf(codigo));
			salaRepository.save(sala);
		}else if(sala.getCodigoSala().equals(salaBanco.getCodigoSala())) {
			while(sala.getCodigoSala().equals(salaBanco.getCodigoSala())) {
				codigo = (int) Math.round(Math.random() * 10000);
			}
		}else {
			sala.setCodigoSala("JAM" + String.valueOf(codigo));
			salaRepository.save(sala);
		}
	}

	@Override
	public List<Sala> buscarSala(Integer id) {
		return salaRepository.buscarSalas(id);
	}

	@Override
	public void revoverAluno(Integer idAluno) {
		salaRepository.removerAluno(idAluno);		
	}

	@Override
	public void editarSala(Sala sala) {
		Sala salaBanco = salaRepository.getOne(sala.getIdSala());
		BeanUtils.copyProperties(sala, salaBanco, "codigoSala","usuarios", "temas");
		salaRepository.save(salaBanco);		
	}

	@Override
	public List<Sala> listarSalasDoAluno(Integer idUsuario) {
		return salaRepository.listarSalasDoUsuario(idUsuario);
	}

}
