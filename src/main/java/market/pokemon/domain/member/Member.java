package market.pokemon.domain.member;

import lombok.*;
import market.pokemon.domain.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    private String name;


    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
