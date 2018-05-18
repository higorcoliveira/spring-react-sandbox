package hco.spring.react.sandbox.runner;

import hco.spring.react.sandbox.model.Beer;
import hco.spring.react.sandbox.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class BeeCommandLineRunner implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                this.beerRepository.save(new Beer(name))
        );
        this.beerRepository.findAll().forEach(System.out::println);
    }
}
