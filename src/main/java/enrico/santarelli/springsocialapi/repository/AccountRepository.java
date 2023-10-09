package enrico.santarelli.springsocialapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import enrico.santarelli.springsocialapi.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
