package hco.spring.react.sandbox.controller;

import hco.spring.react.sandbox.model.Beer;
import hco.spring.react.sandbox.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class BeerController {

    private final BeerRepository beerRepository;

    @GetMapping("/good-beers")
    @CrossOrigin(origins = {"${client.host}", "${client.hostPWA}"})
    public Collection<Beer> goodBeers() {
        return this.beerRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }
    private boolean isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");
    }
}
