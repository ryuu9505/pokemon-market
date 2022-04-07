package market.pokemon.domain.member;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MemberUpdateForm {

    @NotBlank
    private String name;

}
