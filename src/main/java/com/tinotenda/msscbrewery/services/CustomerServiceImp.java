package com.tinotenda.msscbrewery.services;

import com.tinotenda.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImp implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Tino")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Tinotenda")
                .build();
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customer, UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Tino")
                .build();
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleted customer with id: {} ", customerId);
    }
}
