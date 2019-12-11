package br.com.apk.jammind.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="sala")
public class Sala implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_sala")
	private Integer idSala;
	
	private String titulo;
	private String serie;
	private String descricao;
	
	@Column(name="codigo_sala")
	private String codigoSala;

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToMany
	@JoinTable(name="sala_usuario", joinColumns=@JoinColumn(name="fk_id_sala"),
			inverseJoinColumns=@JoinColumn(name="fk_id_usuario"))
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@Transient
	private Integer idUsuario;
	
	@ManyToMany
	@JoinTable(name = "tema_sala",joinColumns=@JoinColumn(name = "fk_id_sala"),
			inverseJoinColumns=@JoinColumn(name = "fk_id_tema"))
	private List<Tema> temas = new ArrayList<Tema>();

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoSala() {
		return codigoSala;
	}

	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public List<Tema> getTemas() {
		return temas;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSala == null) ? 0 : idSala.hashCode());
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
		Sala other = (Sala) obj;
		if (idSala == null) {
			if (other.idSala != null)
				return false;
		} else if (!idSala.equals(other.idSala))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", titulo=" + titulo + ", serie=" + serie + ", descricao=" + descricao
				+ ", codigoSala=" + codigoSala + ", usuarios=" + usuarios + ", idUsuario=" + idUsuario + ", temas="
				+ temas + "]";
	}
}
