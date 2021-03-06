package com.devsuperior.devendas.dto;

import java.io.Serializable;

import com.devsuperior.devendas.entities.Seller;

public class SaleSucessDto implements Serializable{
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDto() {
		
	}
	
	

	public SaleSucessDto(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}



	public String getSellerName() {
		return sellerName;
	}



	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}



	public Long getVisited() {
		return visited;
	}



	public void setVisited(Long visited) {
		this.visited = visited;
	}



	public Long getDeals() {
		return deals;
	}



	public void setDeals(Long deals) {
		this.deals = deals;
	}
    
	
    
}
