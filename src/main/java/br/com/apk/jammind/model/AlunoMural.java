package br.com.apk.jammind.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Table(name = "aluno_mural")
@Entity
public class AlunoMural {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno_mural")
	private Integer idAlunoMural;

	@ManyToOne
	@JoinColumn(name = "fk_id_usuario")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_mural")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Mural mural;
	
	@Column(name  = "texto_aluno")
	private String textoAluno;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public String getTextoAluno() {
		return textoAluno;
	}

	public void setTextoAluno(String textoAluno) {
		this.textoAluno = textoAluno;
	}

}
