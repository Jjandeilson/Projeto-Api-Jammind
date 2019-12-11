package br.com.apk.jammind.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mural")
public class Mural {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mural")
	private Integer idMural;
	
	@Column(name = "nome_mural")
	private String nomeMural;
	
	@Column(name = "titulo_mural")
	private String tituloMural;
	
	@Transient
	private String textoAluno;
	
	@ManyToMany
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Usuario> usuario = new ArrayList<Usuario>();

	public Integer getIdMural() {
		return idMural;
	}

	public void setIdMural(Integer idMural) {
		this.idMural = idMural;
	}

	public String getNomeMural() {
		return nomeMural;
	}

	public void setNomeMural(String nomeMural) {
		this.nomeMural = nomeMural;
	}

	public String getTituloMural() {
		return tituloMural;
	}

	public void setTituloMural(String tituloMural) {
		this.tituloMural = tituloMural;
	}

	public String getTextoAluno() {
		return textoAluno;
	}

	public void setTextoAluno(String textoAluno) {
		this.textoAluno = textoAluno;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMural == null) ? 0 : idMural.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mural other = (Mural) obj;
		if (idMural == null) {
			if (other.idMural != null)
				return false;
		} else if (!idMural.equals(other.idMural))
			return false;
		return true;
	}
	
}
