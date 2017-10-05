package pl.mmackiew.project.services;

import org.springframework.data.domain.Sort;
import pl.mmackiew.project.entities.AccountEntity;
import pl.mmackiew.project.models.AccountModel;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<AccountModel> findByName(String name);
    List<AccountModel> findAll();
}
