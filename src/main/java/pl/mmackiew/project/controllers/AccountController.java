package pl.mmackiew.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.mmackiew.project.models.AccountModel;
import pl.mmackiew.project.models.Response;
import pl.mmackiew.project.services.AccountService;



@RestController
@RequestMapping("accounts/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, value = "allAccounts/")
    public Response getAllAccounts() {
        Iterable<AccountModel> accounts = accountService.findAll();
        return new Response("Done", accounts);
    }

    @RequestMapping(method = RequestMethod.GET, value = "account/{accountName}")
    public Response getAccountByName(@PathVariable String accountName) {
        Iterable<AccountModel> accounts = accountService.findByName(accountName);
        return new Response("Done", accounts);
    }
}
