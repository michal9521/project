package pl.mmackiew.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mmackiew.project.entities.AccountEntity;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    Iterable <AccountEntity> findByName(String name);

    @Override
    List<AccountEntity> findAll();
}
