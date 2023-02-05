package com.tunaung22.invoicedemo.service;

import com.tunaung22.invoicedemo.domain.Invoice;
import com.tunaung22.invoicedemo.dto.InvoiceCreateDto;

public interface InvoiceService {
	
	Invoice save(InvoiceCreateDto request);
	
	Iterable<Invoice> findAll();
	
}
