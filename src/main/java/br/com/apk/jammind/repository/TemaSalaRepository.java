package br.com.apk.jammind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.apk.jammind.model.TemaSala;

public interface TemaSalaRepository extends JpaRepository<TemaSala, Integer>{

	@Query(value = "select ts.fk_id_sala, ts.fk_id_tema, ts.ativo from tema_sala ts inner join tema t inner join sala s \r\n" + 
			"on t.id_tema = ts.fk_id_tema where s.id_sala = :idSala and ts.fk_id_sala = :idSala", nativeQuery = true)
	List<TemaSala> listaDeTemasDaSala(@Param("idSala") Integer idSala);
}
