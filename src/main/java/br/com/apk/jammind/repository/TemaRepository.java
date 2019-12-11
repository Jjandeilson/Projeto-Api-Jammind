package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.apk.jammind.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer>{

	@Query(value="select t.id_tema, t.nome_tema, t.descricao_tema from tema t inner join sala s inner join tema_sala ts\r\n" + 
			"on t.id_tema = ts.fk_id_tema  where s.id_sala = :idSala and ts.fk_id_sala = :idSala", nativeQuery = true)
	List<Tema> listaDeTemas(@Param("idSala") Integer idSala);
	
	@Transactional
	@Modifying
	@Query(value = "update tema_sala set ativo = true where fk_id_sala = :idSala and fk_id_tema = :idTema"
			, nativeQuery = true)
	void ativarTema(@Param("idSala") Integer idSala, @Param("idTema") Integer idTema);
	
	@Transactional
	@Modifying
	@Query(value = "update tema_sala set ativo = false where fk_id_sala = :idSala and fk_id_tema = :idTema"
			, nativeQuery = true)
	void desativarTema(@Param("idSala") Integer idSala, @Param("idTema") Integer idTema);
}
