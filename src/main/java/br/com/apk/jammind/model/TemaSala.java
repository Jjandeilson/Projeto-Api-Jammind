package br.com.apk.jammind.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tema_sala")
public class TemaSala implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "fk_id_tema")
	private Integer FkIdTema;
	
	@Column(name = "fk_id_sala")
	private Integer FkIdSala;
	
	private boolean ativo;

	public Integer getFkIdTema() {
		return FkIdTema;
	}

	public void setFkIdTema(Integer fkIdTema) {
		FkIdTema = fkIdTema;
	}

	public Integer getFkIdSala() {
		return FkIdSala;
	}

	public void setFkIdSala(Integer fkIdSala) {
		FkIdSala = fkIdSala;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FkIdTema == null) ? 0 : FkIdTema.hashCode());
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
		TemaSala other = (TemaSala) obj;
		if (FkIdTema == null) {
			if (other.FkIdTema != null)
				return false;
		} else if (!FkIdTema.equals(other.FkIdTema))
			return false;
		return true;
	}
}
