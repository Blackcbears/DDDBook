package com.cuijing.bank.domain.service;

import com.cuijing.bank.domain.entity.Account;
import com.cuijing.bank.types.ExchangeRate;
import com.cuijing.bank.types.Money;
/**
 * @author CuiJIng
 * @date 2021-5-13 9:46
 */
public interface AccountTransferService {
    void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate);
}
