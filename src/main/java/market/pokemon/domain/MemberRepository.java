package market.pokemon.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findById(long id);
    List<Member> findByName(String name);

}
