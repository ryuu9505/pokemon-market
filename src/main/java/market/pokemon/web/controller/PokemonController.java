package market.pokemon.web.controller;

import market.pokemon.domain.item.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class PokemonController {

    @GetMapping("/form")
    public String form() {
        return "form";
    }

/*    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model) {

        return "item";
    }*/

}
