package com.tinotenda.msscbrewery.services.v2;

import com.tinotenda.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 save(BeerDtoV2 beer) {
        return null;
    }

    @Override
    public void updateBeer(BeerDtoV2 beerDto, UUID beerId) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
