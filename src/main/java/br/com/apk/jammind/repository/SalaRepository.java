package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.apk.jammind.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer>{

	Sala findByCodigoSala(String codigoSala);
	
	@Query(value = "select s.codigo_sala, s.titulo, s.serie, s.descricao, s.id_sala from sala s "
			+ "inner join usuario u inner join sala_usuario su\r\n" + 
			"on s.id_sala = su.fk_id_sala where u.id_Usuario = :id and su.fk_id_Usuario = :id", nativeQuery = true)
	List<Sala> buscarSalas(@Param("id") Integer idUsuario);
	
	@Modifying
	@Transactional
	@Query(value = "delete from sala_usuario where fk_id_usuario = :idAluno", nativeQuery = true)
	void removerAluno(@Param("idAluno") Integer idAluno);
	
	@Query(value="select s.* from sala s inner join sala_usuario su \r\n" + 
			"on s.id_sala = su.fk_id_sala\r\n" + 
			"inner join usuario usu on usu.id_usuario = :idUsuario and su.fk_id_usuario = :idUsuario", nativeQuery = true)
	List<Sala> listarSalasDoUsuario(@Param("idUsuario") Integer idUsuario);
}
