package market.pokemon.domain.member;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MemberSaveForm {

    @NotBlank
    private String name;

}
