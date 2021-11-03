package com.devsuperior.devendas.dto;

import java.io.Serializable;

import com.devsuperior.devendas.entities.Seller;

public class SellerDto implements  Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDto() {
		
	}
	
	public SellerDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public SellerDto(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
