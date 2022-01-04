package co.com.alejandrom.holamundo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@RestController
@RequestMapping("api/test")
public class TestService {

    @GetMapping("/")
    public Mono<String> test() {

        return Flux.fromIterable(Arrays.asList(
                        Hola.builder().nombre("hola").build(),
                        Hola.builder().nombre("Mundo").build()))
                .map(Hola::getNombre)
                .collectList()
                .map(list -> String.join(" ", list));
    }
}
