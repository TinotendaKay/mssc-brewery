package com.tinotenda.msscbrewery.services;

import com.tinotenda.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID customerId);

    CustomerDto createCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(CustomerDto customer, UUID customerId);

    void deleteCustomerById(UUID customerId);
}
