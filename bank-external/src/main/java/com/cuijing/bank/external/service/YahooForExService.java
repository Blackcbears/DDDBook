package com.cuijing.bank.external.service;

import com.cuijing.bank.types.Currency;

import java.math.BigDecimal;

/**
 * @author CuiJIng
 * @date 2021-5-13 14:03
 */
public interface YahooForExService {
    BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency);
}
