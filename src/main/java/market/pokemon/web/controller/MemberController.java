package market.pokemon.web.controller;

import lombok.RequiredArgsConstructor;
import market.pokemon.domain.member.Member;
import market.pokemon.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members/new")
    public String createForm(@ModelAttribute Member member, Model model) {

        return "mambers/createMemberForm";
    }


}
