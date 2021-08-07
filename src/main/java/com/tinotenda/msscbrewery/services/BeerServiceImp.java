package com.tinotenda.msscbrewery.services;

import com.tinotenda.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImp implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Cool Beer")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beer) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Zambezi Beer")
                .beerStyle("Larger")
                .build();
    }

    @Override
    public void updateBeer(BeerDto beerDto, UUID beerId) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer with ID {}", beerId);
    }
}
