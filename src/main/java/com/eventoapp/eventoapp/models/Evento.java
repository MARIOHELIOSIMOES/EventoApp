package com.eventoapp.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


@Entity
public class Evento implements Serializable{

	
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@NotEmpty
	private String nome, local, data, horario ;

	@OneToMany
	private List<Convidado> convidados;
	
	
	public Evento() {
	}
	

	public Evento(long codigo, String nome, String local, String data, String horario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}


	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}


	public List<Convidado> getConvidados() {
		return convidados;
	}


	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}
	
	
}
