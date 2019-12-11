package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.apk.jammind.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

	@Query(value = "select t.id_tarefa, t.nome_tarefa, t.nome_pergunta, t.opcao_a, t.opcao_b, t.opcao_c,t.opcao_d,t.resposta\r\n" + 
			" from tarefa t inner join tema tm on t.fk_id_tema = :idTema and tm.id_tema = :idTema", nativeQuery = true)
	List<Tarefa> listaDeTarefa(@Param("idTema") Integer idTema);
	
	@Query(value = "select f.id_tarefa, nome_tarefa, f.nome_pergunta, f.opcao_a, f.opcao_b, f.opcao_c, f.opcao_d,\r\n" + 
			"f.resposta, f.fk_id_tema from tarefa f inner join historico h on f.id_tarefa = h.fk_id_tarefa\r\n" + 
			"inner join usuario u on h.fk_id_aluno = :idAluno and u.id_usuario = :idAluno", nativeQuery = true)
	List<Tarefa> listarHistorico(@Param("idAluno") Integer idAluno);
}
