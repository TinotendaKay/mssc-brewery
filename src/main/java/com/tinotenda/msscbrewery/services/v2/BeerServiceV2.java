package com.tinotenda.msscbrewery.services.v2;

import com.tinotenda.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 save(BeerDtoV2 beer);

    void updateBeer(BeerDtoV2 beerDto, UUID beerId);

    void deleteById(UUID beerId);
}
