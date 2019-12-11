package br.com.apk.jammind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apk.jammind.model.Mural;

@Repository
public interface MuralRepository extends JpaRepository<Mural, Integer>{

//	@Query(value = "select m.id_aluno_mural,m.fk_id_usuario, m.fk_id_mural, m.texto_aluno  from aluno_mural m inner join mural mu\r\n" + 
//			"on m.fk_id_mural = 1 and mu.id_mural = 1\r\n" + 
//			"inner join usuario u on m.fk_id_usuario = 2 and u.id_usuario = 2", nativeQuery = true)
//	Mural buscarMural(@Param("idTema") Integer idTema);
	
	@Query(value = "select m.id_mural, m.nome_mural, m.titulo_mural, m.fk_id_tema from mural m\r\n" + 
			"inner join tema t on m.fk_id_tema = :idTema and t.id_tema = :idTema", nativeQuery = true)
	Mural buscarMural(@Param("idTema") Integer idTema);
}
