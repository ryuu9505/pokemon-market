package market.pokemon.domain.login;

import lombok.RequiredArgsConstructor;
import market.pokemon.domain.member.Member;
import market.pokemon.domain.member.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /*public Member login(String accountId, String password) {
        return memberRepository.findByAccountId(accountId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }*/
}