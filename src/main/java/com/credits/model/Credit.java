package com.credits.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="credit")
public class Credit {
	@Id
	private String id;
	@NotEmpty
	private String customerId;
	@NotEmpty
	@JsonIgnore
	private Integer typeAccount;
	private String descripTypeAccount;
	@NotEmpty
	private Double creditAmount;
	@NotEmpty
	private Double existingAmount;
	private LocalDateTime creditDate;
	
	private String typeCustomer;
}
