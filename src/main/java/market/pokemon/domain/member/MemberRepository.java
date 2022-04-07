package market.pokemon.domain.member;

import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findById(long id);
    List<Member> findByName(String name);


}
