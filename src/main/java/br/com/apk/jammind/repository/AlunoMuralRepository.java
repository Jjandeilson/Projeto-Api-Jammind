package br.com.apk.jammind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apk.jammind.model.AlunoMural;

@Repository
public interface AlunoMuralRepository extends JpaRepository<AlunoMural, Integer>{
	
	@Query(value="select m.id_aluno_mural, m.fk_id_mural, m.fk_id_usuario, m.texto_aluno from aluno_mural m inner join mural mu\r\n" + 
			"on m.fk_id_mural = :idMural and mu.id_mural = :idMural inner join usuario u \r\n" + 
			"on u.id_usuario = :idAluno and m.fk_id_usuario = :idAluno", nativeQuery = true)
	AlunoMural buscarTexto(@Param("idMural") Integer idMural, @Param("idAluno") Integer idAluno);
}
