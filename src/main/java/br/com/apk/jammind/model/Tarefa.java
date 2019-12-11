package br.com.apk.jammind.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="tarefa")
public class Tarefa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tarefa")
	private Integer idTarefa;
	
	@Column(name= "nome_tarefa")
	private String nomeTarefa;
	
	@Column(name = "nome_pergunta")
	private String nomePergunta;
	
	@Column(name = "opcao_a")
	private String opcaoA;
	
	@Column(name = "opcao_b")
	private String opcaoB;
	
	@Column(name = "opcao_c")
	private String opcaoC;
	
	@Column(name = "opcao_d")
	private String opcaoD;
	
	private Character resposta;
	
	@Transient
	private boolean concluido;
	
	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getNomePergunta() {
		return nomePergunta;
	}

	public void setNomePergunta(String nomePergunta) {
		this.nomePergunta = nomePergunta;
	}

	public String getOpcaoA() {
		return opcaoA;
	}

	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}

	public String getOpcaoB() {
		return opcaoB;
	}

	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}

	public String getOpcaoC() {
		return opcaoC;
	}

	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}

	public String getOpcaoD() {
		return opcaoD;
	}

	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}

	public Character getResposta() {
		return resposta;
	}

	public void setResposta(Character resposta) {
		this.resposta = resposta;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTarefa == null) ? 0 : idTarefa.hashCode());
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
		Tarefa other = (Tarefa) obj;
		if (idTarefa == null) {
			if (other.idTarefa != null)
				return false;
		} else if (!idTarefa.equals(other.idTarefa))
			return false;
		return true;
	}

}
