package pl.mmackiew.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import pl.mmackiew.project.entities.AccountEntity;
import pl.mmackiew.project.models.AccountModel;
import pl.mmackiew.project.repositories.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AccountServiceImpl implements  AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<AccountModel> findByName(String name) {
        Iterable<AccountEntity> accountEntities = accountRepository.findByName(name);
        List<AccountModel> accountModels = new ArrayList<AccountModel>();
        accountEntities.forEach(accountEntity -> accountModels.add(new AccountModel(accountEntity)));
        return accountModels;
    }

    @Override
    public List<AccountModel> findAll() {
        Iterable<AccountEntity> accountEntities = accountRepository.findAll();
        List<AccountModel> accountModels = new ArrayList<AccountModel>();
        accountEntities.forEach(accountEntity -> accountModels.add(new AccountModel(accountEntity)));
        return accountModels;
    }
}
