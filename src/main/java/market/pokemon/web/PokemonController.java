package market.pokemon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {

    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
