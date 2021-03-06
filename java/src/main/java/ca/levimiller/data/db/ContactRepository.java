package ca.levimiller.data.db;

import ca.levimiller.data.model.Contact;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ContactRepository extends JpaRepository<Contact, Long>,
    QuerydslPredicateExecutor<Contact> {

  Optional<Contact> findDistinctByNumber(String number);
}
