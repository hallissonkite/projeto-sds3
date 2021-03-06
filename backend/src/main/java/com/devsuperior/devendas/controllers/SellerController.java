package com.devsuperior.devendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.devendas.dto.SellerDto;
import com.devsuperior.devendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public  ResponseEntity<List<SellerDto>> findAll(){
		List<SellerDto> list= service.findAll();
		return ResponseEntity.ok(list);
	}
	

}
