package com.credits.controller;

import com.credits.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credits.dto.CreditCardRequestDto;
import com.credits.dto.CreditCardResponseDto;
import com.credits.dto.Message;
import com.credits.model.CreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {
	
	@Autowired
    private CreditCardService creditcardService;
	
	/**
	 * Obtiene todas las tarjetas de crédito
	 * @return Flux<CreditCard>
	 */
	@GetMapping
    public Flux<CreditCard> getAll(){
		return creditcardService.getAll();
    }
	
	/**
	 * Obtiene una tarjeta de crédito por su id 
	 * @param creditId
	 * @return Mono<CreditCard>
	 */
	@GetMapping("/{creditId}")
    public Mono<CreditCard> getCreditCardById(@PathVariable String creditId){
		return creditcardService.getCreditCardById(creditId);
    }
	
	/**
	 * Registro de una tarjeta de crédito personal
	 * @param creditCardRequestDto
	 * @return Mono<CreditCardResponseDto>
	 */
	@PostMapping("/person")
    public Mono<CreditCardResponseDto> createCreditCardPerson(@RequestBody CreditCardRequestDto creditCardRequestDto){
		return creditcardService.createCreditCardPerson(creditCardRequestDto);
    }
	
	/**
	 * Registro de una tarjeta de crédito empresarial
	 * @param creditCardRequestDto
	 * @return Mono<CreditCardResponseDto>
	 */
	@PostMapping("/company")
    public Mono<CreditCardResponseDto> createCreditCardCompany(@RequestBody CreditCardRequestDto creditCardRequestDto){
		return creditcardService.createCreditCardCompany(creditCardRequestDto);
    }
	
	/**
	 * Actualización de una tarjeta de crédito
	 * @param creditCardRequestDto
	 * @return Mono<CreditCard>
	 */
	@PutMapping
	public Mono<CreditCard> updateCCreditCard(@RequestBody CreditCardRequestDto creditCardRequestDto){
		return creditcardService.updateCreditCard(creditCardRequestDto);
    }
	
	/**
	 * Eliminación de una tarjeta de crédito
	 * @param creditId
	 * @return Mono<Message>
	 */
	@DeleteMapping("/{creditId}")
	public Mono<Message> deleteCreditCard(@PathVariable String creditId){
		return creditcardService.deleteCreditCard(creditId);
    }
	
	/**
	 * Pago de una tarjeta de crédito
	 * @param creditCardRequestDto
	 * @return Mono<CreditCardResponseDto>
	 */
	@PostMapping("/pay")
    public Mono<CreditCardResponseDto> payCreditCard(@RequestBody CreditCardRequestDto creditCardRequestDto){
		return creditcardService.payCreditCard(creditCardRequestDto);
    }
	
	/**
	 * Consumo de una tarjeta de crédito
	 * @param creditCardRequestDto
	 * @return Mono<CreditCardResponseDto>
	 */
	@PostMapping("/consume")
    public Mono<CreditCardResponseDto> consumeCreditCard(@RequestBody CreditCardRequestDto creditCardRequestDto){
		return creditcardService.consumeCreditCard(creditCardRequestDto);
    }
	
	/**
	 * Obtiene las tarjetas de crédito por el id del cliente
	 * @param customerId
	 * @return Flux<CreditCard>
	 */
	@GetMapping("/consult/{customerId}")
    public Flux<CreditCard> getAllCreditCardXCustomerId(@PathVariable String customerId){
		return creditcardService.getAllCreditCardXCustomerId(customerId);
    }
	
}
