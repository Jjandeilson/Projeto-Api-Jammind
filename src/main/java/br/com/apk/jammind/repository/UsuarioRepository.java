package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apk.jammind.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByEmailAndSenha(String email, String senha);
	
	@Query(value = "select u.id_usuario, u.nome, u.sobrenome, u.data_nascimento, u.cidade, "
			+ "u.estado, u.email, u.senha, u.tipo_usuario from usuario u inner join sala_usuario su\r\n" + 
			"on u.id_usuario = su.fk_id_usuario where su.fk_id_sala = :idSala and u.tipo_usuario = 'ALUNO'", nativeQuery = true)
	List<Usuario> listaDeAlunos(@Param("idSala") Integer idSala);
}
