package com.tinotenda.msscbrewery.services;

import com.tinotenda.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto save(BeerDto beer);

    void updateBeer(BeerDto beerDto, UUID beerId);

    void deleteById(UUID beerId);
}
