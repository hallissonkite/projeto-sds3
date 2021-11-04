package com.devsuperior.devendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.devendas.dto.SaleDto;
import com.devsuperior.devendas.dto.SaleSucessDto;
import com.devsuperior.devendas.dto.SaleSumDto;
import com.devsuperior.devendas.entities.Sale;
import com.devsuperior.devendas.repositories.SaleRepository;

@Service
public class SaleService {

		@Autowired
		private SaleRepository repository;
		
		@Autowired
		private SaleRepository selleRrepository;
		
		@Transactional(readOnly = true) 
		public Page<SaleDto> findAll(Pageable pageable) {
			selleRrepository.findAll();
			Page<Sale> result=repository.findAll(pageable);
			return result.map(x -> new SaleDto(x));
			
		}
		
		@Transactional(readOnly = true)
		public
		List<SaleSumDto> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
			
		}
		
		@Transactional(readOnly = true)
		public
		List<SaleSucessDto> sucessGroupedBySeller(){
		return repository.sucessGroupedBySeller();
			
		}
}
