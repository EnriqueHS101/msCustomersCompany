package com.ehsproy.msCustomersCompany.service.impl;

import org.springframework.stereotype.Service;

import com.ehsproy.msCustomersCompany.model.CompanyData;
import com.ehsproy.msCustomersCompany.repository.ICompanyDataRepository;
import com.ehsproy.msCustomersCompany.service.ICompanyDataService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CompanyDataServiceImpl implements ICompanyDataService {

	private final ICompanyDataRepository infoEmpRepo;

	@Override
	public Flux<CompanyData> findAll() {
		return infoEmpRepo.findAll();
	}

	@Override
	public Mono<CompanyData> findById(String id) {
		return infoEmpRepo.findById(id);
	}

	@Override
	public Mono<CompanyData> save(CompanyData client) {
		return infoEmpRepo.save(client);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return infoEmpRepo.deleteById(id);
	}

	@Override
	public Mono<CompanyData> findByDocNumber(String numDoc) {
		return infoEmpRepo.findByDocNumber(numDoc);
	}
	
	
}
