package pl.mmackiew.project.models;

import pl.mmackiew.project.entities.AccountEntity;

import java.io.Serializable;

public class AccountModel implements Serializable{

    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;

    public AccountModel(AccountEntity accountEntity) {
        this.id = accountEntity.getId();
        this.login = accountEntity.getLogin();
        this.password = accountEntity.getPassword();
        this.name = accountEntity.getName();
        this.surname = accountEntity.getSurname();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
