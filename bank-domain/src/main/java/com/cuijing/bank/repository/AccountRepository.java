package com.cuijing.bank.repository;

import com.cuijing.bank.ddd.Repository;
import com.cuijing.bank.domain.entity.Account;
import com.cuijing.bank.types.AccountId;
import com.cuijing.bank.types.AccountNumber;
import com.cuijing.bank.types.UserId;

/**
 * @author CuiJIng
 * @date 2021-5-13 10:00
 */
public interface AccountRepository extends Repository {
    Account find(AccountId id);
    Account find(AccountNumber accountNumber);
    Account find(UserId userId);
    Account save(Account account);
}
