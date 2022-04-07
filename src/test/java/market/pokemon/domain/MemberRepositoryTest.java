package market.pokemon.domain;

import market.pokemon.domain.member.Member;
import market.pokemon.domain.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void save() throws Exception{
        Member member = new Member();
        member.setName("kim");

        Member savedMember = memberRepository.save(member);
        Assertions.assertThat(member).isEqualTo(savedMember);
    }

}