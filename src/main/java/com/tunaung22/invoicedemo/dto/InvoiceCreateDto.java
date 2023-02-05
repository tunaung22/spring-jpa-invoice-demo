package com.tunaung22.invoicedemo.dto;

import com.tunaung22.invoicedemo.domain.Invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceCreateDto {

	private Invoice invoice;
	
}
