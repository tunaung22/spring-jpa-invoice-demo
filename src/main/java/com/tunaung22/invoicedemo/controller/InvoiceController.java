package com.tunaung22.invoicedemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tunaung22.invoicedemo.domain.Invoice;
import com.tunaung22.invoicedemo.dto.InvoiceCreateDto;
import com.tunaung22.invoicedemo.service.InvoiceServiceImpl;

@RestController
public class InvoiceController {

	InvoiceServiceImpl invoiceService;

	public InvoiceController(InvoiceServiceImpl service) {
		this.invoiceService = service;
	}

	@PostMapping("/api/invoices")
	public ResponseEntity<Invoice> postInvoice(@RequestBody InvoiceCreateDto request) {
		return new ResponseEntity<Invoice>(invoiceService.save(request), HttpStatus.CREATED);
	}

	@GetMapping("/api/invoices")
	public ResponseEntity<Iterable<Invoice>> getInvoices() {
		return new ResponseEntity<Iterable<Invoice>>(invoiceService.findAll(), HttpStatus.OK);
	}

}
