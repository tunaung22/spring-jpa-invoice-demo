package com.tunaung22.invoicedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.tunaung22.invoicedemo.domain.InvoiceItem;

public interface InvoiceItemRepository extends CrudRepository<InvoiceItem, Long> {

}
