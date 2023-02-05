package com.tunaung22.invoicedemo.service;

import org.springframework.stereotype.Service;

import com.tunaung22.invoicedemo.domain.Invoice;
import com.tunaung22.invoicedemo.dto.InvoiceCreateDto;
import com.tunaung22.invoicedemo.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	InvoiceRepository invoiceRepo;
	
	public InvoiceServiceImpl(InvoiceRepository repo) {
		this.invoiceRepo = repo;
	}
	
	@Override
	public Invoice save(InvoiceCreateDto request) {
		return invoiceRepo.save(request.getInvoice());
	}
	
	@Override
	public Iterable<Invoice> findAll() {
		return invoiceRepo.findAll();
	}

}
