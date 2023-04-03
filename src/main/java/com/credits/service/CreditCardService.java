package com.credits.service;

import com.credits.dto.CreditCardRequestDto;
import com.credits.dto.CreditCardResponseDto;
import com.credits.dto.Message;
import com.credits.model.CreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardService {

	Flux<CreditCard> getAll();

	Mono<CreditCard> getCreditCardById(String creditCardId);

	Mono<CreditCardResponseDto> createCreditCardPerson(CreditCardRequestDto creditCardRequestDto);
	
	Mono<CreditCardResponseDto> createCreditCardCompany(CreditCardRequestDto creditCardRequestDto);

	Mono<CreditCard> updateCreditCard(CreditCardRequestDto creditCardRequestDto);

	Mono<Message> deleteCreditCard(String creditCardId);
	
	Mono<CreditCardResponseDto> payCreditCard(CreditCardRequestDto creditRequestDto);
	
	Mono<CreditCardResponseDto> consumeCreditCard(CreditCardRequestDto creditRequestDto);

	Flux<CreditCard> getAllCreditCardXCustomerId(String customerId);

}
