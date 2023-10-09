package enrico.santarelli.springsocialapi.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enrico.santarelli.springsocialapi.model.Account;
import enrico.santarelli.springsocialapi.repository.AccountRepository;
import enrico.santarelli.springsocialapi.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    

    @Override
    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
    
}
