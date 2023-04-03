package com.credits.service;

import com.credits.dto.Message;
import com.credits.dto.CreditRequestDto;
import com.credits.dto.CreditResponseDto;
import com.credits.model.Credit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {

	Flux<Credit> getAll();

	Mono<Credit> getCreditById(String creditId);

	Mono<CreditResponseDto> createCreditPerson(CreditRequestDto creditRequestDto);
	
	Mono<CreditResponseDto> createCreditCompany(CreditRequestDto creditRequestDto);

	Mono<Credit> updateCredit(CreditRequestDto creditRequestDto);

	Mono<Message> deleteCredit(String personId);
	
	Mono<CreditResponseDto> payCredit(CreditRequestDto creditRequestDto);

	Flux<Credit> getAllCreditXCustomerId(String customerId);
	
}
