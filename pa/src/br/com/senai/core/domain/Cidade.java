package br.com.senai.core.domain;

import java.util.Objects;

public class Cidade {
	
	private int id;
	
	private String nome ; 
	
	private String uf;

	public Cidade(int id, String nome, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}

	public Cidade(String nome, String uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return id == other.id;
	}
	
	

}
