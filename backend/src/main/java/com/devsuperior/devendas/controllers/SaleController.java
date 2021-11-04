package com.devsuperior.devendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.devendas.dto.SaleDto;
import com.devsuperior.devendas.dto.SaleSucessDto;
import com.devsuperior.devendas.dto.SaleSumDto;
import com.devsuperior.devendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public  ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		Page<SaleDto> list= service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller" )
	public  ResponseEntity<List<SaleSumDto>> amountGroupedBySeller(){
		List<SaleSumDto> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sucess-by-seller" )
	public  ResponseEntity<List<SaleSucessDto>> sucessGroupedBySeller(){
		List<SaleSucessDto> list = service.sucessGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	

}
