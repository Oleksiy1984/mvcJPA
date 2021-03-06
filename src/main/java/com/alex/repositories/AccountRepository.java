package com.alex.repositories;

import com.alex.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAccountsByBalanceGreaterThanEqual(BigDecimal amount);
}
