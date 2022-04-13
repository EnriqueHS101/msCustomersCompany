package com.ehsproy.msCustomersCompany.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.msCustomersCompany.model.CompanyData;

import reactor.core.publisher.Mono;

public interface ICompanyDataRepository extends ReactiveCrudRepository<CompanyData, String> {

	Mono<CompanyData> findByDocNumber(String numDoc);
}
