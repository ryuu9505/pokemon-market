package market.pokemon.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MemberUpdateForm {

    @NotBlank
    private String name;

}
