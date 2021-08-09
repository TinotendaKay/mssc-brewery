package com.tinotenda.msscbrewery.web.controller.v2;

import com.tinotenda.msscbrewery.services.BeerService;
import com.tinotenda.msscbrewery.services.v2.BeerServiceV2;
import com.tinotenda.msscbrewery.web.model.BeerDto;
import com.tinotenda.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    private final BeerServiceV2 service;

    public BeerControllerV2(BeerServiceV2 service) {
        this.service = service;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(service.getBeerById(beerId), HttpStatus.OK);

    }

    @PostMapping // create a new beer
    public ResponseEntity handlePost(@RequestBody BeerDtoV2 beer) {
        BeerDtoV2 saveBeer = service.save(beer);
        HttpHeaders httpHeaders = new HttpHeaders();
        //todo add hostname to the url
        httpHeaders.add("Location", "/api/v1/beer/" + saveBeer.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@RequestBody BeerDtoV2 beerDto, @PathVariable("beerId") UUID beerId) {
        service.updateBeer(beerDto, beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        service.deleteById(beerId);
    }
}
