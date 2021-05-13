package com.cuijing.bank.application;

import com.cuijing.bank.ddd.ApplicationService;
import com.cuijing.bank.domain.entity.Account;

import java.math.BigDecimal;

/**
 * @author CuiJIng
 * @date 2021-5-13 10:29
 */
public interface TransferService extends ApplicationService {
    boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) ;

    String createAccount(String accountNumber,String currency,BigDecimal dailyLimit) ;
}
