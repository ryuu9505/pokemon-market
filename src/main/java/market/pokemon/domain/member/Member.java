package market.pokemon.domain.member;

import lombok.*;
import market.pokemon.domain.Order;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String accountId;
    @NotBlank
    private String password;



    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
