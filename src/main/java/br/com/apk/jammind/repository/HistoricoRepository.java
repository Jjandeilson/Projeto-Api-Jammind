package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apk.jammind.model.Historico;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Integer>{

	@Query(value = "select h.id_historico, h.concluido, h.fk_id_tarefa, h.data_conclusao, h.fk_id_aluno from historico h inner join usuario u "
			+ "where h.fk_id_aluno = :idAluno and u.id_usuario = :idAluno", nativeQuery = true)
	List<Historico> hisotoricoTarefa(@Param("idAluno") Integer idAluno);
	
	@Query(value = "select h.concluido from historico h inner join usuario u on h.fk_id_aluno = :idAluno and u.id_usuario = :idAluno", nativeQuery = true)
	List<Boolean> tarefasConcluidas(@Param("idAluno") Integer idAluno);
}
