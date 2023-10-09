package enrico.santarelli.springsocialapi.service;


import enrico.santarelli.springsocialapi.model.Account;

public interface AccountService {
    
    Account getAccount(Long id);
    void createAccount(Account account);
    Iterable<Account> getAllAccounts();
    void deleteAccount(Long id);
    
}
