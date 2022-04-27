package com.eventoapp.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String rg;
	private String nome;
	
	@ManyToOne
	private Evento evento;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Convidado() {
		
	}

	public Convidado(String rg, String nome, Evento evento) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.evento = evento;
	}
	
	
	
}