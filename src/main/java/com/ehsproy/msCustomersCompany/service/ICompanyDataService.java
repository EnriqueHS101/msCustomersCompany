package com.ehsproy.msCustomersCompany.service;

import com.ehsproy.msCustomersCompany.model.CompanyData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICompanyDataService {

	public Flux<CompanyData> findAll();
	public Mono<CompanyData> findById(String id);
	public Mono<CompanyData> save(CompanyData client);
	public Mono<Void> deleteById(String id);
	
	public Mono<CompanyData> findByDocNumber(String numDoc);
}
