package com.ehsproy.msCustomersCompany.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.msCustomersCompany.model.CompanyData;
import com.ehsproy.msCustomersCompany.service.ICompanyDataService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/customerc")
@RequiredArgsConstructor
public class CompanyDataController {
	
	private final ICompanyDataService infoEmpService;
	
	@GetMapping
	public Flux<CompanyData> findAll(){
		return infoEmpService.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<CompanyData> findById(@PathVariable String id){
		return infoEmpService.findById(id);
	}
	
	@PostMapping
	public Mono<CompanyData> save(@RequestBody CompanyData client){
		log.info("grabado");
		return infoEmpService.save(client);
	}
	
	@PutMapping
	public Mono<CompanyData> put(@RequestBody CompanyData client){
		return infoEmpService.save(client);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable String id){
		return infoEmpService.deleteById(id);
	}
	
	@GetMapping("/busca/{numDoc}")
	public Mono<CompanyData> findByDocNumber(@PathVariable String numDoc){
		return infoEmpService.findByDocNumber(numDoc);
	}

}
