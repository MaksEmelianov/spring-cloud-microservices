package com.javastart.account.repository;

import com.javastart.account.entiry.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
