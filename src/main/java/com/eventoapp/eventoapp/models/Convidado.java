package com.eventoapp.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@NotBlank(message="Campo não pode estar vazio")
	@Size(min = 2, max = 12, message = "Campo necessita de 2 a 12 caracteres")
	private String rg;
	@NotBlank
	private String nome;
	
	@NotEmpty
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
