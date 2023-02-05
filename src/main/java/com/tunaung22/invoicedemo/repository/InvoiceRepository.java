package com.tunaung22.invoicedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.tunaung22.invoicedemo.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
