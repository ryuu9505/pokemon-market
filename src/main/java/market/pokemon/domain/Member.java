package market.pokemon.domain;

import lombok.*;

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
