package com.credits.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TypeAccountDto {
	private Integer id;
	private String type;
	private Double maintenance;
	private Integer transactions;
	private Integer dayOperation;
}
