package br.com.apk.jammind.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apk.jammind.model.Tema;
import br.com.apk.jammind.model.TemaSala;
import br.com.apk.jammind.repository.TemaRepository;
import br.com.apk.jammind.repository.TemaSalaRepository;

@Service
public class TemaServiceIpml implements TemaService{
	
	@Autowired
	private TemaRepository temaRepository;
	
	@Autowired
	private TemaSalaRepository temaSalaRepository;

	@Override
	public List<Tema> buscarTemas() {
		return temaRepository.findAll();
	}

	@Override
	public List<Tema> listaDeTemasSalas(Integer idSala) {
		Tema tema;
		List<Tema> retorno = new ArrayList<Tema>();
		List<Tema> listaTema = temaRepository.listaDeTemas(idSala);
		List<TemaSala> temasSalas = temaSalaRepository.listaDeTemasDaSala(idSala);
		for(int i = 0; i < listaTema.size(); i++) {
			tema = listaTema.get(i);
			tema.setAtivo(temasSalas.get(i).isAtivo());
			retorno.add(tema);
		}
		return retorno;
	}

	@Override
	public void ativarTema(Integer idSala, Integer idTema) {
		temaRepository.ativarTema(idSala, idTema);
	}

	@Override
	public void desativarTema(Integer idSala, Integer idTema) {
		temaRepository.desativarTema(idSala, idTema);
	}

}
