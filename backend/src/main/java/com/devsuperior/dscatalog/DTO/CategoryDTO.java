package com.devsuperior.dscatalog.DTO;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO {

	private Long id;
	private String nome;
	
	public CategoryDTO(){}
	
	public CategoryDTO(Long id, String nome) {
		this.id = id;
		this.nome =  nome;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
