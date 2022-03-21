package market.pokemon.domain.item;

import market.pokemon.domain.item.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pokemon")
public class Pokemon extends Item {

    private Long pokemonId;
    private String pokemonName;
}
