package br.com.apk.jammind.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.apk.jammind.model.Usuario;
import br.com.apk.jammind.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/novo")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario, HttpServletResponse response){
		Usuario usuarioSalvo = usuarioService.Salvar(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(usuario.getIdUsuario()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
	}

	@PostMapping("/buscar")
	public Usuario buscar(@RequestBody Usuario usuario){
		return usuarioService.buscar(usuario);	
	}
	
	@PatchMapping("{id}/sala")
	public ResponseEntity<Usuario> salvarNaSala(@PathVariable("id") Integer id, @RequestBody Usuario usuario){
		usuarioService.salvarNaSala(id, usuario);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}/alunos")
	public List<Usuario> listaDeAluno(@PathVariable("id") Integer idSala){
		return usuarioService.listaDeAluno(idSala);
	}
}
