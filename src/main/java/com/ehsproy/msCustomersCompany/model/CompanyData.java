package com.ehsproy.msCustomersCompany.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("CompanyData")
public class CompanyData {

	@Id
	private String id;
	@Indexed(unique = true)
	private String docNumber;
	private String razonSocial;
	private String telephoneNumber;
	private String address;
	private String agentFirstName;
	private String agentLastName;
	private String email;

}
